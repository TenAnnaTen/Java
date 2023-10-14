public class Library extends Building{
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
    public void display(){

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

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
