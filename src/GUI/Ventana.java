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
    
    private int widthBT = 100, heightBT = 30;
    JButton BotonAritmetica, Botonconvertor;
    
    
    public Ventana(){
        Botonconvertor = new JButton("Convertir");
        BotonAritmetica = new JButton("Aritmetica");
       
        
        Botonconvertor.setBounds(123, 125, widthBT, heightBT);
        BotonAritmetica.setBounds(123, 40, widthBT, heightBT);
     
       
        add(Botonconvertor);
        add(BotonAritmetica);
       
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        //Suma(Integer.parseInt(Val1.getText()),Integer.parseInt(Resultado.getText()));
        
    }
   
}


