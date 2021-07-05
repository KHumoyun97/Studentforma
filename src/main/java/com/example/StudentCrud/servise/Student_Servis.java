package com.example.StudentCrud.servise;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.repostory.Student_Repostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_Servis {
    @Autowired
    private Student_Repostory repo;

    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student std) {
        repo.save(std);
    }

    public Student get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
