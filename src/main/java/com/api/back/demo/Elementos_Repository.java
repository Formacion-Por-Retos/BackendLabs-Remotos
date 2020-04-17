package com.api.back.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Elementos_Repository extends JpaRepository<Elementos, Integer> {
    Elementos findById(int id);
}

