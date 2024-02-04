package com.interview.randomstring.randomstring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RandomStringService {

    private final RandomStringRepository randomStringRepository;

    @Autowired
    public RandomStringService(RandomStringRepository randomStringRepository) {
        this.randomStringRepository = randomStringRepository;
    }

    public List<RandomStringEntity> saveRandomStrings(String[] randomStrings) {
        LocalDateTime insertTime = LocalDateTime.now();

        // Save each random string to the database
        return randomStringRepository.saveAll(Arrays.stream(randomStrings)
                .map(randomString -> new RandomStringEntity(randomString, insertTime))
                .toList());
    }

    public List<RandomStringsDTO> readFromDatabase() {
        List<RandomStringEntity> entities = randomStringRepository.findAll(); // Modify as needed
        return entities.stream()
                .map(entity -> new RandomStringsDTO(entity.getId(), entity.getRandomString(), entity.getInsertTime()))
                .collect(Collectors.toList());
    }
}
