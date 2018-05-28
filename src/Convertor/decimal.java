/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;

import Convertor.convertor;

/**
 *
 * @author LN710Q
 */
public class decimal implements convertor {
    
    
    @Override
    public double result(double val){
           double[] binario = {val};
        int exp = 0;
        double decimal = 0;

        for(int i = 0; i < binario.length; i++) {
            for(exp = 0; exp < 4; exp++) {
                decimal = binario[i] * (int)Math.pow(2, exp);
            }
        }
       
        return decimal;
    }
}
