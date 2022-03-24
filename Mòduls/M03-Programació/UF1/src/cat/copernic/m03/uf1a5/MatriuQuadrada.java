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
public class MatriuQuadrada {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int mida = 0;
        while (mida < 2 || mida > 10) 
        {
            System.out.print("Introdueix la mida de la matriu: [2-10]: ");
            mida = entrada.nextInt();
        }
        
        int[][] matriu = new int[mida][mida];
        int suma = 0;
        for (int i = 0; i < mida; ++i)
        {
            for (int j = 0; j < mida; ++j)
            {
                matriu[i][j] = (int)(Math.random()*9) + 1;
                System.out.print(matriu[i][j] + " ");
                //Suma
                if (i + j == mida - 1)
                    suma += matriu[i][j];
            }
            System.out.println("");
        }
        
        /*
        //int j = 5;
        for (int i = 0,j = mida - 1; i < mida; ++i,--j)        
            suma += matriu[i][j];
        */
        System.out.println("La suma dels valors de la diagonal inversa és: " + 
                                                                          suma);
        
        
    }
}
