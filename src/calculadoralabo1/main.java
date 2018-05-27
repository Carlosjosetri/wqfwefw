/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo1;
import Convertor.convertor;
import GUI.Ventana;
import calculadoralabo.Artmetica.Aritmetica;
import javax.swing.JFrame;
/**
 *
 * @author CARLOS
 */
public class main {
      public static void main(String[] args){
        AbstractFactory factory;

        factory =  factoryproducer.getFactory("aritmetica");
        Aritmetica sumita = factory.getAritmetica("Suma");
       
          System.out.println(sumita.result(4,5));

        JFrame ventana = new JFrame ("calculadora");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
