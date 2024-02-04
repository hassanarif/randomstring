package com.interview.randomstring.randomstring.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "randomstrings")
public class RandomStringEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="randomstring")
    private String randomString;

    private LocalDateTime insertTime;

    public RandomStringEntity(Long id, String randomString, LocalDateTime insertTime) {
        this.id = id;
        this.randomString = randomString;
        this.insertTime = insertTime;
    }

    public RandomStringEntity() {

    }

    public RandomStringEntity(String randomString, LocalDateTime insertTime) {
        this.randomString = randomString;
        this.insertTime = insertTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
}
