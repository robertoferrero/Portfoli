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
public class GeneradorTaulers {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueix l'amplada: ");
        int amplada = entrada.nextInt();

        System.out.print("|");
        for (int i = 1; i<= 8*amplada; ++i)
            System.out.print("-");
        System.out.println("|");
        
        for (int fila = 1; fila <= 8; ++fila)
        {            
            for (int alcada = 1; alcada <= amplada; ++alcada)
            {
                System.out.print("|");
                for (int columna = 1; columna <= 8; ++columna)
                {
                    for (int i = 1; i <= amplada; ++i)
                    {
                        if ((fila + columna) % 2 == 0)
                            System.out.print(" ");
                        else
                            System.out.print("#");
                    }
                }
                System.out.println("|");
            }
            
            
        }

        System.out.print("|");
        for (int i = 1; i<= 8*amplada; ++i)
            System.out.print("-");
        System.out.println("|");

        entrada.close();
    }
}
