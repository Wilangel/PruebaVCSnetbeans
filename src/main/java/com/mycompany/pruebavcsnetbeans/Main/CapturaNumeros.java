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
public class CapturaNumeros {
    int num1, num2;
    
    public void Capturar(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta Numero 1"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta Numero 2"));
        
    }
}
