/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex17_E2 {
 
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueix un nombre natural: ");
        int n = entrada.nextInt();
        
        double resultat = 0.0;
        for (int i = 0; i <= n; ++i)
        {
            // Factorial de i! = 4! = 4*3*2*1
            int factorial = 1;        
            for (int j = i; j > 1; --j)        
                factorial *=  j; // factorial = factorial * j

            resultat += 1.0/factorial;
        }
        
        System.out.printf("El nombre e amb precisió " + n + 
                                              " és: %.10f\n",resultat); 
    }
}
