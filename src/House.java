import java.util.Scanner;

public class House extends Building implements LivingHouse{
    private String owner;
    private int countPeople;
    private boolean isOld;
    {
        owner = "None";
        countPeople = 0;
        isOld = false;
    }
    House(){}
    House(String name, String adress, int year, String nameArch, boolean isCulture, String owner, int countPeople, boolean isOld){
        super(name, adress, year, nameArch, isCulture);
        setOwner(owner);
        setCountPeople(countPeople);
        setWork(isOld);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public boolean getOld() {
        return isOld;
    }

    public void setWork(boolean work) {
        isOld = work;
    }

    public String toString(String a){
        return "Привет, " + a + "! Рады видеть тебя";
    }
    public void display(){
        System.out.printf("Название: %s\nАдрес: %s\nГод постройки: %d\nАрхитектор: %s\nКультурный памятник: %s\nВладелец: %s\n" +
                        "Количество жильцов: %d\nСтарая постройка: %s\n\n", getName(), getAdress(), getYear(), getNameArch(), getCulture() ? "Да" : "Нет",
                getOwner(), getCountPeople(), getOld() ? "Да" : "Нет");
    }

    public void People(char c, int n){
        switch (c){
            case '+':
                setCountPeople(countPeople + n);
                break;
            case '-':
                setCountPeople(countPeople - n);
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
