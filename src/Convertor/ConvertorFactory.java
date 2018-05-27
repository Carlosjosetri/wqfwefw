/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;
import calculadoralabo.Artmetica.*;
 import Convertor.convertor;
import calculadoralabo1.AbstractFactory;
/**
 *
 * @author LN710Q
 */
public class ConvertorFactory implements AbstractFactory{
     @Override
    public convertor getConvertor(String conversion) {
        
         switch (conversion) {
            case "decimal":
                return new decimal();
            case "binario":
                return new binario();
        }
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String operacion) {
       
        return null;
    }
}
