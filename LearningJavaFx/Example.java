package LearningJavaFx;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        Frame f =  new Frame("hello world this is my first AWT program");
        f.setSize(300,200);
        f.setVisible(true);
        f.setResizable(true);
        // f.setBackground(Color.BLACK);

        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.setBackground(Color.lightGray);
        p.add(new Button("Save"));
        p.add(new Button("Load"));

        Panel r = new Panel();
        r.setLayout(new GridLayout(2,2));
        r.add(new Label("Name:"));
        r.add(new TextField(10));
        r.add(new Label("Age:"));
        r.add(new TextField(10));

        f.add(p);
        f.add(r);
        f.add(p);



    }
}