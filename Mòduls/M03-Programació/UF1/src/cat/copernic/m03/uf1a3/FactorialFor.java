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
public class FactorialFor {
    
   public static void main(String[] args) {                
        
        for (int n = 1; n <= 10; ++n)
        {
            int factorial = 1;
            for (int i = 1; i <= n; ++i)            
                factorial *= i;
            
            System.out.println("Valor de " + n + "!: " + factorial);
        }
    }    
}
