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
public class Main {
    public static void main(String[] args) {
        CapturaNumeros Cap = new CapturaNumeros();
        Calculadora Cal = new Calculadora();
        Cap.Capturar();
        
        // sumando
        Cal.Suma(Cap.num1, Cap.num2);
        JOptionPane.showMessageDialog(null, "Suma : "+Cal.resultado, "Suma", 0);
        // restando
        Cal.Resta(Cap.num1, Cap.num2);
        JOptionPane.showMessageDialog(null, "Resta : "+Cal.resultado, "Resta", 0);
        
        // multiplicando
        Cal.Multiplicacion(Cap.num1, Cap.num2);
        JOptionPane.showMessageDialog(null, "Multiplicacion : "+Cal.resultado, "Multiplicacion", 0);
        
        // Dividiendo
        Cal.Division(Cap.num1, Cap.num2);
        JOptionPane.showMessageDialog(null, "Division : "+Cal.resultado, "Division", 0);
}
}

