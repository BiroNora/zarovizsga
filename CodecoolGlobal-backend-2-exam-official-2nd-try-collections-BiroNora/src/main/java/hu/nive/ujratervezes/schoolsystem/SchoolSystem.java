package hu.nive.ujratervezes.schoolsystem;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class SchoolSystem {
    List<Student> students;

    public SchoolSystem(List<Student> students) throws IllegalArgumentException {
        if (students == null) throw new IllegalArgumentException();
        this.students = new ArrayList<>(students);
    }

    public List<Student> getListOfStudentsLearningSubject(String subject) {
        return students.stream()
            .filter(x -> x.getSubjects().contains(subject))
            .collect(Collectors.toList());
    }

    public void deleteSubjectFromAllStudents(String subject) {
        students.forEach(x -> {
            String sub = String.valueOf(x.getSubjects());
            if (sub.equals(subject)) {
                students.remove(x);
            }
        });
    }

    public List<Student> getListOfStudentsByStartDate(LocalDate date) {
        return students.stream()
            .filter(x -> x.getStart().isEqual(date))
            .collect(Collectors.toList());
    }

    public Map<LocalDate, List<Student>> getListOfStudentsGroupByStartDate() {
        Map<LocalDate, List<Student>> startsPerStudents = new HashMap<>();
        students.forEach(x -> {
            LocalDate date = x.getStart();
            if (!startsPerStudents.containsKey(date)) {
                startsPerStudents.put(date, new ArrayList<>());
            }
            startsPerStudents.get(date).add(x);
        });

        return startsPerStudents;
    }

    public Set<String> getCommonSubjectsAmongStudents(Set<String> studentNames) throws IllegalArgumentException {
        if (studentNames == null || studentNames.size() == 0) throw new IllegalArgumentException();
        return null;
    }

    public List<Student> getStudents() {
        return students;
    }
}
