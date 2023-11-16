package five;

import javax.swing.JPanel;  //библиотека для панели приложения
import javax.swing.JFrame;  //для создания приложения
import java.awt.event.ActionEvent;  //для работы с действиями кнопки
import javax.swing.JButton;  //для создания кнопок
import javax.swing.ImageIcon;  //для иконки
import javax.swing.UIManager;  //для локализации кнопок
import javax.swing.JOptionPane;  //для диалоговых окон
import java.awt.event.ActionListener;  //для работы с действиями кнопки

public class JOptionPaneTest extends JFrame{
    private JPanel contents = null;
    private JButton btnMessage1 = null;
    private JButton btnMessage2 = null;
    private JButton btnMessage3 = null;

    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
    private JButton btnConfirm3 = null;

    private JButton btnInput1 = null;
    private JButton btnInput2 = null;
    private JButton btnInput3 = null;

    private ImageIcon icon = null;
    private final String TITLE_message = "Окно сообщения";
    private final String TITLE_confirm = "Окно подтверждения";
    private String[] drink = {
            "Сок",
            "Минералка",
            "Лимонад",
            "Пиво"
    };
    public JOptionPaneTest(){
        super("Пример использовния JoptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //локализация кнопок
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");

        contents = new JPanel();
        icon = new ImageIcon("images/warning.png");

        btnMessage1 = new JButton("MessageDialog 2");
        btnMessage2 = new JButton("MessageDialog 4");
        btnMessage3 = new JButton("MessageDialog 5");

        btnConfirm1 = new JButton("ConfirmDialog 4+2");
        btnConfirm2 = new JButton("ConfirmDialog 5");
        btnConfirm3 = new JButton("ConfirmDialog 6");

        btnInput1 = new JButton("InputDialog 2+3");
        btnInput2 = new JButton("InputDialog 4");
        btnInput3 = new JButton("InputDialog 7");

        addMessageListener();
        addConfirmListener();
        addInputListener();

        //добавление кнопок на панель
        contents.add(btnMessage1);
        contents.add(btnMessage2);
        contents.add(btnMessage3);

        contents.add(btnConfirm1);
        contents.add(btnConfirm2);
        contents.add(btnConfirm3);

        contents.add(btnInput1);
        contents.add(btnInput2);
        contents.add(btnInput3);

        //добавление панели в приложение
        setContentPane(contents);
        setSize(600, 200);
        setVisible(true);
    }

    //добавление действий с кнопками
    private void addMessageListener(){
        btnMessage1.addActionListener(new ActionListener() {  //добавление слушателей
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        "<html><h2>Текст</h2><i>в виде разметки HTML</i>");
                }
            });
        btnMessage2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        new String[] {"Сообщение в виде массива строк :",
                        " - первая строка",
                        " - вторая строка"},
                        TITLE_message,
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        btnMessage3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        "Использование изображения в окне сообщений",
                        TITLE_message,
                        JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }
    private void addConfirmListener(){
        btnConfirm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                        "Вам это нужно?", TITLE_confirm, JOptionPane.YES_NO_CANCEL_OPTION);
                if(result == JOptionPane.YES_OPTION)
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                            "Вы не отказываетесь?");
                else if(result == JOptionPane.NO_OPTION)
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                            "Вы отказались?");
            }
        });
        btnConfirm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                        "Вы не отказываетесь?",
                        TITLE_confirm,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        btnConfirm3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                        "Вам нравится значок?",
                        TITLE_confirm,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        icon);
            }
        });
    }
    private void addInputListener(){
        btnInput1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = JOptionPane.showInputDialog(JOptionPaneTest.this,
                        "<html><h2>Добро пожаловать");
                JOptionPane.showInputDialog(JOptionPaneTest.this,
                        "Вы ответили", result);
            }
        });
        btnInput2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog(JOptionPaneTest.this,
                        new String[] {"Неверно введен пароль!",
                        "Повторите пароль :"},
                        "Авторизация",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        btnInput3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object result = JOptionPane.showInputDialog(JOptionPaneTest.this,
                        "Выберите любимый напиток: ",
                        "Выбор напитка",
                        JOptionPane.QUESTION_MESSAGE,
                        icon, drink, drink[0]);
                JOptionPane.showMessageDialog(JOptionPaneTest.this, result);
            }
        });
    }
}
