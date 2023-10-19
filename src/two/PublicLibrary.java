package two;

public final class PublicLibrary extends Library{
    final String status;
    private int countReader;
    private String sponsor;
    public static String opis;
    {
        status = "Публичная";
        countReader = 0;
        sponsor = "None";
    }
    static{
        opis = "dfgfwsdfd";
    }
    PublicLibrary(){}
    PublicLibrary(String name, int year, String owner, int countBook, String address, int countRoom, String status,
                  int countReader, String sponsor){
        name = super.getName();
        year = super.getYear();
        owner = super.getOwner();
        countBook = super.getCountBook();
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
}
