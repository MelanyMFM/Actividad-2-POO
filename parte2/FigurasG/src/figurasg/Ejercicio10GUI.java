/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasg;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio10GUI extends JFrame implements ActionListener {
    private JTextField numeroInscripcionField;
    private JTextField nombreField;
    private JTextField patrimonioField;
    private JTextField estratoField;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public Ejercicio10GUI() {
        setTitle("Calculadora de Pago de Matrícula");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel numeroInscripcionLabel = new JLabel("Número de inscripción:");
        numeroInscripcionField = new JTextField(10);

        JLabel nombreLabel = new JLabel("Nombre del estudiante:");
        nombreField = new JTextField(20);

        JLabel patrimonioLabel = new JLabel("Patrimonio del estudiante:");
        patrimonioField = new JTextField(10);

        JLabel estratoLabel = new JLabel("Estrato del estudiante:");
        estratoField = new JTextField(5);

        calcularButton = new JButton("Calcular Matrícula");
        calcularButton.addActionListener(this);

        resultadoLabel = new JLabel("");

        add(numeroInscripcionLabel);
        add(numeroInscripcionField);
        add(nombreLabel);
        add(nombreField);
        add(patrimonioLabel);
        add(patrimonioField);
        add(estratoLabel);
        add(estratoField);
        add(calcularButton);
        add(resultadoLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            String numeroInscripcion = numeroInscripcionField.getText();
            String nombre = nombreField.getText();
            int patrimonio = Integer.parseInt(patrimonioField.getText());
            byte estrato = Byte.parseByte(estratoField.getText());

            double matricula = 50000;
            if (patrimonio > 2000000 && estrato > 3) {
                matricula += (patrimonio * 0.03);
            }

            resultadoLabel.setText("El estudiante con número de inscripción " + numeroInscripcion +
                    " y nombre " + nombre + " debe pagar $" + matricula);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ejercicio10GUI app = new Ejercicio10GUI();
                app.setVisible(true);
            }
        });
    }
}
