package com.hallth.service;

import com.hallth.domain.Student;

public interface StudentService {

    Student userCheck(Student student);

    int insert(Student record);

    int updateStudent(Student student);

    Student quetyByUserName(Student student);

    boolean updateByStudentName(Student student);

}
