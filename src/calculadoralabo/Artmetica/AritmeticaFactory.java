/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo.Artmetica;
 import Convertor.convertor;
import calculadoralabo1.AbstractFactory;
/**
 *
 * @author LN710Q
 */
public class AritmeticaFactory implements AbstractFactory{
     @Override
    public convertor getConvertor(String conversion) {
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String operacion) {
        switch (operacion) {
            case "Suma":
                return new Suma();
           
        }
        return null;
    }
}
