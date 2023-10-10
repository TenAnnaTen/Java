public class Bird extends Animal{
    private String area;
    private boolean winterFly;

    {
        area = "None";
        winterFly = false;
        super.setFly(true);
    }

    public void setArea(String area){
        this.area = area;
    }
    public void setWinterFly(boolean winterFly){
        this.winterFly = winterFly;
    }
    public String getArea(){
        return this.area;
    }
    public String getWinterFly(){
        return super.YesNo(winterFly);
    }
    public void chirik_chirik(){
        System.out.println("Chirik-Chirik\n");
    }

}
