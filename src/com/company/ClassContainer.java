package com.company;

import java.util.*;

public class ClassContainer {
    public Map<String, Klasa> grupy = new HashMap<>();

    public ClassContainer(Map<String, Klasa> grupy) {
        this.grupy = grupy;
    }

    public void addClass(String nameOfGroups, int numberOfStudent) {
        grupy.put(nameOfGroups, new Klasa(nameOfGroups, null, numberOfStudent));
    }

    public void removeClass(String s) {
        for (String key : grupy.keySet()) {
            if (grupy.get(key).equals(s)) {
                grupy.remove(key);
            }
        }

    }

    public List<Klasa> findempty() {
        List empty = new ArrayList();
        for (Klasa value : grupy.values()) {
            if (value.listaStudentow.size() == 0) {
                empty.add(value);
            }
        }
        return empty;
    }

    public void summary() {
        Set<Map.Entry<String, Klasa>> entries = grupy.entrySet();
        Iterator<Map.Entry<String, Klasa>> grupyIter = entries.iterator();

        while (grupyIter.hasNext()) {
            Map.Entry<String, Klasa> entry = grupyIter.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
