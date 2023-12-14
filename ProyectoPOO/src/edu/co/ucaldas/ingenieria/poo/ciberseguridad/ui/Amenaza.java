package edu.co.ucaldas.ingenieria.poo.ciberseguridad.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Amenaza extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Amenaza frame = new Amenaza();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Amenaza() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.DARK_GRAY);
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        contentPane.setLayout(gl_contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(topPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(topPanel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addContainerGap(182, Short.MAX_VALUE))
        );

        JButton btnNewButton_1 = new JButton("Agregar nuevo incidente");
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(Color.BLUE);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModuloInformativo moduloreporte = new ModuloInformativo();
                moduloreporte.show();
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));

        GroupLayout gl_topPanel = new GroupLayout(topPanel);
        topPanel.setLayout(gl_topPanel);
        gl_topPanel.setHorizontalGroup(
                gl_topPanel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_topPanel.createSequentialGroup()
                                .addGap(20)
                                .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        gl_topPanel.setVerticalGroup(
                gl_topPanel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_topPanel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(mainPanel, BorderLayout.CENTER);
    }
}
