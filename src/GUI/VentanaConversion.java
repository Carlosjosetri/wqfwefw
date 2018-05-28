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
    private JLabel valor1, valor2, resultado, signos;           // etiqueta o texto no editable
    private JTextField caja, caja2, caja3;        // caja de texto, para insertar datos
    JButton Botonsuma, Botonresta, Botonmultiplicacion, Botondivision;          // boton con una determinada accion

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
        valor2 = new JLabel();
        signos = new JLabel();
        resultado = new JLabel();
        AbstractFactory factory;
        factory =  factoryproducer.getFactory("aritmetica");
        caja = new JTextField();
        caja2 = new JTextField();
        caja3 = new JTextField();
        Botonsuma = new JButton("Suma");
        Botonresta = new JButton("Resta");
        Botonmultiplicacion = new JButton("Multiplicacion");
        Botondivision = new JButton("Division");
        valor1.setText("Valor 1");
        valor2.setText("valor 2");
        signos.setText("+,-,*,/");
        resultado.setText("resultado");

        // configuramos los componentes
        // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        Botonsuma.setBounds(50, 125, widthBT, heightBT);
        Botonresta.setBounds(50, 40, widthBT, heightBT);
        Botonmultiplicacion.setBounds(200, 125, widthBT, heightBT);
        Botondivision.setBounds(200, 40, widthBT, heightBT);
        valor1.setBounds(50, 180, 100, 25);
        caja.setBounds(50, 200, 100, 25);
        caja3.setBounds(130, 270, 100, 25);
        resultado.setBounds(130, 250, 100, 25);
        signos.setBounds(160, 200, 100, 25);
        caja2.setBounds(200, 200, 100, 25);
        valor2.setBounds(200, 180, 100, 25);
        // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
           Botonsuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritmetica sumita = factory.getAritmetica("Suma");
                
                caja3.setText(String.valueOf(sumita.result(Integer.parseInt(caja.getText()), Integer.parseInt(caja2.getText()))));
            }
        });
           Botonsuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritmetica sumita = factory.getAritmetica("Suma");
                
                caja3.setText(String.valueOf(sumita.result(Integer.parseInt(caja.getText()), Integer.parseInt(caja2.getText()))));
            }
        });
           Botonresta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritmetica sumita = factory.getAritmetica("Resta");
                
                caja3.setText(String.valueOf(sumita.result(Integer.parseInt(caja.getText()), Integer.parseInt(caja2.getText()))));
            }
        });
           Botonmultiplicacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritmetica sumita = factory.getAritmetica("Multiplicacion");
                
                caja3.setText(String.valueOf(sumita.result(Integer.parseInt(caja.getText()), Integer.parseInt(caja2.getText()))));
            }
        });
           Botondivision.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritmetica sumita = factory.getAritmetica("Division");
                
                caja3.setText(String.valueOf(sumita.result(Integer.parseInt(caja.getText()), Integer.parseInt(caja2.getText()))));
            }
        });

        this.add(Botonsuma);
        this.add(Botonresta);
        this.add(Botonmultiplicacion);
        this.add(Botondivision);
        this.add(caja);
        this.add(caja2);
        this.add(caja3);
        this.add(valor1);
        this.add(valor2);
        this.add(resultado);
        this.add(signos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // mostramos un mensaje (frame, mensaje)
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
