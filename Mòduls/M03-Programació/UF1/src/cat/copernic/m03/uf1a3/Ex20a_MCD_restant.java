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
public class Ex20a_MCD_restant {
    
    public static void main(String[] args) {
        
        // m = 16, n = 60   
        // divisors(16)=1,2,4,8,16, divisors(60)=1,2,3,4,5,6,10,12,15,20,30,60
        // max(m,n) = 60, min(m,n) = 16
        // 60-16=44, 44-16=28, 28-16=12, 16-12=4, 12-4=8, 8-4=4
        //System.out.print("Introdueix un nombre natural: ");
        Scanner entrada = new Scanner(System.in);
        int m = entrada.nextInt();
        
        //System.out.print("Introdueix un altre nombre: ");
        int n = entrada.nextInt();        
        
        System.out.printf("El màxim comú divisor de %d i %d és:\n",m,n);
        if (m!=0 && n!=0) {
            while (n!=m) {
                int max=0,min=0;
                if (m>n) {
                    max = m;
                    min = n;
                } else {
                    max = n;
                    min = m;
                }

                m = max-min;
                System.out.println(max + " - " + min + " = " + m);            
                n = min;
            }
            System.out.println("MCD = " + n);
        }
        else {
            System.out.println("MCD = " + ((m==0)?n:m));  // Si m=0 -> n, else m
                                                          // (m==0)?n:m
        }
        
        
    }
}
