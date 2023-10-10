public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;
    {
        type = "NON";
        name = "No name";
        age = 0;
        weight = 0;
        isFly = false;
        isSwim = false;
        isWalk = false;
    }
    public Animal(){

    }
    public Animal(String type, String name){
        setType(type);
        setName(name);
    }
    public Animal(String type, int age){
        setType(type);
        setAge(age);
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        setType(type);
        setName(name);
        setAge(age);
        setWeight(weight);
        setFly(isFly);
        setWalk(isWalk);
        setSwim(isSwim);
    }
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setFly(boolean isFly){
        this.isFly = isFly;
    }
    public void setSwim(boolean isSwim){
        this.isSwim = isSwim;
    }
    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getFly(){
        return this.isFly;
    }
    public boolean getSwim(){
        return this.isSwim;
    }
    public boolean getWalk(){
        return this.isWalk;
    }

    protected static String YesNo(boolean a){
        if(a) return "Да";
        else return "Нет";
    }
    public void display(){
        System.out.printf("Тип: %s\nИмя: %s\nВозраст: %d\nВес: %.2f\nУмеет летать: %s\nУмеет ходить: %s\nУмеет плавать: %s\n\n",
                getType(), getName(), getAge(), getWeight(), YesNo(getFly()), YesNo(getWalk()), YesNo(getSwim()));
    }

    public void rename(String newName){
        setName(newName);
    }

    public void holiday(int days){
        double kg = 0.1 * days;
        setWeight(weight += kg);
    }
}