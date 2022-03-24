/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;

public class UF1P02_Ex2Matrius {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
				
        final int DIMENSIO = 4;
        int[][] matriu = new int[DIMENSIO][DIMENSIO];
        int[][] transposada = new int[DIMENSIO][DIMENSIO];

        int traca = 0;
        for(int i = 0; i < DIMENSIO; i++)
            for (int j = 0;j < DIMENSIO; j++) 
            {
                matriu[i][j] = entrada.nextInt();
                transposada[j][i] = matriu[i][j];
                if (i==j) traca += matriu[i][j];
            }

        entrada.close();
        
        
        for(int i = 0; i < DIMENSIO; ++i) {
            for (int j = 0; j < DIMENSIO; ++j)
            {
            	System.out.print(matriu[i][j]);
            	if (j < DIMENSIO - 1)
                    System.out.print("\t");
            }
            System.out.println("");
        } 

        System.out.println("");
        System.out.println("Traça: " + traca);
        System.out.println("");
        System.out.println("Matriu transposada:");

        for(int i = 0; i < DIMENSIO; ++i) 
        {
            for (int j = 0; j < DIMENSIO; ++j)
            {
            	System.out.print(transposada[i][j]);
            	if (j < DIMENSIO - 1)
                    System.out.print("\t");
            }
            System.out.println("");
        }   
    } 
}
