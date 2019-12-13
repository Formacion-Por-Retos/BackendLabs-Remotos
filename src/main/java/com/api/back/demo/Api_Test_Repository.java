package com.api.back.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Api_Test_Repository extends JpaRepository<Api_Test, Integer> {
}
