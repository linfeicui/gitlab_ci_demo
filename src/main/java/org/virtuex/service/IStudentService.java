package org.virtuex.service;

import org.springframework.stereotype.Service;
import org.virtuex.pojo.Student;

public interface IStudentService {
    /**
     * 添加学生信息
     * @param student
     */
    void addStudent(Student student);

    /**
     * 删除学生信息
     * @param student
     */
    void deleteStudent(Student student );
}
