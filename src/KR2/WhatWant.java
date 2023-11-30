package KR2;

import five.JOptionPaneTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.TreeSet;

import static KR2.Inventory.invent;
import static KR2.Students.students;
import static KR2.Workers.workers;

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
        super("Регистрационное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.button1_want.addActionListener(new MyButton1Listener());
        this.button2_want.addActionListener(new MyButton2Listener());
        this.button3_want.addActionListener(new MyButton3Listener());
        this.button4_want.addActionListener(new MyButton4Listener());
        this.button5_want.addActionListener(new MyButton5Listener());
        this.button6_want.addActionListener(new MyButton6Listener());
        this.button7_want.addActionListener(new MyButton7Listener());
        this.button8_want.addActionListener(new MyButton8Listener());
        this.button9_want.addActionListener(new MyButton9Listener());
        this.button10_want.addActionListener(new MyButton10Listener());
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
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        JOptionPane.showMessageDialog(WhatWant.this, invent);
                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }
    private class MyButton3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        String a = JOptionPane.showInputDialog(WhatWant.this,
                                "Добавить - 1, Изменить количество - 2, Удалить - 3\nВведите цифру: ");


                        int A = Integer.parseInt(a);
                        switch (A){
                            case 1:
                                String nazvanie = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите название предмета: ");
                                String k = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите количество: ");
                                int kolvo = Integer.parseInt(k);
                                t.inventory.put(nazvanie, kolvo);
//                                invent.put();
                                JOptionPane.showMessageDialog(WhatWant.this, "Добавлено");
                                break;
                            case 2:
                                String nazvan = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите название предмета: ");
                                if(invent.containsKey(nazvan)){
                                    String kk = JOptionPane.showInputDialog(WhatWant.this,
                                            "Введите новое количество: ");
                                    int kolv = Integer.parseInt(kk);
                                    t.inventory.put(nazvan, kolv);
                                    JOptionPane.showMessageDialog(WhatWant.this, "Изменено");
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(WhatWant.this, "Такого предмета нет");
                                    return;
                                }
                            case 3:
                                String naz = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите название предмета: ");
                                if(invent.containsKey(naz)){
                                    t.inventory.remove(naz);
                                    JOptionPane.showMessageDialog(WhatWant.this, "Удалено");
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(WhatWant.this, "Такого предмета нет");
                                    return;
                                }
                            default:
                                JOptionPane.showMessageDialog(WhatWant.this, "Неправильно введена цифра");
                                break;
                        }

                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }

    private class MyButton4Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        JOptionPane.showMessageDialog(WhatWant.this, workers);
                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }
    private class MyButton5Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        String a = JOptionPane.showInputDialog(WhatWant.this,
                                "Добавить - 1, Изменить - 2, Удалить - 3\nВведите цифру: ");
                        int A = Integer.parseInt(a);
                        switch (A){
                            case 1:
                                String FIO = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите ФИО сотрудника: ");
                                String dol = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите должность: ");
                                String[][] r = {{FIO, dol}};
                                t.addWorkers(r);
                                JOptionPane.showMessageDialog(WhatWant.this, "Добавлено");
                                break;
                            case 2:
                                String FI = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите ФИО сотрудника: ");
                                if(workers.containsKey(FI)){
                                    String dl = JOptionPane.showInputDialog(WhatWant.this,
                                            "Введите новую должность: ");
                                    workers.put(FI, dl);
                                    JOptionPane.showMessageDialog(WhatWant.this, "Изменено");
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(WhatWant.this, "Такого сотрудника нет");
                                    return;
                                }
                            case 3:
                                String F = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите ФИО сотрудника: ");
                                if(workers.containsKey(F)){
                                    workers.remove(F);
                                    JOptionPane.showMessageDialog(WhatWant.this, "Удалено");
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(WhatWant.this, "Такого предмета нет");
                                    return;
                                }
                            default:
                                JOptionPane.showMessageDialog(WhatWant.this, "Неправильно введена цифра");
                                break;
                        }

                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }
    private class MyButton6Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        JOptionPane.showMessageDialog(WhatWant.this, students);
                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }
    private class MyButton7Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        String a = JOptionPane.showInputDialog(WhatWant.this,
                                "Добавить - 1, Удалить - 2\nВведите цифру: ");
                        int A = Integer.parseInt(a);
                        switch (A){
                            case 1:
                                String group = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите группу студента: ");
                                if(students.containsKey(group)){
                                    String FIO = JOptionPane.showInputDialog(WhatWant.this,
                                            "Введите ФИО студента: ");
                                    TreeSet<String> novoe = new TreeSet<>();
                                    novoe.addAll(students.get(group));
                                    novoe.add(FIO);
                                    students.put(group, novoe);
                                    JOptionPane.showMessageDialog(WhatWant.this, "Добавлено");
                                }else{
                                    String FIO = JOptionPane.showInputDialog(WhatWant.this,
                                            "Введите ФИО студента: ");
                                    TreeSet<String> novoe = new TreeSet<>();
                                    novoe.add(FIO);
                                    students.put(group, novoe);
                                    JOptionPane.showMessageDialog(WhatWant.this, "Добавлено");
                                }
                                break;
                            case 2:
                                String gr = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите группу студента: ");
                                if(students.containsKey(gr)){
                                    String FI = JOptionPane.showInputDialog(WhatWant.this,
                                            "Введите ФИО студента: ");
                                    if(students.get(gr).contains(FI)){
                                        TreeSet<String> novoe = new TreeSet<>();
                                        novoe.addAll(students.get(gr));
                                        novoe.remove(FI);
                                        students.put(gr, novoe);
                                        JOptionPane.showMessageDialog(WhatWant.this, "Удалено");
                                        return;
                                    }else JOptionPane.showMessageDialog(WhatWant.this, "Такого студента не существует");
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(WhatWant.this, "Такой группы не существует");
                                    return;
                                }
                            default:
                                JOptionPane.showMessageDialog(WhatWant.this, "Неправильно введена цифра");
                                break;
                        }

                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }
    private class MyButton8Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        String a = JOptionPane.showInputDialog(WhatWant.this,
                                "Просмотреть по группе - 1, По преподавателю - 2, Просмотреть всё - 3\n" +
                                        "Введите цифру: ");
                        int A = Integer.parseInt(a);
                        switch (A){
                            case 1:
                                String group = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите группу: ");
                                for (String[] el : Schedule.schedule) {
                                    if (el[1].equals(group)){
                                        JOptionPane.showMessageDialog(WhatWant.this, Arrays.toString(el));
                                        return;
                                    }
                                }
                                JOptionPane.showMessageDialog(WhatWant.this, "Нет такой группы");
                                break;
                            case 2:
                                String FIO = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите ФИО преподавателя: ");
                                for (String[] el : Schedule.schedule) {
                                    if (el[0].equals(FIO)) JOptionPane.showMessageDialog(WhatWant.this, Arrays.toString(el));
                                    return;
                                }
                                JOptionPane.showMessageDialog(WhatWant.this, "Нет такого преподавателя");
                                break;
                            case 3:
                                for(String[] el: Schedule.schedule){
                                    System.out.println(Arrays.toString(el));
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(WhatWant.this, "Неправильно введена цифра");
                                break;
                        }
                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }

    private class MyButton9Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        String a = JOptionPane.showInputDialog(WhatWant.this,
                                "Добавить - 1, Удалить - 2\nВведите цифру: ");
                        int A = Integer.parseInt(a);
                        switch (A){
                            case 1:
                                String FIO = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите ФИО преподавателя: ");
                                String group = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите группу: ");
                                String dis = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите название дисциплины: ");
                                String day  = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите день недели: ");
                                String time = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите время пары (формат hh:mm - hh:mm): ");
                                String[] reader = {FIO, group, dis, day, time};
                                Schedule.schedule.add(reader);
                                break;
                            case 2:
                                String FI = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите ФИО преподавателя: ");
                                String gr = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите группу: ");
                                String di = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите название дисциплины: ");
                                String da = JOptionPane.showInputDialog(WhatWant.this,
                                        "Введите день недели: ");
                                for(String[] el : Schedule.schedule) {
                                    if (el[0].equals(FI) && el[1].equals(gr) && el[2].equals(di) && el[3].equals(da))
                                        Schedule.schedule.remove(el);
                                }
                                JOptionPane.showMessageDialog(WhatWant.this, "Удалено");
                                break;
                            default:
                                JOptionPane.showMessageDialog(WhatWant.this, "Неправильно введена цифра");
                                break;
                        }

                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }
    private class MyButton10Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = JOptionPane.showInputDialog(WhatWant.this,
                    "<html><h2>Введите название университета:");
            if(UniversForm.combobox1 != null) {
                for (TechnicalUniversity t : UniversForm.combobox1) {
                    if (t.getName().equals(result)) {
                        Formatter formatter = new Formatter();
                        formatter.format("Название: %s\nГод постройки: %d\nАдрес: %s\nКоличсетво аудиторий: %d\nИнвентарь: " + invent
                                        + '\n' + "Количество сотрудников: %d\nКоличество студентов: %d\n\n",
                                t.getName(), t.getYear(), t.getAddress(), t.getCountRoom(), t.getCountWorker(), t.getCountStudent());
                        JOptionPane.showMessageDialog(WhatWant.this, formatter);
                    } else JOptionPane.showMessageDialog(WhatWant.this, "Нет такого университета");
                }
            }else JOptionPane.showMessageDialog(WhatWant.this, "Сначала зарегистрируйте университет");
        }
    }

}


