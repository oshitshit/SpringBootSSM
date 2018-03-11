package com.example.Controller;


import com.example.Dao.StudentMapper;
import com.example.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/demo")
    public Student get(){
        Student student=studentMapper.getStudentByID(2);
        return  student;
    }

    @RequestMapping(value = "res")
    public String df(){
        return "Hello";
    }
}