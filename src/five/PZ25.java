package five;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PZ25 extends JFrame {
    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
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
        setVisible(true);
    }

    private void addConfirmListener(){
        btnConfirm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println('h');
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
