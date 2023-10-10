public class Insect extends Animal{
    private int wingCont;
    private boolean likeJesus;
    {
        wingCont = 0;
        likeJesus = false;
        super.setWalk(true);
    }

    public void setWingCont(int wingCont) {
        this.wingCont = wingCont;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public int getWingCont() {
        return this.wingCont;
    }

    public String getLikeJesus() {
        return super.YesNo(this.likeJesus);
    }
    public void ggggg(){
        System.out.println("Gggggg\n");
    }
}
