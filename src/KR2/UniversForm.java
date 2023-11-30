package KR2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UniversForm extends JFrame {
    protected ArrayList<String> combobox1;
    private JPanel panel;
    private JLabel label1_reg;
    private JLabel label_1_reg;
    private JLabel label_2_reg;
    private JLabel label_3_reg;
    private JLabel label_4_reg;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton Button1_reg;

    public UniversForm() {
        super("Регистрационное окно ТехУниверситетов");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 1000, height = 500;
        setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);

        combobox1 = new ArrayList<String>();

        this.Button1_reg.addActionListener(new Button1Listener());
    }

    private class Button1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String name = textField1.getText();
                int year = Integer.parseInt(textField2.getText());
                String address = textField3.getText();
                int countRoom = Integer.parseInt(textField4.getText());

                TechnicalUniversity newUniversity = new TechnicalUniversity(name, year, address, countRoom);
                combobox1.add(newUniversity.getName());
                System.out.println("Items in comboBox1: " + combobox1.get(combobox1.size()-1));
                UniversForm.this.dispose();
            } catch (NumberFormatException ex) {
                // Обработка ошибки ввода числа
                JOptionPane.showMessageDialog(UniversForm.this, "Введите корректные числовые значения");
            }
        }
    }
}