package com.westos.student.controller;

import com.westos.student.entity.Student;
import com.westos.student.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {

    @Autowired
    private StudentServiceInterface studentService;
    /**
     * 前后端分离时一般在api层会给出http状态码
     * @param student
     * @return
     */
    @RequestMapping("/listStudent.do")
    public ResponseEntity<List<Student>> listStudent(Student student){
        List<Student> result = studentService.listStudent(student);
        return new ResponseEntity<List<Student>>(result,HttpStatus.OK);
    }

    /*@RequestMapping("/addStudent.do")
    public ResponseEntity<Integer> addStudent(Student student){
        Integer i=studentService.addStudent(student);
        return new ResponseEntity<Integer>(i,HttpStatus.OK);
    }

    @RequestMapping("/updateStudent.do")
    public ResponseEntity<Integer> updateStudent(Student student){
        Integer i=studentService.updateStudent(student);
        return new ResponseEntity<Integer>(i,HttpStatus.OK);
    }*/
}
