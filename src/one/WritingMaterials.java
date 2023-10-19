package one;

public class WritingMaterials {
    private static String name;
    private static String color;
    private int price;
    private double length;
    private boolean draw;
    static final String description;
    static int counter;
    {
        price = 0;
        length = 0;
        draw = false;
    }
    static{
        counter = 0;
        name = "No name";
        color = "No Color";
        description = "Класс one.WritingMaterials с полями: color(цвет), name(название), price(цена)," +
                " length(длина), draw (возможность рисовать)\n";
    }
    public void setName(String name){
        name = name;
    }
    public void setColor(String color){
        color = color;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setDraw(boolean draw){
        this.draw = draw;
    }
    public String getName(){
       return name;
    }
    public String getColor(){
        return color;
    }
    public double getLength(){
        return this.length;
    }
    public int getPrice(){
        return this.price;
    }
    public boolean getDraw(){
       return this.draw;
    }
    WritingMaterials(){counter += 1;}
    public WritingMaterials(String name, String color){
        counter += 1;
        setName(name);
        setColor(color);
    }
    public WritingMaterials(String name, int price){
        counter += 1;
        setName(name);
        setPrice(price);
    }
    public WritingMaterials(int price, double length, boolean draw){
        counter += 1;counter += 1;
        setLength(length);
        setPrice(price);
        setDraw(draw);
    }
    public WritingMaterials(String name, String color, int price, double length, boolean draw){
        counter += 1;
        setName(name);
        setColor(color);
        setLength(length);
        setPrice(price);
        setDraw(draw);
    }
    protected String DaNet(boolean a){
        if(a) return "Да";
        else return "Нет";
    }
    public void display(){
        System.out.printf("Название: %s, Цвет: %s, Длина: %.2f, Цена: %d," +
                " Умеет рисовать: %s\n\n", getName(), getColor(), getLength(), getPrice(), DaNet(getDraw()));
    }
    public void replace_rod(String newRod){
        setColor(newRod);
    }
    public void priceUp(int up){
        setPrice(price += up);
    }
    public void priceDown(int down){
        setPrice(price -= down);
    }
    public void draw(){
        if(getDraw()) System.out.printf("%s провел линий: 1. Их цвет - %s\n\n", getName(), getColor());
        else System.out.printf("%s не может ничего нарисовать\n\n", getName());
    }
    public void draw(int n){
        if(getDraw()) System.out.printf("%s провел линий: %d. Их цвет - %s\n\n", getName(), n, getColor());
        else System.out.printf("%s не может ничего нарисовать\n\n", getName());
    }
    public void draw(String color){
        if(getDraw()) System.out.printf("%s провел линий: 1. Их цвет - %s\n\n", getName(), color);
        else System.out.printf("%s не может ничего нарисовать\n\n", getName());
    }
    public void draw(String color, int n){
        if(getDraw()) System.out.printf("%s провел линий: %d. Их цвет - %s\n\n", getName(), n, color);
        else System.out.printf("%s не может ничего нарисовать\n\n", getName());
    }
    public static void what2(){
        System.out.println("Это статический метод класса one.WritingMaterials\n");
    }
    public String toString(){
        return "Номер: " + counter + "\n" + "Название: " + getName() + "\n" + "Цвет: " + getColor() + "\n" + "Цена: " +
                getPrice() + "\n" + "Длина: " + getLength() + "\n" + "Умеет рисовать: " + DaNet(getDraw()) + "\n";
    }
}
