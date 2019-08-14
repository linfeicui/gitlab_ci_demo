package org.virtuex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.virtuex.dao.StudentRepository;
import org.virtuex.pojo.Student;
import org.virtuex.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student ) {
        studentRepository.delete(student);
    }


}
