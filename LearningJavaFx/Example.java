package LearningJavaFx;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome");
        JButton button = new JButton("Click");
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
        
    }
}