public class PoliceDepartment extends Building{
    private int uch;
    private int countWorkers;
    private boolean isBusy;
    {
        uch = -1;
        countWorkers = 0;
        isBusy = false;
    }
    PoliceDepartment(){}
    PoliceDepartment(String name, String adress, int year, String nameArch, boolean isCulture, int uch, int countWorkers, boolean isBusy){
        super(name, adress, year, nameArch, isCulture);
        setUch(uch);
        setCountWorkers(countWorkers);
        setBusy(isBusy);

    }

    public int getUch() {
        return uch;
    }

    public void setUch(int uch) {
        this.uch = uch;
    }

    public int getCountWorkers() {
        return countWorkers;
    }

    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }

    public boolean getBusy() {
        return isBusy;
    }

    public void setBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    public String toString(String a){
        return "Привет, " + a + "! Рады видеть тебя";
    }
    public void display(){
        System.out.printf("Название: %s\nАдрес: %s\nГод постройки: %d\nАрхитектор: %s\nКультурный памятник: %s\nучасток: %d\n" +
                        "Количество работников: %d\nЕсть ли свободные офицеры: %s\n\n", getName(), getAdress(), getYear(), getNameArch(), getCulture() ? "Да" : "Нет",
                getUch(), getCountWorkers(), getBusy() ? "Да" : "Нет");
    }

    public void Workers(char c, int n){
        switch (c){
            case '+':
                setCountWorkers(countWorkers + n);
                break;
            case '-':
                setCountWorkers(countWorkers - n);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
