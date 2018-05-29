package GUI;

import Convertor.convertor;
import calculadoralabo.Artmetica.Aritmetica;
import calculadoralabo1.AbstractFactory;
import calculadoralabo1.factoryproducer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase Ventana Muestra la estructuta que deberia tener una Ventana en Java con
 * la libreria Swing, contiene una etiqueta, un caja de texto y un boton, que
 * tiene la accion de mostrar el texto en la caja por una ventana de mensaje.
 *
 * @author Daniel Alvarez (a3dany)
 */
public class Ventana extends JFrame implements ActionListener {

    private int widthBT = 100, heightBT = 30;
    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    JButton BotonAritmetica, Botonconvertor;          // boton con una determinada accion

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("calculadora");                   // colocamos titulo a la ventana
        this.setSize(200, 200);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes

        Botonconvertor = new JButton("Convertir");
        BotonAritmetica = new JButton("Aritmetica");
        // configuramos los componentes
        // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        Botonconvertor.setBounds(50, 125, widthBT, heightBT);
        BotonAritmetica.setBounds(50, 40, widthBT, heightBT);
        BotonAritmetica.addActionListener(this);// hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        Botonconvertor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaConversion ventana1 = new VentanaConversion();
                ventana1.setVisible(true);// mostramos un mensaje (frame, mensaje)
                Ventana.this.dispose();
            }
        });

        this.add(Botonconvertor);
        this.add(BotonAritmetica);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaAritmetica ventana1 = new VentanaAritmetica();
        ventana1.setVisible(true);// mostramos un mensaje (frame, mensaje)
        Ventana.this.dispose();
    }

    public static void main(String[] args) {
         AbstractFactory factory;
        factory =  factoryproducer.getFactory("convertir");
        convertor hola = factory.getConvertor("binario");
        System.out.println(hola.result(1234));
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
