package four;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        int w = 900;
        int h = 800;
        JFrame f = new JFrame();  //экземпляр класа для работы с граф интерфейсом
        DrawingCanvas dc = new DrawingCanvas(w, h);  //экземпляр класса светофора
        f.setSize(w, h);  //размер окна
        f.setTitle("Светофор");  //заголовок
        f.add(dc);  //добавление светофора
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //определение функции закрытия
        f.setVisible(true);  //делаем окно видимым
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        new JLayeredPaneTest();
//        new ContentPaneReplace();
    }
}
