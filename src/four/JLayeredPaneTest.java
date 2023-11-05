package four;

import javax.swing.*;
import java.awt.Color;

public class JLayeredPaneTest extends JFrame {
    private static final long serialVersionUID = 1L;
    public JLayeredPaneTest(){
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();

        Figure figure1 = new Figure(Color.red, 0, "Figure popup");
        Figure figure2 = new Figure(Color.blue, 0, "Figure 1");
        Figure figure3 = new Figure(Color.cyan, 1, "Figure 2");

        figure1.setBounds(10, 40, 120, 120);
        figure2.setBounds(60, 120, 160, 180);
        figure3.setBounds(90, 55, 250, 180);

        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);

        lp.setPosition(figure3, 0);

        setSize(280, 250);
        setVisible(true);
    }
}
