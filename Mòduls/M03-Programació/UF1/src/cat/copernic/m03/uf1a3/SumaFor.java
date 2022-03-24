/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a3;

/**
 *
 * @author rferrero
 */
public class SumaFor {
    
    public static void main(String[] args) {
        
        int valor = 4;
        
        int suma = 0;
        for (int i = 1; i <= valor; ++i)
        {
            suma += i;
        }
        System.out.println("Valor de la suma: " + suma);
    }
    
}
