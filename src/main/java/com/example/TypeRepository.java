package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findById(int id);
    
    List<Type> findByType(String Type);
    
}
