package com.dci.mvc_lesson;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping
    public String home(Model model){
        Student student1 = new Student(1,"Mihai","miahi@gmail.com",false);
        model.addAttribute("student",student1);
        return "home";
    }

    @GetMapping("/students")
    public String students(Model model){
        List<Student> students = List.of(
                new Student(1,"Mihai","miahi@gmail.com",true),
                new Student(2,"Aron","Aron@gmail.com",true),
                new Student(3,"Maryam","Maryam@gmail.com",true),
                new Student(4,"Marcel","Marcel@gmail.com",true)
        );




        model.addAttribute("students",students);

        return "students";
    }
}
