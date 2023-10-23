package two.L;

public abstract class Library {
    private String name;
    private int year;
    private String owner;
    private String address;
    private int countRoom;
    {
        name = "None";
        year = 0;
        owner = "None";
        address = "None";
        countRoom = 0;
    }
    Library(){}
    Library(String name, int year, String owner, String address, int countRoom){
        setName(name);
        setYear(year);
        setOwner(owner);
        setAddress(address);
        setCountRoom(countRoom);

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
