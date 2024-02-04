package com.interview.randomstring.randomstring.entity;

import java.time.LocalDateTime;

public class RandomStringsDTO {
    private Long id;
    private String randomstring;
    private LocalDateTime insertTime;

    public RandomStringsDTO() {
    }

    public RandomStringsDTO(Long id, String randomstring, LocalDateTime insertTime) {
        this.id = id;
        this.randomstring = randomstring;
        this.insertTime = insertTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRandomstring() {
        return randomstring;
    }

    public void setRandomstring(String randomstring) {
        this.randomstring = randomstring;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
}
