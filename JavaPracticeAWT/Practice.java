package JavaPracticeAWT;
import java.awt.*;
public class Practice extends Frame {

    public Practice(){

        this.setLayout(null);

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20,20,20,20);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        this.add(new Label("Username"),gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        this.add(new TextField(30),gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.WEST;
        this.add(new Label("Password"),gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        this.add(new TextField(30),gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;

        Panel myPanel = new Panel();
        myPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,5,5));

        Button btn1 = new Button("Username");
        Button btn2 = new Button("Password");

        // btn1.addActionListener();


        //i will do the ActionListener concepts tomorrow.
        myPanel.add(btn1);
        myPanel.add(btn2);
        this.add(myPanel,gbc);

        this.setSize(750,400);
        this.setVisible(true);
        this.setResizable(true);

    }
    public static void main(String args[]){
        Practice p = new Practice();
        
    }

}
