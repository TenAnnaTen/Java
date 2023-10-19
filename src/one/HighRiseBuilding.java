package one;

import one.Building;

import java.util.Scanner;
public class HighRiseBuilding extends Building implements LivingHouse {
    private String owner;
    private int countFloor;
    private boolean isWork;
    {
        owner = "None";
        countFloor = 0;
        isWork = false;
    }
    HighRiseBuilding(){}
    HighRiseBuilding(String name, String adress, int year, String nameArch, boolean isCulture, String owner, int countFloor, boolean isWork){
        super(name, adress, year, nameArch, isCulture);
        setOwner(owner);
        setCountFloor(countFloor);
        setWork(isWork);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    public boolean getWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public String toString(String a){
        return "Привет, " + a + "! Рады видеть тебя";
    }
    public void display(){
        System.out.printf("Название: %s\nАдрес: %s\nГод постройки: %d\nАрхитектор: %s\nКультурный памятник: %s\nВладелец: %s\n" +
                        "Количество этажей: %d\nРаботает: %s\n\n", getName(), getAdress(), getYear(), getNameArch(), getCulture() ? "Да" : "Нет",
                getOwner(), getCountFloor(), getWork() ? "Да" : "Нет");
    }

    public void Books(char c, int n){
        switch (c){
            case '+':
                setCountFloor(countFloor + n);
                break;
            case '-':
                setCountFloor(countFloor - n);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }

    public void showName(){
        System.out.printf("Это %s", getClass().getName());
    }
    public void whoOwner(){
        System.out.printf("Влделец: %s", getOwner());
    }
    Scanner s = new Scanner(System.in);
    public void cleaning(){
        System.out.println("Введите номер дня недели: ");
        int n = s.nextInt();

        switch (n){
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("Ответственный за уборку: Иванов И.И.\n");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Ответственный за уборку: Петров П.П.\n");
                break;
        }
    }
}
