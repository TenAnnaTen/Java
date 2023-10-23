package two.T;

import java.util.TreeMap;

public interface Workers {
    TreeMap<String, String> worker = new TreeMap<>();
    void displayWorkers();
    void addWorkers();
    void changeWorkers();
    void delWorkers();
}
