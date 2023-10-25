package KR2;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public interface Students {
    TreeMap<String, TreeSet<String>> students = new TreeMap<>();
    void displayStudents();
    void addStudents();
    void delStudents();
}
