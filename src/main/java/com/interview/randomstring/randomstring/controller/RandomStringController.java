package com.interview.randomstring.randomstring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.randomstring.randomstring.entity.RandomStringEntity;
import com.interview.randomstring.randomstring.entity.RandomStringService;
import com.interview.randomstring.randomstring.entity.RandomStringsDTO;
import com.interview.randomstring.randomstring.model.ApiResponse;
import com.interview.randomstring.randomstring.model.UIDataModel;
import com.interview.randomstring.randomstring.model.MetaData;
import com.interview.randomstring.randomstring.model.RandomStringDataModel;
import com.interview.randomstring.randomstring.util.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RandomStringController {
    private final RandomStringService randomStringService;

    @Autowired
    public RandomStringController(RandomStringService randomStringService) {
        this.randomStringService = randomStringService;
    }

    @GetMapping("/string-generator")
    public String mainForm(Model model) {
        model.addAttribute("uidatamodel", new UIDataModel());
        return "string-generator";
    }

    @PostMapping("/string-generator")
    public String mainFormSubmit(@ModelAttribute UIDataModel uiDataModel, Model model) {
        model.addAttribute("uidatamodel", uiDataModel);
        return "database-results";
    }

    @GetMapping("/results")
    public String showResultsPage(Model model, @RequestParam(name = "data") String jsonData,
                                  @RequestParam(name = "numberOfLines") String numberOfLines,
                                  @RequestParam(name = "stringsLength") String stringsLength) throws JsonProcessingException {
        // Parse JSON data and add it to the model
        model.addAttribute("data", parseJsonData(jsonData));

        // Add numberOfLines and stringsLength to the model
        model.addAttribute("numberOfLines", numberOfLines);
        model.addAttribute("stringsLength", stringsLength);

        return "results";
    }

    private RandomStringDataModel parseJsonData(String jsonData) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        RandomStringDataModel randomStringData = objectMapper.readValue(jsonData, RandomStringDataModel.class);
        return randomStringData;
    }

    @GetMapping("/random")
    @ResponseBody
    public ApiResponse generateRandomStrings(@RequestParam int n, @RequestParam int len,
                                             @RequestParam boolean includeUpperCase, @RequestParam boolean includeLowerCase,
                                             @RequestParam boolean includeIntegers, @RequestParam boolean uniqueStrings) {
        String[] randomStrings = RandomStringGenerator.getRandomStrings(n, len, includeUpperCase, includeLowerCase, includeIntegers, uniqueStrings);
        List<RandomStringEntity> savedEntities = randomStringService.saveRandomStrings(randomStrings);
        return new ApiResponse("success", randomStrings, new MetaData("1.0", n, len));
    }

    @GetMapping("/read-from-database")
    public ResponseEntity<List<RandomStringsDTO>> readFromDatabase() {
        List<RandomStringsDTO> databaseStrings = randomStringService.readFromDatabase();
        return new ResponseEntity<>(databaseStrings, HttpStatus.OK);
    }

}
