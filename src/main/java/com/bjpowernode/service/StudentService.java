package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student);

    public List<Student> findStudent();
}
