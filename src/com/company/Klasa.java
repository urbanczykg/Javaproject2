package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Klasa {
    public String nazwaGrupy;
    public List<Student> listaStudentow;
    public Integer maxStudentow;

    public Klasa(String nazwaGrupy, Integer maxStudentow) {
        this.nazwaGrupy = nazwaGrupy;
        this.maxStudentow = maxStudentow;
    }

    public Klasa(String nazwaGrupy, List<Student> listaStudentow, Integer maxStudentow) {
        this.nazwaGrupy = nazwaGrupy;
        this.listaStudentow = listaStudentow;
        this.maxStudentow = maxStudentow;
    }

    public void addStudent(Student student) {
        if (listaStudentow.size() + 1 < maxStudentow) {
            if (listaStudentow.stream().filter(student1 -> student.imie.equals(student1.imie)).findAny().orElse(null) != null) {
                System.out.println("Student o tym imieniu istnieje ");
            } else {

                listaStudentow.add(student);
            }

        } else {
            System.err.println("za duzo osob w grupie");
        }
    }

    public void addPoints(Student s, double points) {
        for (Student student : listaStudentow) {
            if (student.equals(s)) {
                s.iloscPunktow = s.iloscPunktow + points;
            }
        }

    }

    public void getStudent(Student student) {
        if (student.iloscPunktow == 0) {
            listaStudentow.remove(student);
        }

    }

    public void changeCondition(Student s, StudentCondition C) {
        for (Student student : listaStudentow) {
            if (student.equals(s)) {
                student.stanStudenta = C;
            }
        }

    }

    public void removePoints(Student s, Double points) {
        for (Student student : listaStudentow) {
            if (student.equals(s)) {
                student.iloscPunktow = student.iloscPunktow - points;
            }
        }
    }

    public int countByCondition(StudentCondition s) {
        Integer y = 0;
        for (Student x : listaStudentow) {
            if (x.stanStudenta.equals(s)) {
                y++;
            }
        }
        return y;
    }

    public void summary() {
        for (Student x : listaStudentow) {
            x.print();
        }
    }

    public void sortByName() {
        listaStudentow.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.nazwisko.compareTo(o2.nazwisko);
            }
        });

    }

    public void sortByPoints() {
        listaStudentow.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -1 * Double.compare(o1.iloscPunktow, o2.iloscPunktow);
            }
        });
    }

    public Student search(String surname) {
        for (int i = 0; i < listaStudentow.size(); i++) {
            if (listaStudentow.get(i).imie.compareTo(surname) == 0) {
                return listaStudentow.get(i);
            }
        }
        return null;
    }

    public List<Student> searchPartial(String part) {
        List<Student> returnpart = new ArrayList();
        for (int i = 0; i < listaStudentow.size(); i++) {
            if (listaStudentow.get(i).nazwisko.contains(part)) {
                returnpart.add(listaStudentow.get(i));
            }
        }
        return returnpart;
    }

    public Student max() {
        Student s2 = Collections.max(listaStudentow, (o1, o2) -> {
            return Double.compare(o1.iloscPunktow, o2.iloscPunktow);
        });
        return s2;
    }
}
