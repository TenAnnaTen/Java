public final class Fish extends Animal{
    private String squama;
    private boolean upStreamSwim;

    {
        squama = "None";
        upStreamSwim = false;
        super.setSwim(true);
    }
    public void setSquama(String squama){
        this.squama = squama;
    }
    public void setUpStreamSwim(boolean upStreamSwim){
        this.upStreamSwim = upStreamSwim;
    }
    public String getSquama() {
        return this.squama;
    }
    public String getUpStreamSwim() {
        return super.YesNo(this.upStreamSwim);
    }
    public void bul_bul(){
        System.out.println("Bul-bul\n");
    }

}
