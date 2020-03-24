package com.api.back.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estados_Repository extends JpaRepository<Estados, Integer> {

  Estados findById(int id);

}
