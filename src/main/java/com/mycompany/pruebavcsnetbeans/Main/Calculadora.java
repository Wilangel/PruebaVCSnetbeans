/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebavcsnetbeans.Main;

import javax.swing.JOptionPane;

/**
 *
 * @author WilangelSalsa
 */
public class Calculadora {
    int resultado;
    
    public int Suma(int num1, int num2){
        resultado = num1+num2;        
        return resultado;              
    }
    public int Resta(int num1, int num2){
        resultado = num1-num2;        
        return resultado;              
    }
    public int Multiplicacion(int num1, int num2){
        resultado = num1*num2;        
        return resultado;              
    }
    public int Division(int num1, int num2){
        try {
            resultado = num1/num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e, "Error", 0);
        }
    
        return resultado;              
    }
}
