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
public class Ex04_FrequenciaNotes {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
            

        int[] comptadorNotes = new int[10];

        boolean sortir = false;
        int dada = -1;
        while (!sortir)
        {
            System.out.print("Introdueix una nota (de 1 a 10, o un valor"
                    + " diferent  per sortir): ");
            dada = entrada.nextInt();

            if (dada < 1 || dada > 10)
                sortir = true;
            else            
                comptadorNotes[dada-1]++;                         
        }
        
        for (int i = 0; i < comptadorNotes.length; ++i)                    
            System.out.println("La nota " + i + " ha sortit: " + 
                                               comptadorNotes[i] + " vegades.");
        
    }
}
