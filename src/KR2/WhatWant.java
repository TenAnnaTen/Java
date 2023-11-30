package KR2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static KR2.Inventory.invent;

public class WhatWant extends JFrame{
    private JPanel panel;
    private JButton button1_want;
    private JButton button3_want;
    private JButton button2_want;
    private JButton button4_want;
    private JButton button5_want;
    private JButton button6_want;
    private JButton button7_want;
    private JButton button8_want;
    private JButton button9_want;
    private JButton button10_want;

    public WhatWant(){
        super("Регистрационное коно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.button1_want.addActionListener(new MyButton1Listener());
        this.button2_want.addActionListener(new MyButton2Listener());
    }
    private class MyButton1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UniversForm secondForm = new UniversForm();
            secondForm.setVisible(true);

            // Скрываем текущую форму
//            setVisible(false);
        }
    }
    private class MyButton2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    private class MyButton3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(WhatWant.this, invent);
        }
    }
}
