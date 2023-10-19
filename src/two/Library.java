package two;

public abstract class Library {
    private String name;
    private int year;
    private String owner;
    private int countBook;
    private String address;
    private int countRoom;
    {
        name = "None";
        year = 0;
        owner = "None";
        countBook = 0;
        address = "None";
        countRoom = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountBook() {
        return countBook;
    }

    public void setCountBook(int countBook) {
        this.countBook = countBook;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }
}
