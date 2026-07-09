import java.awt.*;

public class IntroToAWT extends Frame {

    public IntroToAWT() {
        super("AWT app");

        this.setLayout(new FlowLayout()); // or new BorderLayout();

        Label label = new Label("Enter your name");
        TextField textField = new TextField(30);
        Button button = new Button("submit");

        this.add(label);
        this.add(textField);
        this.add(button);

        this.setSize(400, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
       IntroToAWT awt1 = new IntroToAWT();
       IntroToAWT awt2 = new IntroToAWT();
    
    }
}

