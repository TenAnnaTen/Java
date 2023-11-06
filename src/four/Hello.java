package four;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Hello {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame() {}; //объект класса с пустым конструктором
        jFrame.setVisible(true); //делаем видимым
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //определяем операцию закрытия приложения

        Toolkit toolkit = Toolkit.getDefaultToolkit(); //экземпляр класса Toolkit
        Dimension dimension = toolkit.getScreenSize(); //получение размеров экрана

        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300); //определяем расположение и размеры окна
        // ИЛИ
        // отдельно вручную попределяем размеры и расположение
        //  jFrame.setSize(500, 300);
        //  jFrame.setLocation(500, 400);
        // ИЛИ
        // сразу вместе вручную определем размеры и расположение
        // jFrame.setBounds(500, 500, 500, 300);

        jFrame.setTitle("And the dream was so close"); //добавление заголовка
    }
}
