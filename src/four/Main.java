package four;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.Canvas;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main extends Canvas {
    static int width = 750, heigth = 750;//размеры окна
    public static void main(String[] args) throws IOException {
        //для появления окна с нужными размерами
        JFrame frame = new JFrame();
        frame.setVisible(true);//делаем окно видимым
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//метод для закрытия окна
        frame.setTitle("Логотип DVD");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - heigth / 2, width, heigth+ 30);
        frame.getContentPane().setLayout(null);
        //выравнивание от верхнего левого угла
        frame.getContentPane().setBackground(Color.BLACK);//фон окна

        //добавление картинки и установка появления
        BufferedImage screamHead = ImageIO.read(
                new URL("https://www.dvdland.com.au/product_images/p/196/dvd_7__69128_std.jpg"));
        //скачиваем картинку
        int screamHeadWidth = screamHead.getWidth();//запоминаем ее размер
        int screamHeadHeight = screamHead.getHeight();//запоминаем ее размер
        JLabel wIcon = new JLabel(new ImageIcon(screamHead)); //создаем объект с картинкой, который будем размещать и двигать
        int startX = (int) (Math.random() * (width - screamHeadWidth)),
                startY = (int) (Math.random() * (heigth - screamHeadWidth));//новые рандомные координаты
        wIcon.setBounds(startX, startY, screamHeadWidth, screamHeadHeight);//устанавливаем начальное положение картинки
        frame.add(wIcon);//добавляем картинку на форму

        //делаем бесконечный цикл перемещения
        while (true){
            int newX = (int) (Math.random() * (width - screamHeadWidth)),
                    newY = (int) (Math.random() * (heigth - screamHeadWidth));//задаем новую точку
            int[][] path = drawBresenhamLine(startX, startY, newX, newY);//получаем путь(список координат к новой точке)
            startX = newX;
            startY = newY;
            for(int i = 5; i < path.length; i += 5){//идем по массиву точек с нужным шагом
                try{//сперва работает таймер
                    Thread.sleep(20);
                }catch (InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
                wIcon.setBounds(path[1][0], path[i][1], screamHeadWidth, screamHeadHeight);
                //перемещаем картинку в нужную точку
                wIcon.repaint();//перерисовываем картинку
            }
        }

    }

    public static int[][] drawBresenhamLine(int xstart, int ystart, int xend, int yend)//реализация подсчета координат
    //линии между двумя точками в пространстве по алгоритму Брезенхэма
    {
        int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

        dx = xend - xstart;//проекция на ось икс
        dy = yend - ystart;//проекция нв ось игрек

        incx = sign(dx);
        incy = sign(dy);

        if(dx < 0) dx = -dx;
        if(dy < 0) dy = -dy;

        if(dx > dy){
            pdx = incx;
            pdy = 0;
            es = dy;
            el = dy;
        }else{
            pdx = 0;
            pdy = incy;
            es = dx;
            el = dy;
        }
        x = xstart;
        y = ystart;
        err = el / 2;
        int[][] a = new int[el = 1][2];
        a[0][0] = x;
        a[0][1] = y;
        for(int t = 0; t < el; t++){
            err -= es;
            if(err < 0){
                err+= el;
                x += incx;
                y += incy;
            }else{
                x += pdx;
                y += pdy;
            }
            a[t + 1][0] = x;
            a[t + 1][1] = y;
        }
        return a;
    }

    private static int sign(int x){
        return (x > 0) ? 1 : (x < 0) ? -1 : 0;
    }
}
