/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex06_InvertirVector {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int LONGITUD_TOTAL = 10;
        
        System.out.println("Introdueixi " + LONGITUD_TOTAL + 
                                                   " nombres enters:");
        
        int[] nombres = new int[LONGITUD_TOTAL];
        for (int i = 0; i < nombres.length; ++i)
        {
            System.out.print("Introdueixi enter " + (i + 1) + ": ");            
            nombres[i] = entrada.nextInt();
        }
        
        // Mostra vector
        System.out.println("El teu vector és:");
        for (int i = 0; i < nombres.length; ++i)
        {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1)
                System.out.print(", ");
        }
        System.out.println(".");
        
        // Mostra vector invertit
        System.out.println("El teu vector invertit és:");
        for (int i = nombres.length - 1; i >= 0; --i)
        {
            System.out.print(nombres[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println(".");        
        
    }
}
