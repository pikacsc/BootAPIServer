package com.websquare.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websquare.server.model.Student;

public interface StdRepository extends JpaRepository<Student, Long>{

}
