package com.rakovets.course.java.core.practice.jcf.list.student;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;

    public Student(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(double averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }
}
