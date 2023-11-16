package five;

import java.awt.Dimension;  //для размера окна
import java.awt.FlowLayout;  //для расположения элементов
import java.awt.Event; //для работы событий и слушателей
import java.awt.event.ActionEvent;  //для событий
import java.awt.event.ActionListener;  //для слушателей

import javax.swing.JButton;  //для кнопок
import javax.swing.JFrame;  //для создания приложения
import javax.swing.JPanel;  //для панели
import javax.swing.JTextField;  //для элемента с текстом

public class TestFrame extends JFrame{ // наследование класса JFrame для работы с графическим интрефейсом
    private static final long serialVersionUID = 1L;

    private JTextField textField;  //для текстового поля
    private JButton button1;  //кнопки
    private JButton button2;
    private JButton button3;
    public TestFrame(){
        super("Test frame");  //заголовок
        createGUI();  //вызов метода для создания приложения
    }
    public void createGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //определяем выход

        JPanel panel = new JPanel();  //объект панели для расположения элементов
        panel.setLayout(new FlowLayout());

        button1 = new JButton("Button 1");  //кнопка 1 с текстом на ней
        button1.setActionCommand("Button 1 was pressed");  //определяем действие при нажатии
        panel.add(button1);  //добавляем кнопку на панель

        button2 = new JButton("Button 2");  //то же самое
        button2.setActionCommand("Button 2 was pressed");
        panel.add(button2);

        button3 = new JButton("Button 3");
        button3.setActionCommand("Button 3 was pressed");
        panel.add(button3);

        textField = new JTextField();  //объект для текствого поля
        textField.setColumns(23);  //определяем размерность текстового поля
        panel.add(textField);  //добавляем текстовое поле на панель

        ActionListener actionListener = new TestActionListener();  //объект с методом, выполняющим действие с кнопками

        button1.addActionListener(actionListener);  //добавляем к кнопкам эти действия
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        getContentPane().add(panel);  //добавление панели в приложение
        setPreferredSize(new Dimension(320, 100));  //определяем размер окна
    }

    public class TestActionListener implements ActionListener{
        //определение и выполнение действий при нажатии кнопок
        public void actionPerformed(ActionEvent e){
            JButton button = (JButton) e.getSource();
            System.out.println(button.getText() + ", " +
                    e.getActionCommand());
            if(e.getSource() != button3){
                textField.setText(e.getActionCommand());
            }else{
                ActionEvent e1 = new ActionEvent(button2, Event.MOUSE_DOWN, "Button 2 was pressed programmaticaly");
                ActionListener[] listeners;
                listeners = button2.getActionListeners();
                listeners[0].actionPerformed(e1);
            }
        }
    }
    public static void main(String[] args){
        //запуск программы
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
