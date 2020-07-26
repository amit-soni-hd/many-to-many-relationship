package com.example.student.student.service;

import com.example.student.student.entity.Student;
import com.example.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public List<Student> addAll(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
}
