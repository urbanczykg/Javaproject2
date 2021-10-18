package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Student student1,student2;

        student1 = new Student("Jan","Nowak",StudentCondition.obecny,2000,20.0);
        student2 = new Student("Kamil","Kowalski",StudentCondition.obecny,2000,0.0);

       // List<Student> students = new ArrayList<>();
      //students.add(new Student("Jan","Nowak",StudentCondition.obecny,2000,20.0));
      //students.add( new Student("Kamil","Kowalski",StudentCondition.obecny,2000,21.0));
       //Collections.sort(students);

       // for (Student s : students) {
         //   System.out.println(s);
       // }
        Student student3;
        student3= new Student("joozek","ambrozjak",StudentCondition.obecny,2000,21.0);
        List<Student> students = new ArrayList<>();
        Klasa klasa1;
        klasa1 = new Klasa("klasa1", students,30);
        klasa1.addStudent(student1);
        klasa1.addStudent(student2);
//klasa1.summary();

    klasa1.addPoints(student1,12);
klasa1.addStudent(student3);

        klasa1.summary();
        klasa1.changeCondition(student1,StudentCondition.chory);
        klasa1.summary();
       klasa1.removePoints(student1,12.0);
        klasa1.summary();
        System.out.println(klasa1.countByCondition(StudentCondition.chory));
        klasa1.sortByName();
        klasa1.summary();
        System.out.println(klasa1.max());
        klasa1.sortByPoints();
        klasa1.summary();
        Map<String,Klasa> mapa= new HashMap<>();
        ClassContainer Container = new ClassContainer(mapa);
        Container.addClass("klasa1",10);
        Container.summary();

    }

}
