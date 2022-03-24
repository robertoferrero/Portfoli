/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class ControlErrors {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        int valor;
        while (entrada.hasNextInt())
        {
            valor = entrada.nextInt();
            if (valor != 0)
                System.out.println("Valor: " + valor);
        }
        
        System.out.println("Final del programa.");
        
    }
    
}
