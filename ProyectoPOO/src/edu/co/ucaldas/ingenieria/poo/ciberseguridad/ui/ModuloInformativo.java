package edu.co.ucaldas.ingenieria.poo.ciberseguridad.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModuloInformativo extends JFrame {

    public ModuloInformativo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Reporte de Incidentes de Seguridad");

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 4, 10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        createPanel(contentPane, "Phishing", "Descripción: Software malicioso que cifra los archivos de la víctima y exige un rescate para restaurar el acceso", Color.RED);
        createPanel(contentPane, "Ransomware", "Descripción: Programa que bloquea el acceso a ciertos archivos o el sistema y exige un rescate para desbloquearlos", Color.BLUE);
        createPanel(contentPane, "Malware", "Descripción: Software diseñado para dañar, infiltrarse o robar información de un sistema informático", Color.GREEN);
        createPanel(contentPane, "Spyware", "Descripción: Software que recopila información sobre una persona u organización sin su conocimiento", Color.ORANGE);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createPanel(JPanel contentPane, String nombre, String descripcion, Color color) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setPreferredSize(new Dimension(200, 200));

        JLabel lblNombre = new JLabel(nombre);
        lblNombre.setFont(new Font("Arial", Font.BOLD, 18));
        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombre.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        JTextArea textArea = new JTextArea(descripcion);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setBackground(color);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton btnReportar = new JButton("Reportar");
        JLabel lblAtaques = new JLabel("0");
        lblAtaques.setFont(new Font("Arial", Font.BOLD, 16));

        btnReportar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numeroAtaques = Integer.parseInt(lblAtaques.getText());
                lblAtaques.setText(Integer.toString(numeroAtaques + 1));
            }
        });

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(lblNombre, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(lblAtaques);
        bottomPanel.add(btnReportar);

        panel.add(headerPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        contentPane.add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ModuloInformativo());
    }
}
