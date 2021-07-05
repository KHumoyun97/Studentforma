package com.example.StudentCrud.repostory;

import com.example.StudentCrud.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface     Student_Repostory extends JpaRepository<Student, Long> {
}
