/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;
/**
 *
 * @author rferrero
 */
public class UF1P02_Ex1DesxifratRotatori {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //System.out.print("Introdueix la clau de xifrat [1-9]: ");
        int N = entrada.nextInt();
        entrada.nextLine();
        
        //System.out.println("Introdueix una frase xifrada: ");
        String frase = entrada.nextLine();
                                                       
        String[] paraules = frase.split(" ");
        
        int desplacament = 0;
        for(int i = 0;i < paraules.length;++i) 
        {
            char[] paraula = paraules[i].toCharArray();
            desplacament = 0;
            do 
            {
                int posFinal = Math.min(N, paraula.length - desplacament);
                char valorFinal = paraula[desplacament + posFinal - 1];
                for(int j = posFinal - 1;j > 0;--j)
                    paraula[j + desplacament] = paraula[j + desplacament - 1];
                paraula[desplacament] = valorFinal;                    
                desplacament += N;                        
            } while(desplacament < paraula.length);
            paraules[i] = new String(paraula);
        }

        // Segon pas
        //System.out.println("Frase desxifrada:");                
        desplacament = 0;
        do 
        {                    
            int posFinal = Math.min(N, paraules.length - desplacament);
            String valorFinal = paraules[desplacament + posFinal - 1];
            for(int i = posFinal - 1;i > 0;--i)                        
                paraules[i + desplacament] = paraules[i + desplacament - 1];
            paraules[desplacament] = valorFinal;                    
            
            desplacament += N;		
        } while(desplacament < paraules.length);
        
        for (String paraula:paraules)
            System.out.print(paraula + " ");
        System.out.println("");
        
        entrada.close();
        }
}