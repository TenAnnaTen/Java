public class Library extends Building implements SocialHouse{
    private String owner;
    private int countBooks;
    private boolean isWork;
    {
        owner = "None";
        countBooks = 0;
        isWork = false;
    }
    Library(){}
    Library(String name, String adress, int year, String nameArch, boolean isCulture, String owner, int countBooks, boolean isWork){
        super(name, adress, year, nameArch, isCulture);
        setOwner(owner);
        setCountBooks(countBooks);
        setWork(isWork);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void setCountBooks(int countBooks) {
        this.countBooks = countBooks;
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
                "Количество книг: %d\nРаботает: %s\n\n", getName(), getAdress(), getYear(), getNameArch(), getCulture() ? "Да" : "Нет",
                getOwner(), getCountBooks(), getWork() ? "Да" : "Нет");
    }

    public void Books(char c, int n){
        switch (c){
            case '+':
                setCountBooks(countBooks + n);
                break;
            case '-':
                setCountBooks(countBooks - n);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }


    @Override
    public void whoOwner(){
        System.out.printf("Влделец: %s", getOwner());
    }

    @Override
    public void grafic() {
        System.out.println("Пн-Пт: 9.00-18.00");
    }

    @Override
    public void price() {
        System.out.println("Разовое посещение без карты читателя - 100р\nПосещение с картой - бесплатно\n");
    }
}
