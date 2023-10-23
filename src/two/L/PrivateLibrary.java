package two.L;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class PrivateLibrary extends Library implements Books, Readers, Price, Workers {
    final String status;
    private int countReader;
    private final int countBook;
    private TreeMap<String, Float> PRice;
    public static String opis;
    private int countWorkers;
    {
        status = "Частная";
        countBook = 0;
        countReader = 0;
        countWorkers = 0;
    }
    static{
        opis = "Класс Частная Библиотека, наследованный от класса Библиотека. В нем добавлены поля: статус библиотеки" +
                ", количество книг, количество клиентов и цена\n";
    }
    PrivateLibrary(){}
    PrivateLibrary(String name, int year, String owner, int countBook, String address, int countRoom, String status,
                   int countReader){
        super(name, year, owner, address, countRoom);
        countBook = getCountBook();
        status = "Частная";
        countReader = getCountReader();
        PRice = getPrice();
    }

    public int getCountReader() {
        return readers.size();
    }

    public TreeMap<String, Float> getPrice() {
        return price;
    }

    @Override
    public void addBooks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String avtor = s.nextLine().toLowerCase();
        System.out.println("Введите название книги: ");
        String nazvanie = s.nextLine().toLowerCase();
        String[] book = {avtor, nazvanie};
        books.add(book);
    }
    public void addBooks(String[][] book) {
        for(String[] el: book){
            books.add(new String[]{el[0].toLowerCase(), el[1].toLowerCase()});
        }
    }

    @Override
    public void delBooks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите автора удаляемой книги: ");
        String avtor = s.nextLine().toLowerCase();
        System.out.println("Введите название удаляемой книги: ");
        String nazvanie = s.nextLine().toLowerCase();
        for(int i = 0; i < books.size(); i++){
            if(books.get(i)[0].equals(avtor) && books.get(i)[1].equals(nazvanie)){
                books.remove(i);
                System.out.println("Удалено");
                break;
            }
            else{
                System.out.println("Такой книги нет");
                break;
            }
        }

    }

    @Override
    public void displayBooks() {
        for(String[] el: books){
            System.out.println(Arrays.toString(el));
        }
    }

    public int getCountBook() {
        return books.size();
    }

    @Override
    public void addReaders() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите дату рождения (вида dd/mm/yyyy): ");
        String date = s.nextLine().toLowerCase();

        System.out.println("Введите количество книг: ");
        String kolvo = s.nextLine().toLowerCase();
        String[] reader = {FIO, date, kolvo};
        readers.add(reader);
    }
    public void addReaders(String[][] reader) {
        for(String[] el: reader){
            readers.add(new String[]{el[0].toLowerCase(), el[1].toLowerCase(), el[2].toLowerCase()});
        }
    }

    @Override
    public void delReaders() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ФИО удаляемого клиента: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите дату рождения удаляемого клиента (вида yyyy/mm/dd): ");
        String date = s.nextLine().toLowerCase();
        for(int i = 0; i < readers.size(); i++){
            if(readers.get(i)[0].equals(FIO) && readers.get(i)[1].equals(date)){
                readers.remove(i);
                System.out.println("Удалено");
                break;
            }
            else{
                System.out.println("Такого клиента не существует");
                break;
            }
        }
    }

    @Override
    public void displayReaders() {
        for(String[] el: readers){
            System.out.println(Arrays.toString(el));
        }
    }

    @Override
    public void bookReader() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ФИО клиента, чтобы изменить его количество книг: ");
        String FIO = s.nextLine().toLowerCase();
        System.out.println("Введите дату рождения клиента (вида dd/mm/yyyy): ");
        String date = s.nextLine().toLowerCase();
        System.out.println("Введите новое количество книг: ");
        String kolvo = s.nextLine().toLowerCase();
        for(String[] el: readers){
            if(el[0].equals(FIO) && el[1].equals(date)) el[2] = kolvo;
        }

    }

    @Override
    public void displayPrice() {
        System.out.println(price);
    }

    @Override
    public void addPrice() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ценообразующий пункт: ");
        String punkt = s.nextLine().toLowerCase();
        System.out.println("Введите стоимость: ");
        float sum = s.nextFloat();
        price.put(punkt, sum);
    }

    @Override
    public void changePrice() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите пункт, который хотите изменить: ");
        String punkt = s.nextLine().toLowerCase();
        if(price.containsKey(punkt)){
            System.out.println("Введите новую стоимость: ");
            float sum = s.nextFloat();
            price.put(punkt, sum);
            System.out.println("Изменено");
        }else System.out.println("Такого пункта нет");
    }

    @Override
    public void delPrice() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите пункт, который хотите удалить: ");
        String punkt = s.nextLine().toLowerCase();
        if(price.containsKey(punkt)){
            price.remove(punkt);
            System.out.println("Удалено");
        }else System.out.println("Такого пункта нет");
    }
    public void displayAll(){
        System.out.printf("Название библиотеки: %s\nГод постройки: %d\nВладелец: %s\nКоличсетво книг: %d\nАдрес: %s\n" +
                        "Количество читательных залов: %d\nСтатус: %s\nКоличество читателей: %d\nЦены: " + PRice + '\n'
                        + "Количество сотрудников: %d\n\n", getName(), getYear(), getOwner(), getCountBook(),
                getAddress(), getCountRoom(), status, getCountReader(), getCountWorkers());
    }
    @Override
    public void displayWorkers() {
        System.out.println(workers);
    }

    @Override
    public void addWorkers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ФИО сотрудника: ");
        String worker = s.nextLine().toLowerCase();;
        System.out.println("Введите должность сотрудника: ");
        String dol = s.nextLine().toLowerCase();;
        workers.put(worker, dol);
    }
    public void addWorkers(String[][] worker) {
        for(String[] el: worker){
            workers.put(el[0], el[1]);
        }
    }

    @Override
    public void delWorkers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ФИО удаляемого сотрудника: ");
        String worker = s.nextLine().toLowerCase();;
        if(workers.containsKey(worker)){
            workers.remove(worker);
            System.out.println("Удалено");
        }
        else System.out.println("Такого сотрудника не существует");
    }

    @Override
    public void changeWorkers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ФИО сотрудника, которого хотите изменить: ");
        String worker = s.nextLine().toLowerCase();
        if(workers.containsKey(worker)){
            System.out.println("Введите новую должность: ");
            String dol = s.nextLine().toLowerCase();;
            workers.put(worker, dol);
            System.out.println("Изменено");
        }else System.out.println("Такого сотрудника нет");
    }

    public int getCountWorkers() {
        return workers.size();
    }
}
