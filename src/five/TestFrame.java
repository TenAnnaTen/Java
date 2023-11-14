package five;

import java.awt.Dimension;  //для размера окна
import java.awt.FlowLayout;
import java.awt.Event; //для работы событий и слушателей
import java.awt.event.ActionEvent;  //для событий
import java.awt.event.ActionListener;  //для слушателей

import javax.swing.JButton;  //для кнопок
import javax.swing.JFrame;  //для создания приложения
import javax.swing.JPanel;  //для панели
import javax.swing.JTextField;  //для элемента с текстом

public class TestFrame extends JFrame{
    private static final long serialVersionUID = 1L;

    private JTextField textField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    public TestFrame(){
        super("Test frame");
        createGUI();
    }
    public void createGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        button1 = new JButton("Button 1");
        button1.setActionCommand("Button 1 was pressed");
        panel.add(button1);

        button2 = new JButton("Button 2");
        button2.setActionCommand("Button 2 was pressed");
        panel.add(button2);

        button3 = new JButton("Button 3");
        button3.setActionCommand("Button 3 was pressed");
        panel.add(button3);

        textField = new JTextField();
        textField.setColumns(23);
        panel.add(textField);

        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public class TestActionListener implements ActionListener{
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
