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
public class Ex14_EndevinaAmbPistes {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int MAX = 10;
        System.out.println("He pensat un nombre entre 1 i " + MAX + 
                                                     ". Prova d’endevinar-ho!");
        
        int n = (int)(Math.random()*MAX + 1);
        int comptador = 1;
        while (true)
        {
            System.out.print("Resposta: ");
            int valorEntrat = entrada.nextInt();
            if (valorEntrat < n)
                System.out.println("Incorrecte, el nombre a endevinar és major. Prova de nou");
            else if (valorEntrat > n)
                System.out.println("Incorrecte, el nombre a endevinar és menor. Prova de nou");
            else
            {
                System.out.println("Correcte!");
                break;
            }
            ++comptador;
        }
        System.out.println("Has necessitat " + comptador + " intents per " +
                                                        "endevinar el nombre.");
    }
}
