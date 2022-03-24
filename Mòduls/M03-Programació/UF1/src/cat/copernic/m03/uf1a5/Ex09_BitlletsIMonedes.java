/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author rferrero
 */
public class Ex09_BitlletsIMonedes {
 
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //System.out.print("Introdueixi quantitat de diners: ");
        float quantitat = entrada.nextFloat();
        entrada.close();

        int quantitatEnter = (int)(quantitat*100);

        // Desem els valors de bitllets i monedes en cèntims
        int[] valorsBitlletsMonedes = {500*100, 200*100, 100*100, 50*100, 20*100, 10*100, 5*100,
                                               2*100,1*100, 50, 20, 10, 5, 2, 1};
        int[] bitlletsMonedes = new int[15];

        for (int i = 0; i < valorsBitlletsMonedes.length; ++i)
        {
            bitlletsMonedes[i] =  quantitatEnter/valorsBitlletsMonedes[i];
            quantitatEnter %= valorsBitlletsMonedes[i];
        }

        // Mostra valors
        for (int i = 0; i < valorsBitlletsMonedes.length; ++i)
        {
            if (i < 7)
            {
                System.out.print("Bitllets de ");
                System.out.printf("%4d €: ", (int)(valorsBitlletsMonedes[i]/100.0));
            }
            else if (i < 9)
            {
                System.out.print("Monedes  de ");
                System.out.printf("%4d €: ", (int)(valorsBitlletsMonedes[i]/100.0));                        
            }
            else
            {
                System.out.print("Monedes  de ");
                System.out.printf("%1.2f €: ", valorsBitlletsMonedes[i]/100.0);
            }

            System.out.println(bitlletsMonedes[i]);
        }
        
        
    }
}
