package edu.co.ucaldas.ingenieria.poo.ciberseguridad.ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Persona extends JFrame {

    private JPanel contentPane;
    private JTextField txtApellido;
    private JTextField txtCedula;
    private JTextField txtemail;
    private JTextField txtContrasena;
    private JTextField txtNombre;
    private JTextField txtDepartamento;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Persona frame = new Persona();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Persona() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 588, 620);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(contentPane);

        JLabel studentDetails = new JLabel("Creacion de Usuarios");
        studentDetails.setForeground(Color.BLUE);
        studentDetails.setFont(new Font("Arial", Font.BOLD, 22));

        JLabel[] labels = {new JLabel("Nombres"), new JLabel("Cedula"), new JLabel("Email"), new JLabel("Password"),
                new JLabel("Apellidos"), new JLabel("Area/Departamento")};

        for (JLabel label : labels) {
            label.setForeground(Color.BLUE);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setHorizontalAlignment(JLabel.LEFT);
        }

        txtApellido = new JTextField();
        txtApellido.setColumns(10);
        txtApellido.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        txtCedula = new JTextField();
        txtCedula.setColumns(10);
        txtCedula.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        txtemail = new JTextField();
        txtemail.setColumns(10);
        txtemail.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        JCheckBox chcEsAdmin = new JCheckBox("EsAdministrador");

        txtContrasena = new JTextField();
        txtContrasena.setColumns(10);
        txtContrasena.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.GRAY);

        JButton submit = new JButton("Registrar");
        submit.setForeground(Color.BLUE);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);
            }
        });

    JButton btnNewButton = new JButton("Cancel");
        btnNewButton.setForeground(Color.BLUE);
        btnNewButton.addActionListener(new

    ActionListener() {
        public void actionPerformed (ActionEvent e){
            dispose();
        }
    });
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    JLabel lblApellidos = new JLabel("Apellidos");
        lblApellidos.setForeground(Color.BLACK);
        lblApellidos.setFont(new

    Font("Dialog",Font.BOLD, 14));

    JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setForeground(Color.BLACK);
        lblNombre.setFont(new

    Font("Dialog",Font.BOLD, 14));

    JLabel lblCedula = new JLabel("Cedula");
        lblCedula.setForeground(Color.BLACK);
        lblCedula.setFont(new

    Font("Dialog",Font.BOLD, 14));

    JLabel lblContrasena = new JLabel("Password");
        lblContrasena.setForeground(Color.BLACK);
        lblContrasena.setFont(new

    Font("Dialog",Font.BOLD, 14));

    JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(Color.BLACK);
        lblEmail.setFont(new

    Font("Dialog",Font.BOLD, 14));

    txtNombre =new

    JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLUE));

    JLabel lblArea = new JLabel("Area/Departamento");
        lblArea.setFont(new

    Font("Dialog",Font.BOLD, 14));

    txtDepartamento =new

    JTextField();
        txtDepartamento.setColumns(10);
        txtDepartamento.setBorder(BorderFactory.createLineBorder(Color.BLUE));

    JComboBox comboBox = new JComboBox();
        comboBox.addItem("Ingeniería");
        comboBox.addItem("Seguridad");
        comboBox.addItem("TI");
        comboBox.setBorder(BorderFactory.createLineBorder(Color.BLUE));

    passwordField =new

    JPasswordField();

    GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
            .

    addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 715,Short.MAX_VALUE)
                        .

    addGroup(gl_contentPane.createSequentialGroup()
                                .

    addContainerGap()
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .

    addComponent(studentDetails)
                                        .

    addGroup(gl_contentPane.createSequentialGroup()
                                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
                                                        .

    addComponent(lblContrasena, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .

    addComponent(lblArea, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .

    addComponent(lblEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .

    addComponent(lblCedula, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .

    addComponent(lblNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .

    addComponent(lblApellidos, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194,GroupLayout.PREFERRED_SIZE))
            .

    addPreferredGap(ComponentPlacement.RELATED)
                                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                        .

    addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 480,Short.MAX_VALUE)
                                                        .

    addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 480,Short.MAX_VALUE)
                                                        .

    addComponent(txtCedula, GroupLayout.DEFAULT_SIZE, 480,Short.MAX_VALUE)
                                                        .

    addComponent(txtemail, GroupLayout.DEFAULT_SIZE, 480,Short.MAX_VALUE)
                                                        .

    addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 480,Short.MAX_VALUE) // Ajuste de tamaño
                                                        .

    addComponent(comboBox, 0,480,Short.MAX_VALUE) // Agregar ComboBox
                                                )
                                                        )
                                                        .

    addGroup(gl_contentPane.createSequentialGroup()
                                                .

    addComponent(submit, GroupLayout.PREFERRED_SIZE, 217,GroupLayout.PREFERRED_SIZE)
                                                .

    addPreferredGap(ComponentPlacement.RELATED, 206,Short.MAX_VALUE)
                                                .

    addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 178,GroupLayout.PREFERRED_SIZE)
                                                .

    addGap(104)
                                        )
                                                )
                                                .

    addContainerGap()
                        )
                                );

        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
            .

    addGroup(gl_contentPane.createSequentialGroup()
                                .

    addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 21,GroupLayout.PREFERRED_SIZE)
                                .

    addPreferredGap(ComponentPlacement.UNRELATED)
                                .

    addComponent(studentDetails)
                                .

    addGap(18)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                                        .

    addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 35,GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addPreferredGap(ComponentPlacement.RELATED)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                                        .

    addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 35,GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addPreferredGap(ComponentPlacement.RELATED)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(lblCedula)
                                        .

    addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, 37,GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addPreferredGap(ComponentPlacement.RELATED)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(lblEmail)
                                        .

    addComponent(txtemail, GroupLayout.PREFERRED_SIZE, 32,GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addPreferredGap(ComponentPlacement.RELATED)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(lblContrasena)
                                        .

    addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addPreferredGap(ComponentPlacement.RELATED)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(lblArea)
                                        .

    addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addPreferredGap(ComponentPlacement.RELATED, 37,Short.MAX_VALUE)
                                .

    addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .

    addComponent(submit, GroupLayout.PREFERRED_SIZE, 36,GroupLayout.PREFERRED_SIZE)
                                        .

    addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35,GroupLayout.PREFERRED_SIZE)
                                )
                                        .

    addContainerGap()
                        )
                                );

        contentPane.setLayout(gl_contentPane);

}
}
