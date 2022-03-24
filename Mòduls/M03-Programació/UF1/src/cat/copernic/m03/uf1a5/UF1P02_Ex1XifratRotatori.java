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
public class UF1P02_Ex1XifratRotatori {

    public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        //System.out.print("Introdueix la clau de xifrat [1-9]: ");
        int N = entrada.nextInt();
        entrada.nextLine();
            
        //System.out.println("Introdueix una frase: ");
        String frase = entrada.nextLine();
        
        // Opcional: si la frase d'entrada sí tingués caràcters de puntuació
        //frase = frase.replaceAll("[.,;?!]", "");
        
            
        String[] paraules = frase.split(" ");

        int desplacament = 0;
        do 
        {                    
            int posFinal = Math.min(N, paraules.length - desplacament);
            String valorInicial = paraules[desplacament];
            for(int i = 0;i < posFinal - 1; ++i)                        
                paraules[i + desplacament] = paraules[desplacament + i + 1];
            paraules[posFinal - 1 + desplacament] = valorInicial;                    
    
            desplacament += N;		
        } while(desplacament < paraules.length);

        //System.out.println("Frase xifrada:");
        for(int i = 0;i < paraules.length;++i) 
        {
            char[] paraula = paraules[i].toCharArray();
            desplacament = 0;
            do 
            {
                int posFinal = Math.min(N, paraula.length - desplacament);
                char valorInicial = paraula[desplacament];
                for(int j = 0;j < posFinal - 1;++j)
                    paraula[j + desplacament] = paraula[desplacament + j + 1];
                paraula[posFinal - 1 + desplacament] = valorInicial;               
                
                desplacament += N;                        
            } while(desplacament < paraula.length);
            paraules[i] = new String(paraula);
            System.out.print(paraules[i] + " ");
        }
        System.out.println("");

        entrada.close();
    }
}
