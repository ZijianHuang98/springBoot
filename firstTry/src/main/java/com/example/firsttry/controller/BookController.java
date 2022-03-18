package com.example.firsttry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")

public class BookController {
    @GetMapping
    public String getById(){
        System.out.println("Here is the book page ! ");
        return "springboot is running !!! ,and here is home page !";
    }
    @RequestMapping("/addbooks")
    public String addStudent()
    { return "add some books"; }
    @RequestMapping("/getallbooks")
    public String getStudents()
    { return "here is all books"; }


}
