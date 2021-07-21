package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {

    public void insertStudent(Student student);

    public List<Student> selectStudent();
}
