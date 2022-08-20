package com.example.crud;

public class StudentModel {
    private String name;
    private int rollNmber;
    private boolean isEnroll;
    private int id;



    @Override
    public String toString() {
        return  "name:" + name  +
                ", rollNmber:" + rollNmber +
                ", isEnroll:" + isEnroll+", id:"+id;
    }

    public StudentModel(String name, int rollNmber, boolean isEnroll,int id) {
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
        this.id = id;
    }
    public StudentModel(String name, int rollNmber, boolean isEnroll) {
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNmber() {
        return rollNmber;
    }

    public void setRollNmber(int rollNmber) {
        this.rollNmber = rollNmber;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}
