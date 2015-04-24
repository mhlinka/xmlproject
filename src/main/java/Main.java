import javax.swing.*;
import java.awt.*;

/**
 * Created by Michal on 4/23/2015.
 */
public class Main {


    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("xmlApp");
                frame.setVisible(true);
            }
        });
    }
}
