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
public class Ex02_ComptaPositiusNegatiusZeros {
 
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        int positius = 0, negatius = 0, zeros = 0;
        System.out.println("Introdueix 10 nombres enters:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Nombre " + i + " = ");
            int valor = entrada.nextInt();
            
            if (valor > 0)            
                positius = incrementar(positius);
            else if (valor < 0)
                negatius = incrementar(negatius);
            else  // valor = 0
                zeros = incrementar(zeros);            
        }
        
        System.out.println("Entre els valors que has introduït hi ha:");
        System.out.println(positius + " nombre/s positiu/s");
        System.out.println(negatius + " nombre/s negatiu/s");
        System.out.println(zeros + " nombre/s zero (0)");
    }
    
    static int incrementar(int valor) {        
        return ++valor;
    }
            
}
