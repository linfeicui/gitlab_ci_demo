package org.virtuex.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.virtuex.dao.StudentRepository;
import org.virtuex.pojo.Student;
import org.virtuex.service.impl.StudentServiceImpl;


@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @ResponseBody
    @RequestMapping(value = "/students", method = {RequestMethod.POST})
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "OK";
    }
}
