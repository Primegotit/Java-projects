package practice;
//THIS ONE INCLUDES PREPARED STATEMENTS
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Practice extends Frame implements ActionListener {

    TextField txtUsername = new TextField(15);
    TextField txtPassword = new TextField(15);
    Button btnLogin = new Button("Login");
    Button btnReset = new Button("Reset");

    Connection con;

    public Practice() {
        // ----- Build the interface -----
        txtPassword.setEchoChar('*');

        setLayout(new FlowLayout());
        add(new Label("Username:"));
        add(txtUsername);
        add(new Label("Password:"));
        add(txtPassword);
        add(btnLogin);
        add(btnReset);

        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);

        setTitle("Login Form");
        setSize(300, 180);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        connectToDatabase();
    }

    // ----- Connect to MySQL once when the form opens -----
    private void connectToDatabase() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oop_assignment",
                    "root",
                    "promise"); // change to your MySQL password
            System.out.println("Connected to MySQL");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Could not connect: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            doLogin();
        } else {
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }

    private void doLogin() {
        String username = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();

        String sql = "SELECT * FROM tblusers WHERE username = ? AND password = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong username or password");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Practice();
    }
}