package com.example.doraAmei.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.doraAmei.model.Task;

@Controller
public class homeController {

    List<Task> tasks = new ArrayList<>();

    @GetMapping("/Login")
    public String Login() {
        return "Login";
    }
    @GetMapping("/Cadastro")
    public String Cadastro() {
        return "Cadastro";
    }


    @PostMapping("/Login")
    public String login(Task task) {
        Long id = tasks.size() + 1L;
        tasks.add(new Task(id, task.getName(), task.getPassword()));

        return "redirect:/Principal";
    }

    @GetMapping("/Principal")
    public String publicar() {
        return "Principal";
    }

}
