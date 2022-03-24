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
public class Ex32_QuadratBuit {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int longitudQuadrat = 0;
        boolean entradaCorrecte = false;
        do 
        {
            if (entrada.hasNextInt())
            {
                longitudQuadrat = entrada.nextInt();
                if (longitudQuadrat >= 2 && longitudQuadrat <= 80)
                    entradaCorrecte = true;
                else
                    System.out.println("La longitud no és correcta.");
            } else {
                System.out.println("La longitud no és correcta.");
                entrada.next();
            }
        } while (!entradaCorrecte);
        
        System.out.println(longitudQuadrat);
    }
}
