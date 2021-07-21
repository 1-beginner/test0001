package com.bjpowernode.service.imp;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao dao;
    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public List<Student> findStudent() {
        return null;
    }
}
