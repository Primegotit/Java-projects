package LearningJavaAWT;
import java.awt.*;

public class Example extends Frame{

    public Example(){

        this.setLayout(new GridBagLayout()); //initializing  the gridbaglayout so that i can control the placement of components
        GridBagConstraints gbc = new GridBagConstraints(); //initializing the gridbagconstraints which will act as the rulebook for every component, 
        gbc.insets = new Insets(20,20,10,200); //setting up the space outside every component

        gbc.gridx = 0; //column 
        gbc.gridy = 0; //row
        gbc.anchor = GridBagConstraints.WEST;
        this.add(new Label("Username"),gbc);

        gbc.gridx = 1; //column
        gbc.gridy = 0; //row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        this.add(new TextField(20),gbc);
        
        gbc.gridx = 0; //column
        gbc.gridy = 1; //row
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.WEST;
        this.add(new Label("Password"),gbc);
        
        gbc.gridx = 1; //column
        gbc.gridy = 1; //row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        this.add(new TextField(20),gbc);

        gbc.gridx = 1; //column
        gbc.gridy = 2; //row
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;

        Panel buttonPanel = new Panel(new FlowLayout(FlowLayout.RIGHT,10,10));
        buttonPanel.add(new Button("  Login  "));
        buttonPanel.add(new Button("  Reset  "));

        this.add(buttonPanel,gbc);

        // this.add(new Button("Reset"),gbc);


        // this.setLayout(new FlowLayout());
        // this.setLayout(new GridLayout(3, 3, 2, 90));

        // this.add(new Button("Button 1"));
        // this.add(new Button("Button 2"));
        // this.add(new Button("Button 3"));
        // this.add(new Button("Button 4"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));
        // this.add(new Button("Button 5"));


    

        // this.setLayout(null);
        // Label l1 = new Label("Registration Form");
        // this.add(l1);
        // l1.setBounds(400, 50, 100, 50);
        // Label l2 = new Label("First Name");
        // this.add(l2);
        // l2.setBounds(250, 100, 100, 10);
        // TextField t1 = new TextField(15);
        // add(t1);
        // t1.setBounds(400, 100, 100, 30);
        // Label l3 = new Label("Last Name");
        // this.add(l3);
        // l3.setBounds(250, 150, 100, 50);
        // TextField t2 = new TextField(15);
        // add(t2);
        // t2.setBounds(400, 150, 100, 30);
        // Label l4 = new Label("Address");
        // this.add(l4);
        // l4.setBounds(250, 200, 100, 50);
        // TextArea a = new TextArea(15,15);
        // this.add(a);
        // a.setBounds(400, 200, 100, 100);
        // Label l6 = new Label("Gender");
        // this.add(l6);
        // l6.setBounds(250, 300, 100, 50);
        // CheckboxGroup cbg = new CheckboxGroup();
        // Checkbox ch4 = new Checkbox("Male",cbg,false);
        // this.add(ch4);
        // ch4.setBounds(400, 300, 100, 50);
        // Checkbox ch5 = new Checkbox("Female",cbg,false);
        // this.add(ch5); 
        // ch5.setBounds(500, 300, 100, 50);

        // Label l5 = new Label("Hobbies");
        // this.add(l5);
        // l5.setBounds(250, 350, 90, 50);
        // Checkbox ch1 = new Checkbox("Cricket");
        // this.add(ch1);
        // ch1.setBounds(400, 350, 90, 50);
        // Checkbox ch2 = new Checkbox("Basketball");
        // this.add(ch2);
        // ch2.setBounds(500, 350, 90, 50);
        // Checkbox ch3 = new Checkbox("Coding");
        // this.add(ch3);
        // ch3.setBounds(600, 350, 90, 50);
        // Label l7 = new Label("Programming language");
        // this.add(l7);
        // l7.setBounds(250, 400, 140, 50);

        // List l = new List(4);
        // l.add("C++");
        // l.add("Java");
        // l.add("PHP");
        // l.add("Visual Basic");
        // this.add(l);
        // l.setBounds(400, 400, 200, 90);
        
        // Label l8 = new Label("Cities");
        // this.add(l8);
        // l8.setBounds(250, 500, 140, 50);

        // Choice c = new Choice();
        // c.add("Bulawayo");
        // c.add("Harare");
        // c.add("Kwekwe");
        // c.add("Bindura");
        // this.add(c);
        // c.setBounds(400, 500, 140, 50);

        // Button b1 = new Button("Send Data");
        // this.add(b1);
        // b1.setBounds(250, 550, 140, 50);
        


        // this.addWindowListener(new WindowAdapter(){
        //     public void windowClosing(WindowEvent e){
        //         System.exit(0);
        //     }
        // });

        this.setVisible(true);
        this.setSize(700, 700);
        this.setTitle("Registration Form");
        // this.setLayout(new FlowLayout());
        this.setResizable(true);
    }

    public static void main(String[] args) {
        Example ex1 = new Example();


    }
}