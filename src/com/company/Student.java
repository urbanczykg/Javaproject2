package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Comparable;

public class Student implements Comparable<Student> {
    public String imie;
    public String nazwisko;
    public StudentCondition stanStudenta;
    public Integer rokUrodzenia;
    public Double iloscPunktow;


    public Student(String imie, String nazwisko, StudentCondition stanStudenta, Integer rokUrodzenia, Double iloscPunktow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanStudenta = stanStudenta;
        this.rokUrodzenia = rokUrodzenia;
        this.iloscPunktow = iloscPunktow;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String toString() {
        return nazwisko + " " + imie;
    }

    @Override
    public int compareTo(Student o) {
        int porownaneNazwiska = nazwisko.compareTo(o.nazwisko);

        if (porownaneNazwiska == 0) {
            return imie.compareTo(o.imie);
        } else {
            return porownaneNazwiska;
        }
    }

    public void print() {

        System.out.println("Informacje o studencie: ");
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko:: " + this.nazwisko);
        System.out.println("Stan studenta: " + this.stanStudenta);
        System.out.println("Rok urodzenia: " + this.rokUrodzenia);
        System.out.println("Ilosc punktow: " + this.iloscPunktow);

    }

    public void segregacja() {

    }
}
