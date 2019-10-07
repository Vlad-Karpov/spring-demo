package com.example.spring.data.example.ds2.repository;

import com.example.spring.data.example.ds2.domain.Entity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ds2Repository extends JpaRepository<Entity2, Long> {
}
