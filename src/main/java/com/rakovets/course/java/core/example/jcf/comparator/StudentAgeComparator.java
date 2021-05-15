package com.rakovets.course.java.core.example.jcf.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
