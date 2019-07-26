package com.westos.student.service;

import com.westos.student.entity.Student;

import java.util.List;

public interface StudentServiceInterface {

    List<Student> listStudent(Student student);

    Integer addStudent(Student student);

    Integer updateStudent(Student student);
}
