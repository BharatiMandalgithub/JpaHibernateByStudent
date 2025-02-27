package com.example.studEntity;

public class Student {
    private long id;
    private int rollcall;
    private String name;

    // Getter and Setter for id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Getter and Setter for rollcall
    public int getRollcall() {
        return rollcall;
    }

    public void setRollcall(int rollcall) {
        this.rollcall = rollcall;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
