public class House extends Building{
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
}
