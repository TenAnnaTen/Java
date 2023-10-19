package one;

public class Divider extends WritingMaterials {
    private String dividerType;
    private boolean metal;
    {
        dividerType = "None";
        metal = false;
    }
    public Divider(){}
    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, boolean metal){
        super(name, color, price, length, draw = true);
        setDividerType(dividerType);
        setMetal(metal);
    }
    public String getDividerType() {
        return this.dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public String getMetal() {
        return super.DaNet(metal);
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    public final void draw_circle(){
        System.out.println("Нарисован круг\n");
    }
    @Override
    public void display() {
        System.out.println("This is " + getClass().getName() + "\n");
        super.display();
        System.out.printf("Тип циркуля: %s, Из металла: %s\n\n", getDividerType(), getMetal());
    }
}
