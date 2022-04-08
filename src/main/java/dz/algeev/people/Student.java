package dz.algeev.people;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    private int id;
    private String name;
    private Predicate<Integer> rule;
    private List<Integer> marks;

    public Student(int id, String name, Predicate<Integer> rule, List<Integer> marks) {
        this.id = id;
        this.name = name;
        this.rule = rule;
        this.marks = marks;
    }

    public Student(int id, String name, Predicate<Integer> rule) {
        this(id, name, rule, new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}