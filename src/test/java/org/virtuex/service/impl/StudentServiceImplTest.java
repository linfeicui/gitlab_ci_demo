package org.virtuex.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.virtuex.pojo.Student;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    @Autowired
    private StudentServiceImpl studentService;

    Student student;
    @Before
    public void setUp(){
        student = new Student();
        student.setAge(11);
        student.setGender(1);
        student.setStudentName("test");

    }

    @Test
    public void testAddStudent(){
        studentService.addStudent(student);
    }

    /**
     * 需要删除垃圾数据，可以使用@Transactional注解
     * 但是不确定进行CI的mysql使用的引擎支不支持，就通过代码删掉
     */
    @After
    public void tearDown(){
        studentService.deleteStudent(student);
    }
}