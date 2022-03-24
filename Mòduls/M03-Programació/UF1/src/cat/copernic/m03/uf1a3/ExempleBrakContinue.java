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
public class ExempleBrakContinue {
    
    public static void main(String[] args) {
        
        /*int m = 5, n = 3;
        IniciBucle:
        while (m > n)
        {
            System.out.println("Valor de m: " + m);
            System.out.println("Valor de n: " + n);
            
            for (int i = 0; i < n; ++i)
            {
                System.out.print(i + " ");
                break IniciBucle;
            }
            System.out.println();
            
            ++n;
            //break;
        }*/
        
        Scanner entrada = new Scanner(System.in);
        int valor;
        
        //while (true) 
        for (;;)
        {
            valor = entrada.nextInt();
            if (valor != 0)
                System.out.println("Valor de entrada: " + valor);
            else
                break;
        }
        System.out.println("Final de programa!");
        
    }
    
}
