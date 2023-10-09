public class Ruler extends WritingMaterials{
    private double length2;
    boolean wood;
    {
        length2 = 0;
        wood = false;
    }
    public Ruler(){}
    public Ruler(String name, String color, int price, double length, boolean draw, double length2, boolean wood){
        super(name, color, price, length, draw = false);
        setLength2(length2);
        setWood(wood);
    }
    public void setLength2(double length2){
        this.length2 = length2;
    }
    public double getLength2(){
        return this.length2;
    }
    public void setWood(boolean wood){
        this.wood = wood;
    }
    public String getWood(){
        return super.DaNet(this.wood);
    }
    public void measure(){
        System.out.println("Сейчас померяем длину\n");
    }
    @Override
    public void display() {
        System.out.println("This is " + getClass().getName() + "\n");
        super.display();
        System.out.printf("Может измерить в длину: %.2f, Из дерева: %s\n\n", getLength2(), getWood());
    }

}
