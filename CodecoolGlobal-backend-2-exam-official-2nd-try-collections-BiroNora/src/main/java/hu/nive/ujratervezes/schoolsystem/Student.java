package hu.nive.ujratervezes.schoolsystem;

import java.time.LocalDate;
import java.util.Set;

public class Student {
    private String name;
    private LocalDate start;
    private Set<String> subjects;


    public Student(String name, LocalDate start, Set<String> subjects) {
        this.name = name;
        this.start = start;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStart() {
        return start;
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}
