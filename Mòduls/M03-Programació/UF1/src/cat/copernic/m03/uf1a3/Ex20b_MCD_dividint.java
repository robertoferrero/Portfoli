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
public class Ex20b_MCD_dividint {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int m = entrada.nextInt();
        
        //System.out.print("Introdueix un altre nombre: ");
        int n = entrada.nextInt();        
        
        int residu = -1;
        //System.out.printf("El màxim comú divisor de %d i %d és:\n",m,n);
        
        
        if (m!=0 && n!=0)
        {
            do
            {
                int max, min;
                if (m > n)
                {
                    max = m;
                    min = n;
                }
                else
                {
                    max = n;
                    min = m;
                }

                residu = max % min;
                System.out.println(max + " % " + min + " = " + residu);
                m = min;
                n = residu;
            } while (residu != 0);
        }
        else        
            m = (m == 0) ? n : m;
        
        System.out.println("MCD = " + m);
        
    }
}
