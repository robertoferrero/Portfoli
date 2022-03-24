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
public class XifratRotatori {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix la clau de xifrat [1-9]: ");
        int N = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introdueix una frase: ");
        String frase = entrada.nextLine();
        
        String[] paraules = frase.split(" ");
        
        // 1er pas
        int offset = 0;
        do
        {
            int posFinal = Math.min(N , paraules.length - offset);
            String paraulaInicial = paraules[offset];
            for (int i = 0; i < posFinal - 1; ++i)
            {
                paraules[i + offset] = paraules[offset + i + 1];
            }
            paraules[posFinal - 1 + offset] = paraulaInicial;
            offset += N;
        } while (offset < paraules.length);
        
        
        System.out.print("Primer pas: ");
        for (String paraula : paraules)
            System.out.print(paraula + " ");
        System.out.println("");
         
        //2on pas
        for (int i = 0; i < paraules.length; ++i)
        {
            char[] paraula = paraules[i].toCharArray();
            offset = 0;
            do
            {
                int posFinal = Math.min(N , paraula.length - offset);
                char caracterInicial = paraula[offset];
                for (int j = 0; j < posFinal - 1; ++j)
                {
                    paraula[offset + j] = paraula[offset + j + 1];
                }
                paraula[posFinal - 1 + offset] = caracterInicial;
                offset += N;
            } while (offset < paraula.length);
            paraules[i] = String.copyValueOf(paraula);
        }
        
        System.out.print("Segon pas: ");
        for (String paraula : paraules)
            System.out.print(paraula + " ");
        System.out.println("");
                 
        
    }
}
