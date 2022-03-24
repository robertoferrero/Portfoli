/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex08_SubstitueixAsterisc {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix una frase que contingui algun asterisc: ");
        String frase = entrada.nextLine();
        
        System.out.print("Introdueix la frase que substituirà l'asterisc: ");
        String paraula = entrada.nextLine();
        
        int posicio = 0, novaPosicio = 0;
        String resultat = "";
        while ((novaPosicio = frase.indexOf("*",posicio)) != -1) 
        {                
            resultat += frase.substring(posicio, novaPosicio) + paraula;
            posicio = novaPosicio + 1;        
        }
        resultat += frase.substring(posicio);
        System.out.println(resultat);        
    }
}
