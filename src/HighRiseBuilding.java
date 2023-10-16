public class HighRiseBuilding extends Building{
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
}
