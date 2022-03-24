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
public class Ex17_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueix un nombre natural: ");
        int precisio = entrada.nextInt();
        
        double resultat = 0.0;
        for (int i = 0; i <= precisio; ++i)
        {
            int factorial = 1;
            // Factorial
            if (i == 0)
                factorial = 1;
            else
                for (int j = 1; j <= i; ++j)
                    factorial *= j;
            
            resultat += 1.0/factorial;
        }
        System.out.printf("El nombre e amb precisió " + precisio + 
                                                       " és: %.10f\n",resultat);
        
        
    }
    
}
