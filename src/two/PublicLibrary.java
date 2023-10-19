package two;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public final class PublicLibrary extends Library implements Books{
    final String status;
    private int countReader;
    private String sponsor;
    private final int countBook;
    public static String opis;
    {
        status = "Публичная";
        countBook = 0;
        countReader = 0;
        sponsor = "None";
    }
    static{
        opis = "График работы:\nПн-Ср-Пт: 10.00-22.00\nВт-Чт: выходные\nCб-Вс: 11.00-18.00";
    }
    PublicLibrary(){}
    PublicLibrary(String name, int year, String owner, int countBook, String address, int countRoom, String status,
                  int countReader, String sponsor){
        name = super.getName();
        year = super.getYear();
        owner = super.getOwner();
        countBook = getCountBook();
        address = super.getAddress();
        countRoom = super.getCountRoom();
        status = "Публичная";
        countReader = getCountReader();
        sponsor = getSponsor();
    }

    public int getCountReader() {
        return countReader;
    }

    public void setCountReader(int countReader) {
        this.countReader = countReader;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
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