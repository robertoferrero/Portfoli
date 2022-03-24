/*
        System.out.printf("%3d, ",21);
        System.out.printf("%3d, \n",23);
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
public class Ex05_Capicua {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre natural: ");
        String valor = entrada.nextLine();
                        
        int[] digits = new int[valor.length()];
        
        for (int i = 0; i < valor.length(); ++i)
            digits[i] = Integer.parseInt(valor.substring(i,i+1));
        
        System.out.println("El nombre " + valor + " té " + valor.length() + 
                                                                " xifres.");
              
        for (int i = 0; i < digits.length; ++i)
            System.out.println("Xifra " + (i + 1) + ": " + digits[i]);
        
        boolean esCapicua = true;
        for (int i = 0; i < digits.length/2; ++i)
        {
            if (digits[i] != digits[digits.length-1-i])
            {
                esCapicua = false;
                break;
            }
        }
        
        if (esCapicua)
            System.out.println("El teu nombre és capicua.");
        else
            System.out.println("El teu nombre NO és capicua.");

    }
}
