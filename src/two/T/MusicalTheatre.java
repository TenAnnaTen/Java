package two.T;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class MusicalTheatre extends Theatre implements Workers, Tickets, Plays, Sessions{
    private String status;
    private TreeMap<String, String> workers;
    private int countTickets;
    private int countPlay;
    private int countSessions;
    public static String opis;
    {
        status = "Драматический";
        countTickets = 0;
        countPlay = 0;
        countSessions = 0;
    }
    static{
        opis = "Класс Драматический театр, наследованный от класса Театр. В нем добавлены поля: статус тетра, рвботники, " +
                "количество билетов, спектаклей, сеансов\n";
    }
    MusicalTheatre(){}
    MusicalTheatre(String name, int year, String owner, String address, int countRoom){
        super(name, year, owner, address, countRoom);
        status = "Драматический";
        workers = worker;
        countTickets = getCountTickets();
        countPlay = getCountPlay();
        countSessions = getCountSessions();
    }
    Scanner s = new Scanner(System.in);
    @Override
    public void displayWorkers() {
        System.out.println(worker);
    }

    @Override
    public void addWorkers() {
        System.out.println("Введите ФИО сотрудника: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите должность сотрудника: ");
        String dol = s.nextLine().toLowerCase();
        worker.put(FIO, dol);
    }
    public void addWorkers(String[][] a) {
        for(String[] el: a){
            worker.put(el[0].toLowerCase(), el[1].toLowerCase());
        }
    }

    @Override
    public void changeWorkers() {
        System.out.println("Введите ФИО сотрудника, которого хотите изменить: ");
        String FIO = s.nextLine().toLowerCase();
        if(workers.containsKey(FIO)){
            System.out.println("Введите Новую должность сотрудника: ");
            String dol = s.nextLine().toLowerCase();
            worker.put(FIO, dol);
            System.out.println("Изменено");
        }
        else System.out.println("Такого сотрудника не существует");
    }

    @Override
    public void delWorkers() {
        System.out.println("Введите ФИО сотрудника, которого хотите удалить: ");
        String FIO = s.nextLine().toLowerCase();
        if(workers.containsKey(FIO)){
            worker.remove(FIO);
            System.out.println("Удалено");
        }
        else System.out.println("Такого сотрудника не существует");
    }

    @Override
    public void displayTickets() {
        for(String[] el: ticket){
            System.out.println(Arrays.toString(el));
        }
    }

    @Override
    public void changeTickets() {
        System.out.println("Добавить билеты - 1, Изменить количество билетов на определенный сеанс - 2, Удалить билеты - 3\n" +
                "Введите цифру: ");
        int a = s.nextInt();
        s.nextLine();
        switch (a){
            case 1:
                System.out.println("Введите название спектакля: ");
                String nazvanie = s.nextLine();
                System.out.println("Введите количество билетов: ");
                String kolvo = s.nextLine();
                System.out.println("Введите цену билетов: ");
                String price = s.nextLine();
                String[] t = {nazvanie, kolvo, price};
                ticket.add(t);
                break;
            case 2:
                System.out.println("Введите название спектакля: ");
                String nazvan = s.nextLine();
                for (String[] el: ticket){
                    if(el[0].equals(nazvan)){
                        System.out.println("Увеличить - 1 , Уменьшить - 2");
                        int n = s.nextInt();
                        System.out.println("На сколько изменить :");
                        int n2 = s.nextInt();
                        switch (n){
                            case 1:
                                el[1] = (Integer.parseInt(el[1] ) + n2) + "";
                                return;
                            case 2:
                                el[1] = (Integer.parseInt(el[1]) - n2) + "";
                                return;
                        }
                        break;
                    }
                    else{
                        System.out.println("Такого спектакля нет");
                        break;
                    }
                }
            case 3:
                System.out.println("Введите название спектакля: ");
                String naz = s.nextLine();
                for (String[] el: ticket){
                    if(el[0].equals(naz)){
                        ticket.remove(el);
                        break;
                    }
                    else{
                        System.out.println("Такого спектакля нет");
                        break;
                    }
                }
            default:
                System.out.println("Неправильно введена цифра");
                break;
        }

    }

    public int getCountTickets() {
        return ticket.size();
    }
    @Override
    public void displayPlays() {
        for(String el: plays){
            System.out.println(el);
        }
    }

    @Override
    public void addPlays() {
        System.out.println("Введите название спектакля: ");
        String nazvanie = s.nextLine().toLowerCase();
        plays.add(nazvanie);
    }

    @Override
    public void delPlays() {
        System.out.println("Введите название спектакля: ");
        String nazvanie = s.nextLine().toLowerCase();
        for(String el: plays){
            if(el.equals(nazvanie)){
                plays.remove(el);
                System.out.println("Удалено");
            }
            else System.out.println("Такого спектакля нет");
        }
    }
    @Override
    public void displaySessions() {
        for(String[] el: sessions){
            System.out.println(Arrays.toString(el));
        }
    }

    @Override
    public void changeSessions() {
        System.out.println("Добавить сеанс - 1, Изменить время сеанса - 2, Удалить сеанс - 3\n" +
                "Введите цифру: ");
        int a = s.nextInt();
        s.nextLine();
        switch (a){
            case 1:
                System.out.println("Введите название спектакля: ");
                String nazvanie = s.nextLine().toLowerCase();
                System.out.println("Введите время сеанса: ");
                String time = s.nextLine().toLowerCase();
                String[] t = {nazvanie, time};
                sessions.add(t);
                break;
            case 2:
                System.out.println("Введите название спектакля: ");
                String nazvan = s.nextLine().toLowerCase();
                for (String[] el: sessions){
                    if(el[0].equals(nazvan)){
                        System.out.println("Введите новое время: ");
                        String tim = s.nextLine().toLowerCase();
                        el[1] = tim;
                        return;
                    }
                    else{
                        System.out.println("Такого спектакля нет");
                        return;
                    }
                }
            case 3:
                System.out.println("Введите название спектакля: ");
                String naz = s.nextLine().toLowerCase();
                for (String[] el: sessions){
                    if(el[0].equals(naz)){
                        sessions.remove(el);
                        break;
                    }
                    else{
                        System.out.println("Такого спектакля нет");
                        break;
                    }
                }
            default:
                System.out.println("Неправильно введена цифра");
                break;
        }
    }
    public int getCountPlay() {
        return plays.size();
    }

    public int getCountSessions() {
        return sessions.size();
    }
    public void displayAll(){
        System.out.printf("Название театра: %s\nГод постройки: %d\nВладелец: %s\nАдрес: %s\n" + "Количество залов: %d\n" +
                        "Сотрудники: " + workers + '\n' + "Количество билетов: %d\nКоличество спектаклей: %d\nКоличество сеансов" +
                        ": %d\n\n", getName(), getYear(), getOwner(), getAddress(), getCountRoom(), getCountRoom(), getCountPlay(),
                getCountSessions());
    }
}
