package five;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame jFrame = new JOptionPaneTest() {}; //объект класса с пустым конструктором
        jFrame.setVisible(true); //делаем видимым
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
