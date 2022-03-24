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
public class SerpCamell {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una variable en notació SCREAMING_SNAKE_CASE: ");
        String nomVariable = entrada.nextLine().toLowerCase();
        
        String[] paraules = nomVariable.split("_");
        
        
        System.out.println("Lower Camel Case:");
        System.out.print(paraules[0]);
        for (int i = 1; i < paraules.length; ++i)
        {
            // 1a lletra
            System.out.print(paraules[i].substring(0,1).toUpperCase());
            // Resta lletres
            System.out.print(paraules[i].substring(1));                                        
        }
        System.out.println("");
        
        System.out.println("KEBAB:");
        for (int i = 0; i < paraules.length; ++i)
        {
            System.out.print(paraules[i]);
            if (i < paraules.length - 1)
                System.out.print("-");            
        }
        System.out.println("");
        
        
        
    }
    
}
