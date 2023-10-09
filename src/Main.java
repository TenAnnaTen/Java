public class Main {
    public static void main(String[] args) {

//        Animal tiger = new Animal("тигр", "Артем");
//        tiger.setAge(15);
//        tiger.setWeight(300.6);
//        tiger.setFly(false);
//        tiger.setSwim(true);
//        tiger.setWalk(true);
//        tiger.display();
//
//        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//        duck.holiday(5);
//        duck.rename("Утя-Утя");
//        duck.display();
//        System.out.println(duck.getAge());
//        System.out.println(duck.getName());
//        System.out.println(duck.getWeight());
//        System.out.println(duck.getType());
//        System.out.println(duck.getSwim());
//        System.out.println(duck.getWalk());
//        System.out.println(duck.getFly());

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