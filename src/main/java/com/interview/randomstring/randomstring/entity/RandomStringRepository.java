package com.interview.randomstring.randomstring.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomStringRepository extends JpaRepository<RandomStringEntity, Long> {
}
