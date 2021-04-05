package com.sumit.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<com.sumit.pack.entities.Employee, Integer> {

    public List<com.sumit.pack.entities.Employee> findByName(String name);
}
