public class Main {
    public static void main(String[] args) {

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.getWinterFly());
        b.chirik_chirik();

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.getUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук жукыч");
        i.display();
        i.setWingCont(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCont());
        System.out.println(i.getLikeJesus());
        i.ggggg();


        Pen p = new Pen("ручка", "Красный", 145, 15.6, false, 0, true);
        p.display();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.getAuto());
        p.display();
        p.writeMyName();

        Ruler r = new Ruler("линейка", "желтая", 145, 15.6, true, 15.6, false);
        r.display();
        r.setName("Линейка");
        r.display();
        r.setLength2(25);
        r.setWood(true);
        System.out.println(r.getLength2());
        System.out.println(r.getWood());
        r.display();
        r.measure();

        Divider d = new Divider("циркуль", "синий", 145, 15.6, false, "без карандаша", false);
        d.display();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.getMetal());
        r.display();
        d.draw_circle();
    }
}