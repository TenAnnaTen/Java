public class University extends Building{
    private String owner;
    private int countStudents;
    private boolean isWork;
    {
        owner = "None";
        countStudents = 0;
        isWork = false;
    }
    University(){}
    University(String name, String adress, int year, String nameArch, boolean isCulture, String owner, int countStudent, boolean isWork){
        super(name, adress, year, nameArch, isCulture);
        setOwner(owner);
        setCountStudents(countStudents);
        setWork(isWork);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
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
                        "Количество студентов: %d\nРаботает: %s\n\n", getName(), getAdress(), getYear(), getNameArch(), getCulture() ? "Да" : "Нет",
                getOwner(), getCountStudents(), getWork() ? "Да" : "Нет");
    }

    public void Books(char c, int n){
        switch (c){
            case '+':
                setCountStudents(countStudents + n);
                break;
            case '-':
                setCountStudents(countStudents - n);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
