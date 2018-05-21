/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {

    public int WIDTH = 400, widthTF = 300, widthB = 90;
    public int HEIGHT = 400, heightTF = 300, heightB = 90;
    public JTextField textF1, textF2;
    public JButton button;

    public Ventana() {
        setLayout(null);

        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(40, 25, widthTF, heightTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(200, 220, widthTF, heightTF));

        button = new JButton("Copiar");
        button.setBounds(new Rectangle(300, 225, widthB, heightB));

        textF1.setEditable(true);
        textF2.setEditable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textF2.setText(textF1.getText());
            }

        });

        add(textF1);
        add(button);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

}
