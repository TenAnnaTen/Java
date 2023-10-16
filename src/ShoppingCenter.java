public class ShoppingCenter extends Building{
    private String owner;
    private int countShops;
    private boolean isWork;
    {
        owner = "None";
        countShops = 0;
        isWork = false;
    }
    ShoppingCenter(){}
    ShoppingCenter(String name, String adress, int year, String nameArch, boolean isCulture, String owner, int countShops, boolean isWork){
        super(name, adress, year, nameArch, isCulture);
        setOwner(owner);
        setCountShops(countShops);
        setWork(isWork);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountShops() {
        return countShops;
    }

    public void setCountShops(int countShops) {
        this.countShops = countShops;
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
                        "Количество магазинов: %d\nРаботает: %s\n\n", getName(), getAdress(), getYear(), getNameArch(), getCulture() ? "Да" : "Нет",
                getOwner(), getCountShops(), getWork() ? "Да" : "Нет");
    }

    public void Books(char c, int n){
        switch (c){
            case '+':
                setCountShops(countShops + n);
                break;
            case '-':
                setCountShops(countShops - n);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
