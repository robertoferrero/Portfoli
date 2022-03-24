/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;

public class Ex08_VectorPrimersPrimers {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //System.out.print("Introdueixi el total de nombres primers: ");

        int totalPrimers = entrada.nextInt();

        entrada.close();

        int[] primers = new int[totalPrimers];
        int valor = 2, comptadorPrimers = 0;
        while (comptadorPrimers < totalPrimers)
        {
            boolean esPrimer = true;
            for (int i = 2; i <= Math.sqrt(valor); ++i)
            {
                if (valor % i == 0)
                {
                    esPrimer = false;
                    break;
                }
            }
            if (esPrimer)
                    primers[comptadorPrimers++] = valor;
            ++valor;
        }

        // Mostra resultat
        for (int i = 0; i < primers.length; ++i)
        {
            System.out.print(primers[i]);
            if (i < primers.length - 1)
            {
                System.out.print(", ");
                if ((i + 1) % 10 == 0)
                    System.out.println();
            }
            else
                System.out.println(".");
        }                
    }
}

