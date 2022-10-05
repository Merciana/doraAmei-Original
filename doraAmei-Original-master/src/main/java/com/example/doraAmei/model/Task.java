package com.example.doraAmei.model;

public class Task {

    public Task(Long id, String name, Integer password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Task() {

    }

    private Long id;
    private String name;
    private Integer password;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getPassword() {
        return password;
    }
}
