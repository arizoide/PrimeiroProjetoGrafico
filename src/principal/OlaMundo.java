package principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class OlaMundo {
    private JPanel panelPrincipal;
    private JLabel labelOlaMundo;
    private JButton buttonClique;
    private JTextField textValor1;
    private JTextField TextValor2;

    public OlaMundo() {
        buttonClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Recupera o valor inserido pelo usuário
                int valor1 = Integer.parseInt(textValor1.getText());
                int valor2 = Integer.parseInt(TextValor2.getText());

                labelOlaMundo.setText(String.valueOf(valor1 + valor2));
                labelOlaMundo.setForeground(Color.RED);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlaMundo");
        frame.setContentPane(new OlaMundo().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
