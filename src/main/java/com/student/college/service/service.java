package com.student.college.service;

import com.student.college.dow.stu_repo;
import com.student.college.dow.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Service
public class service {
    @Autowired
    stu_repo repo;
    public boolean insert_stu(student s){
        repo.save(s);
        return true;
    }
    public List<student> alstudent(){

      List<student> st=repo.findAll();

      return st;
    }

    public void s_del(Integer i){

         repo.deleteById(i);




    }

}
