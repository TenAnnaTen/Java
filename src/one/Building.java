package one;

public abstract class Building {
    private String name;
    private String adress;
    private int year;
    private String nameArch;
    private boolean isCulture;
    {
        name = "None";
        adress = "None";
        year = 0;
        nameArch = "None";
        isCulture = false;
    }
    Building(){}
    Building(String name, String adress, int year, String nameArch, boolean isCulture){
        setName(name);
        setAdress(adress);
        setYear(year);
        setNameArch(nameArch);
        setCulture(isCulture);
    }
    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public String getAdress(){return adress;}

    public void setAdress(String adress){this.adress = adress;}

    public int getYear(){return year;}

    public void setYear(int year){this.year = year;}

    public String getNameArch(){return nameArch;}

    public void setNameArch(String nameArch){this.nameArch = nameArch; }

    public boolean getCulture(){return isCulture;}

    public void setCulture(boolean culture){isCulture = culture;}
    public abstract void display();
}
