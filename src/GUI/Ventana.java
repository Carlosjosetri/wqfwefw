/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Roberto Alexander Rubio Castillo 00259517@uca.edu.sv
 */
public class Ventana extends JPanel {
    private int WIDTH = 300, HEIGHT = 300;
    private int widthTF = 120, heightTF = 80;
    private int widthBT = 60, heightBT = 30;
    JButton BotonSuma, BotonResta, BotonDivision, BotonMultipliacion, Binario;
    JTextField Val1, Resultado, Val2;
    
    public Ventana(){
        BotonSuma = new JButton("Sumar");
        BotonResta = new JButton("Restar");
        BotonDivision = new JButton("Dividir");
        BotonMultipliacion = new JButton("Multiplicar");
        Val1 = new JTextField();
        Val2 = new JTextField();
        Resultado = new JTextField();
        Resultado.setBounds (100, 200, widthTF, heightTF);
        Val1.setBounds (120,40, widthTF, heightTF);
        BotonSuma.setBounds(123, 125, widthBT, heightBT);
        BotonSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Val1.getText());
            }
        });
        Val1.setEditable(true);
        Resultado.setEditable(true);
        add(BotonSuma);
        add(Val1);
        add(Resultado);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        //Suma(Integer.parseInt(Val1.getText()),Integer.parseInt(Resultado.getText()));
        
    }
   
}


