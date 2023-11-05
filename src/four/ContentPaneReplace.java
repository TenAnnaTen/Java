package four;
import javax.swing.*;

public class ContentPaneReplace extends JFrame{
    private static final long serialVersionUID = 1L;

    public ContentPaneReplace(){
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contents = new JPanel();
        contents.add(new JButton("Семья"));
        contents.add(new JButton("Школа"));
        setContentPane(contents);

        setSize(200, 100);
        setVisible(true);
    }
}
