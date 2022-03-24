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
public class Buscaminas1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int columnes = 4;
        System.out.println("Introdueix la línia:");
        String linia = entrada.nextLine();
        
        char[] array = new char[columnes];
        //boolean[] array = new boolean[4];
        for (int i = 0; i < columnes; ++i)
        {
            array[i] = linia.charAt(i);
            /*if (linia.charAt(i) == '*')
                array[i] = true;
            else
                array[i] = false;
            array[i] = (linia.charAt(i) == '*') ? true : false;
            */
        }
        
        for (int i = 0; i < columnes; ++i)
        {
            if (array[i] != '*')
            {
                int comptador = 0;
                /*if (i > 0 && array[i-1] == '*')
                    ++comptador;
                if (i < (columnes - 1) && array[i+1] == '*')
                    ++comptador;
                */                
                
                for (int d = -1; d <= 1; ++d)
                    if ((i + d) > 0 && (i + d) < (columnes - 1) 
                            && array[i + d] == '*')
                        ++comptador;
                
                if (comptador > 0)
                    System.out.println(i + ": " + comptador);
            }
        }
        
            
        System.out.println("Contingut del buscamines: ");        
        for (int i = 0; i < columnes; ++i)
            System.out.print(array[i]);
        System.out.println("");
        
        
        int valor = Integer.MIN_VALUE;
        long valor2 = Long.MAX_VALUE;
    }
        
}
