package two.L;

import java.util.TreeMap;

public interface Price {
    TreeMap<String, Float> price = new TreeMap<>();
    void displayPrice();
    void addPrice();
    void changePrice();
    void delPrice();
}
