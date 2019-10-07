package com.example.spring.data.example.ds1.repository;

import com.example.spring.data.example.ds1.domain.Entity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ds1Repository extends JpaRepository<Entity1, Long> {
}
