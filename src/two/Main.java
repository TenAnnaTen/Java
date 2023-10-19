package two;

public class Main {
    public static void main(String[] args) {
        PublicLibrary p = new PublicLibrary();
        p.addBooks();
        String[][] book = {{"Джордж Оруэлл", "1984"}, {"Рэй Брэдбери", "451 градус по Фаренгейту"}};
        p.addBooks(book);
        p.displayBooks();
        p.delBooks();
        p.displayBooks();
        System.out.println(p.getCountBook());
    }
}
