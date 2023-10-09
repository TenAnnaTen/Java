public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;
    {
        name = "No name";
        color = "No Color";
        price = 0;
        length = 0;
        draw = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
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
       return this.name;
    }
    public String getColor(){
        return this.color;
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
    WritingMaterials(){}
    public WritingMaterials(String name, String color){
        setName(name);
        setColor(color);
    }
    public WritingMaterials(String name, int price){
        setName(name);
        setPrice(price);
    }
    public WritingMaterials(int price, double length, boolean draw){
        setLength(length);
        setPrice(price);
        setDraw(draw);
    }
    public WritingMaterials(String name, String color, int price, double length, boolean draw){
        setName(name);
        setColor(color);
        setLength(length);
        setPrice(price);
        setDraw(draw);
    }
    private String DaNet(boolean a){
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
        if(getDraw()) System.out.printf("%s провел линию. Ее цвет - %s\n\n", getName(), getColor());
        else System.out.printf("%s не может ничего нарисовать\n\n", getName());
    }
}
