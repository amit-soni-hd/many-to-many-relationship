package com.example.student.student.controller;

import com.example.student.student.DataService;
import com.example.student.student.entity.Student;
import com.example.student.student.entity.Teacher;
import com.example.student.student.service.StudentService;
import com.example.student.student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private DataService dataService;
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/student/getAll")
    public ResponseEntity<List<Student>> getAllStudent() {

        return ResponseEntity.status(200).body(studentService.getAllStudent());
    }

    @GetMapping("/teacher/getAll")
    public ResponseEntity<List<Teacher>> getAllTeacher() {

        return ResponseEntity.status(200).body(teacherService.getAllTeacher());
    }

    @PostMapping("/addData")
    public ResponseEntity<String> addData() {

        return ResponseEntity.status(200).body(dataService.addData());
    }

}
