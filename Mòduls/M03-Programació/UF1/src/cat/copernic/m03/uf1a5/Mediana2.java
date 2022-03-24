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
public class Mediana2 {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix una sèrie de nombres enters ordenats: ");
        String linia = entrada.nextLine();
        
        String[] valors = linia.split(" ");
        
                
        if (valors.length % 2 != 0)
            System.out.println(valors[valors.length / 2]); // Senar
        else
        {
            System.out.println((Float.parseFloat(valors[valors.length / 2]) + 
                               Float.parseFloat(valors[valors.length / 2 - 1])) / 2);
        }
            
        
        System.out.println("");
        
    }
}
