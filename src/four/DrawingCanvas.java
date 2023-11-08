package four;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Path2D;

public class DrawingCanvas extends JComponent{
    private int width;
    private int height;
    private Light red = new Light(Color.RED, 270);  //экземпляр класса, с передааным цветом и координатой
    private Light yellow = new Light(Color.YELLOW, 380);  //экземпляр класса, с передааным цветом и координатой
    private Light green = new Light(Color.GREEN, 490);  //экземпляр класса, с передааным цветом и координатой
    public DrawingCanvas(int w, int h){
        this.height = h;
        this.width = w;
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.DARK_GRAY); //определяем цвет
        g2d.fillRoundRect(300, 240, 130, 360, 25, 25); //рисуем основание светофора
        g2d.fillRoundRect(335, 603, 60, 65, 15, 15);  //рисуем ножку светофора
        red.drawLight(g2d);  //вызывем метод для рисования красного цвета
        yellow.drawLight(g2d);  //вызывем метод для рисования желтого цвета
        green.drawLight(g2d);  //вызывем метод для рисования зеленого цвета

        Path2D.Double hat = new Path2D.Double();
        hat.moveTo(320, 230);  //определение координат и вида верхнего элемента
        hat.lineTo(410, 230);
        hat.quadTo(410.5, 225.5, 410, 225);
        hat.curveTo(390, 215, 330, 215, 320, 225);
        hat.quadTo(315.5, 225.5, 320, 230);
        g2d.setColor(Color.DARK_GRAY);  //определяем цвета
        g2d.fill(hat);  //рисуем верхнюю часть светофора

        red.drawEar(g2d);  //вызываем метод для рисования правого бокового элемента
        yellow.drawEar(g2d);  //вызываем метод для рисования правого бокового элемента
        green.drawEar(g2d);  //вызываем метод для рисования правого бокового элемента
    }
}
