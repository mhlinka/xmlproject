import javax.swing.*;

/**
 * Created by Michal on 4/24/2015.
 */
public class app {
    private JButton makeButton;
    private JList list1;
    private JPanel name;
    private JTextArea textArea1;
    private JSpinner spinner1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("app");
        frame.setContentPane(new app().name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
