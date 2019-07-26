package com.westos.student.service;

import com.westos.student.dao.StudentDAO;
import com.westos.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> listStudent(Student student) {
        if(student==null){
            student=new Student();
        }
        return studentDAO.listStudent(student);
    }

    public Integer addStudent(Student student) {
        return studentDAO.addStudent(student);
    }

    public Integer updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }
}
