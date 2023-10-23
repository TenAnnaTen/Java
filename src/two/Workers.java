package two;

import java.util.TreeMap;

public interface Workers {
    TreeMap<String, String> workers = new TreeMap<>();
    void displayWorkers();
    void addWorkers();
    void delWorkers();
    void changeWorkers();

}
