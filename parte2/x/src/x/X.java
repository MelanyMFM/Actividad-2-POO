/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package x;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author santi
 */
public class X extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public X() {
        setTitle("Verificar si hay un cero entre los números");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        inputField = new JTextField(10);
        panel.add(inputField);

        checkButton = new JButton("Verificar");
        panel.add(checkButton);

        resultLabel = new JLabel();
        panel.add(resultLabel);

        add(panel, BorderLayout.CENTER);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verifyForZero();
            }
        });
    }

    private void verifyForZero() {
        int NN;
        try {
            NN = Integer.parseInt(inputField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para NN.");
            return;
        }

        int CONTA = 1;
        boolean ENCONTRADO = false;

        while (CONTA <= NN && !ENCONTRADO) {
            String input = JOptionPane.showInputDialog("Ingrese un número:");
            int NUM;
            try {
                NUM = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
                continue;
            }

            if (NUM == 0) {
                ENCONTRADO = true;
            } else {
                CONTA = CONTA + 1;
            }
        }

        if (ENCONTRADO) {
            resultLabel.setText("SI HAY UN CERO ENTRE LOS NUMEROS");
        } else {
            resultLabel.setText("NO HAY UN CERO ENTRE LOS NUMEROS");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                X gui = new X();
                gui.setVisible(true);
            }
        });
    }
}
