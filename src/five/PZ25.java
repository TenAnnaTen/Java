package five;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PZ25 extends JFrame {
    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
    private JButton btnInput1 = null;
    public PZ25(){
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contents = new JPanel();
        contents.setLayout(null);

        JLabel label = new JLabel("Привет! Хочешь зарегистрироваться?");
        label.setBounds(85, 5, 500, 30);
        contents.add(label);

        btnConfirm1 = new JButton("Да");
        btnConfirm1.setBounds(105, 40, 85, 30);
        contents.add(btnConfirm1);

        btnConfirm2 = new JButton("Нет");
        btnConfirm2.setBounds(195, 40, 85, 30);
        contents.add(btnConfirm2);

        addConfirmListener();

        setContentPane(contents);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addConfirmListener(){
        btnConfirm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                while(result.length() <= 5){
                    result = JOptionPane.showInputDialog(PZ25.this,
                            "<html><h2>Введите логин\n(без пробелов, более 5 символов)");
                    if(result.contains(" ")) result = "";
                }
                String result2 = "";
                String f = "";
                while(result2.length() <= 8  || !(f.contains("D") && f.contains("S"))){
                    result2 = JOptionPane.showInputDialog(PZ25.this,
                            "<html><h2>Введите пароль\n" +
                                    "(без пробелов, более 8 символов, содержащий хотя бы одну цифру и одну букву)");
                    for (char c : result2.toCharArray()){
                        if(Character.isDigit(c)) f += "D";
                        if(Character.isAlphabetic(c)) f += "S";
                    }
                }
                String result3 = "";
                while(!(result3.equals(result2))){
                    result3 = JOptionPane.showInputDialog(PZ25.this,
                            "<html><h2>Повторите пароль");
                }
                JOptionPane.showMessageDialog(PZ25.this,
                        "<html><h2>Поздравляю!\n" +
                                "Вы успешно зарегестрированы");
                System.exit(0);
            }
        });
        btnConfirm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
       new PZ25();
    }


}
