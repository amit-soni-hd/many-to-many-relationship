package com.example.student.student.service;

import com.example.student.student.entity.Teacher;
import com.example.student.student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).get();
    }

    public List<Teacher> addAll(List<Teacher> teachers) {
        return teacherRepository.saveAll(teachers);
    }
}
