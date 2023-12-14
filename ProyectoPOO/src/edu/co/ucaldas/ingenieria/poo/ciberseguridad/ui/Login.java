package edu.co.ucaldas.ingenieria.poo.ciberseguridad.ui;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField username;
    private JPasswordField password;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 459, 450);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(235, 242, 247));
        contentPane.setBorder(BorderFactory.createLineBorder(new Color(85, 141, 214), 2));
        setContentPane(contentPane);

        JLabel loginpage = new JLabel("CIBER INNOVA");
        loginpage.setForeground(new Color(33, 89, 126));
        loginpage.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel loginUsername = new JLabel("Username");
        loginUsername.setForeground(new Color(33, 89, 126));
        loginUsername.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel loginPassword = new JLabel("Password");
        loginPassword.setForeground(new Color(33, 89, 126));
        loginPassword.setFont(new Font("Arial", Font.BOLD, 16));

        username = new JTextField();
        username.setColumns(20);
        username.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(85, 141, 214), 1), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        password = new JPasswordField();
        password.setColumns(20);
        password.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(85, 141, 214), 1), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        JButton login = new JButton("Login");
        login.setForeground(Color.WHITE);
        login.setBackground(new Color(33, 89, 126));
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("xxSofxx") && password.getText().equals("admin123")) {
                    Menu menuPage = new Menu();
                    menuPage.add(menuPage);
                    dispose();
                } else if (username.getText().isEmpty() || password.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the Username or Password :(");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password :(");
                }
            }
        });
        login.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        contentPane.setLayout(gl_contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(100, Short.MAX_VALUE)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(loginpage)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginUsername)
                                                        .addComponent(loginPassword))
                                                .addGap(18)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(password, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(username, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                        .addComponent(login, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(100, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(loginpage)
                                .addGap(40)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginUsername)
                                        .addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(20)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginPassword)
                                        .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(20)
                                .addComponent(login, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
    }
}
