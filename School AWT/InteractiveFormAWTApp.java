import java.awt.*;
import java.awt.event.*; // Crucial for handling user actions

public class InteractiveFormAWTApp extends Frame implements ActionListener {
    
    
    private TextField textField;
    private Label displayLabel;
    private Button button;

    public InteractiveFormAWTApp() {
        this.setTitle("Interactive  FORM");
        this.setLayout(new FlowLayout());

        textField = new TextField(15);
        button = new Button("Greet Me!");
        displayLabel = new Label("Type something above and click the button.");

        button.addActionListener(this);

        this.add(textField);
        this.add(button);
        this.add(displayLabel);

       this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();                                  //free the resource
                System.exit(0);                      //close program
            }
            
        });

        this.setSize(300, 150);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = this.textField.getText();
        if (name.trim().isEmpty()) {
            this.displayLabel.setText("You didn't type anything.");
        } else {
            this.displayLabel.setText("Hello, " + name + "! Welcome to AWT.");
        }
    }

    public static void main(String[] args) {
        InteractiveFormAWTApp app1 = new InteractiveFormAWTApp();
    }
}