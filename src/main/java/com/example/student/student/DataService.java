package com.example.student.student;

import com.example.student.student.entity.Student;
import com.example.student.student.entity.Teacher;
import com.example.student.student.service.StudentService;
import com.example.student.student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DataService {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    public String addData() {

        Student student1 = new Student("Amit1");
        Student student2 = new Student("Amit2");
        Student student3 = new Student("Amit3");
        Student student4 = new Student("Amit4");
        Student student5 = new Student("Amit5");

        Teacher teacher1 = new Teacher("Krishna");
        Teacher teacher2 = new Teacher("Krishna");
        Teacher teacher3 = new Teacher("Krishna");
        Teacher teacher4 = new Teacher("Krishna");
        Teacher teacher5 = new Teacher("Krishna");

        studentService.addAll(List.of(student1, student2, student3, student4, student5));
        teacherService.addAll(List.of(teacher1, teacher2, teacher3, teacher4, teacher5));

        student1.setTeachers(Set.of(teacher1, teacher2, teacher3, teacher4, teacher5));
        student2.setTeachers(Set.of(teacher1, teacher2, teacher3, teacher4, teacher5));
        student3.setTeachers(Set.of(teacher1, teacher2, teacher3, teacher4, teacher5));
        student4.setTeachers(Set.of(teacher1, teacher2, teacher3, teacher4, teacher5));
        student5.setTeachers(Set.of(teacher1, teacher2, teacher3, teacher4, teacher5));

        teacher1.setStudents(Set.of(student1, student2, student3, student4, student5));
        teacher2.setStudents(Set.of(student1, student2, student3, student4, student5));
        teacher3.setStudents(Set.of(student1, student2, student3, student4, student5));
        teacher4.setStudents(Set.of(student1, student2, student3, student4, student5));
        teacher5.setStudents(Set.of(student1, student2, student3, student4, student5));

        studentService.addAll(List.of(student1, student2, student3, student4, student5));
        teacherService.addAll(List.of(teacher1, teacher2, teacher3, teacher4, teacher5));


        return "Successfully added";
    }

}
