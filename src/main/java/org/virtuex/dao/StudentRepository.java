package org.virtuex.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.virtuex.pojo.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}