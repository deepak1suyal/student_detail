package com.student.college.controler;

import com.student.college.dow.student;
import com.student.college.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("api")
public class controler {
    @Autowired
    service sev;
    @PutMapping("stu")
    public boolean put(@RequestBody student s){
        return sev.insert_stu(s);
    }
    @GetMapping("al")
    public String gett(){
        String d="Don";
        return d;
    }
    @GetMapping("allstu")
    public List<student> get(){
        return sev.alstudent();
    }

    @DeleteMapping("dell")
    public String studele(@RequestParam Integer id){
 sev.s_del(id);
return "done";
    }
}
