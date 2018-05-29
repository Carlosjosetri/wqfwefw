package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Convertor.convertor;

import calculadoralabo.Artmetica.Aritmetica;
import calculadoralabo1.AbstractFactory;
import calculadoralabo1.factoryproducer;

/**
 * Clase Ventana Muestra la estructuta que deberia tener una Ventana en Java con
 * la libreria Swing, contiene una etiqueta, un caja de texto y un boton, que
 * tiene la accion de mostrar el texto en la caja por una ventana de mensaje.
 *
 * @author Daniel Alvarez (a3dany)
 */
public class VentanaConversion extends JFrame implements ActionListener {

    private int widthBT = 100, heightBT = 30;
    private JLabel valor1,  resultado;           // etiqueta o texto no editable
    private JTextField caja, caja3;        // caja de texto, para insertar datos
    JButton BotonBinario, BotonDecimal;          // boton con una determinada accion

    public VentanaConversion() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("calculadora");                   // colocamos titulo a la ventana
        this.setSize(300, 300);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        valor1 = new JLabel();
        
        
        resultado = new JLabel();
        AbstractFactory factory;
        factory =  factoryproducer.getFactory("convertir");
        caja = new JTextField();
       
        caja3 = new JTextField();
        BotonBinario = new JButton("Binario");
        BotonDecimal = new JButton("decimal");
       
        valor1.setText("convertir");
        
        
        resultado.setText("convertido");

        // configuramos los componentes
        // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        BotonBinario.setBounds(160, 40, widthBT, heightBT);
        BotonDecimal.setBounds(50, 40, widthBT, heightBT);
        
        valor1.setBounds(50, 100, 100, 25);
        caja.setBounds(50, 120, 100, 25);
        caja3.setBounds(160, 120, 100, 25);
        resultado.setBounds(160, 100, 100, 25);
        
        
        
        // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
          BotonBinario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                convertor hola = factory.getConvertor("binario");
                caja3.setText(String.valueOf(hola.result(Double.parseDouble(caja.getText()))));
               
            }
        });
          BotonDecimal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                convertor sumita = factory.getConvertor("decimal");
                caja3.setText(String.valueOf(sumita.result(Double.parseDouble(caja.getText()))));
                
               
            }
        });
      

        this.add(BotonBinario);
        this.add(BotonDecimal);
       
        this.add(caja);
        
        this.add(caja3);
        this.add(valor1);
        
        this.add(resultado);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // mostramos un mensaje (frame, mensaje)
    }

   
}
