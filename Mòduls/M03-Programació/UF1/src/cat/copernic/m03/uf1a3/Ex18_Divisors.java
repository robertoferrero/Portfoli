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
public class Ex18_Divisors {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueixi un nombre natural: ");
        int n = entrada.nextInt();
        
        System.out.print("Els divisors de " + n + " són: ");
        
        for (int i = 1; i <= Math.sqrt(n); ++i)
            if (n % i == 0)
            {
                System.out.print( i + " ");
                if (n/i != i)
                    System.out.print(n/i + " ");                     
            }
        System.out.println();        
    }
}
