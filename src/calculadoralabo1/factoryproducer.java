/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo1;
import calculadoralabo.Artmetica.AritmeticaFactory;
import Convertor.ConvertorFactory;
/**
 *
 * @author CARLOS
 */
public class factoryproducer {
      public static AbstractFactory getFactory(String type){
        switch (type){
            case "aritmetica":
                return  new AritmeticaFactory();
            case "convertir":
                return new ConvertorFactory();
        }
        return null;
    }
}
