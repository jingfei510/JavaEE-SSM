package com.westos.student.dao;

import com.westos.student.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> listStudent(Student student);

    Integer addStudent(Student student);

    Integer updateStudent(Student student);

}
