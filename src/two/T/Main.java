package two.T;

public class Main {
    public static void main(String[] args) {
        System.out.println(DramaTheatre.opis);
        DramaTheatre d = new DramaTheatre("№3", 2010, "Государство", "Ул. Шишкина, 45", 4);

        d.addWorkers();
        String[][] a = {{"Иванов ИИ", "Мастер чистоты"}, {"Петров ПП", "Актер"}};
        d.addWorkers(a);
        d.displayWorkers();
        d.delWorkers();

        d.displayTickets();
        d.changeTickets();
        d.displayTickets();
        d.changeTickets();
        d.displayTickets();

        d.addPlays();
        d.displayPlays();
        d.delPlays();

        d.changeSessions();
        d.displaySessions();

        d.displayAll();
    }
}
