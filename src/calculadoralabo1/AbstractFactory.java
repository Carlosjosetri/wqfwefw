/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo1;
import calculadoralabo.Artmetica.Aritmetica;
import Convertor.convertor;

public interface AbstractFactory {
    Aritmetica getAritmetica(String operacion);
    convertor getConvertor (String  conversion);
}