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
public class MatriuQuadrada2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueix la mida de la matriu: [2-10]: ");
        int mida = entrada.nextInt();
        
        int[][] matriu = new int[mida][mida];
        
        int suma = 0;
        for (int i = 0; i < matriu.length; i++)
        {
            for (int j = 0; j < matriu[0].length; j++)
            {                
                matriu[i][j] = (int)(Math.random()*9) + 1;
                System.out.print(matriu[i][j] + " ");
                if (i + j == mida - 1)
                    suma += matriu[i][j];
            }
            System.out.println("");
        }
        
        /*
        for (int i = 0; i < mida; i++)
        {
            for (int j = 0; j < mida; j++)
            {   
                System.out.print(matriu[i][j] + " ");                
            }
            System.out.println("");
        }*/
        System.out.println("suma: " + suma);
    }
}
