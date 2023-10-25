package KR2;

import java.util.TreeMap;

public interface Inventory {
    TreeMap<String, Integer> invent = new TreeMap<>();
    void displayInventory();
    void changeInventory();
}
