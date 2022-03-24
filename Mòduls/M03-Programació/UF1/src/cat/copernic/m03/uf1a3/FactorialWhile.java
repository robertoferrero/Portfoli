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
public class FactorialWhile {
    
    public static void main(String[] args) {
        
        int n = 5;
        int factorial = 1;
        //for (int i = 1; i <= n; ++i)
        int i = 1;
        while (i <= n)
        {
            factorial *= i;
            i++;
        }
        System.out.println("Valor de " + n + "!: " + factorial);
        
    }
}
