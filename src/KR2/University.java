package KR2;

public abstract class University {
    private String name;
    private int year;
    private String address;
    private int countRoom;

    {
        name = "None";
        year = 0;
        address = "None";
        countRoom = 0;
    }
    University(){}
    University(String name, int year, String address, int countRoom){
        setName(name);
        setYear(year);
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

