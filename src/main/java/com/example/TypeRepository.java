package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {

    List<Type> findById(int id);
    
}
