package com.company;
import java.util.Comparator;

public class ComparatorNazwisk implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if( o1 == o2 )
            return 0;
        if( o1 == null )
            return 1;
        if( o2 == null )
            return -1;
        return o1.compareTo( o2 );
    }

}

