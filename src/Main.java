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

        WritingMaterials pen = new WritingMaterials();
        pen.setName("Ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials("Линейка", 34);
        System.out.println(ruler.getName());
        System.out.println(ruler.getColor());
        System.out.println(ruler.getLength());
        System.out.println(ruler.getPrice());
        System.out.println(ruler.getDraw());
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.display();
        wm2.draw();
    }
}