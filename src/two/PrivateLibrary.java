package two;

import java.util.Arrays;
import java.util.Scanner;

public class PrivateLibrary extends Library implements Books{
    final String status;
    private int countReader;
    private final int countBook;
    private int price;
    public static String opis;
    {
        status = "Частная";
        countBook = 0;
        countReader = 0;
        price = 0;
    }
    static{
        opis = "Пн-Пт: 9.00-22.00\nCб-Вс: 12.00-18.00";
    }
    PrivateLibrary(){}
    PrivateLibrary(String name, int year, String owner, int countBook, String address, int countRoom, String status,
                   int countReader, int price){
        name = super.getName();
        year = super.getYear();
        owner = super.getOwner();
        countBook = getCountBook();
        address = super.getAddress();
        countRoom = super.getCountRoom();
        status = "Публичная";
        countReader = getCountReader();
        price = getPrice();
    }

    public int getCountReader() {
        return countReader;
    }

    public void setCountReader(int countReader) {
        this.countReader = countReader;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
}
