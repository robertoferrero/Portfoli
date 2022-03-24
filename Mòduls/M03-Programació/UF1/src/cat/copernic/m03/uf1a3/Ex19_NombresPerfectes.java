/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a3;

/**
 *
 * @author rferrero
 */
public class Ex19_NombresPerfectes {
 
    public static void main(String[] args) {
        
        final int MAX = 1000;
        
        System.out.println("Els nombres perfectes menors que " + MAX + " són: ");
        
        for (int num = 2; num < MAX; ++num)
        {
            int suma = 1;
            for (int j = 2; j <= Math.sqrt(num); ++j)
                if (num % j == 0)
                {
                    suma += j;
                    if (num/j != j && num != j && j != 1)
                        suma += num/j;
                }
            
            if (suma == num)
                System.out.print(num + " ");
        }
        System.out.println();
        
    }
}
