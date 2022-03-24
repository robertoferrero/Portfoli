/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author rferrero
 */
public class ExamenUF1P2_02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int TOTAL_LLETRES = 26;
        final String abecedari = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] frequencies = new int[TOTAL_LLETRES];
        System.out.print("Encriu una frase: ");
        String frase = entrada.nextLine().toUpperCase();        
        
        frase = frase.replaceAll("À", "A").replaceAll("É", "E").replaceAll("È", "E");
        frase = frase.replaceAll("Í", "I").replaceAll("Ó", "O").replaceAll("Ú", "U");
        frase = frase.replaceAll("Ï", "I").replaceAll("Ü", "U");
        
        //System.out.println(frase);
        entrada.close();
        
        for (int i = 0; i < frase.length(); ++i)
        {
            int posicio = abecedari.indexOf(frase.substring(i, i + 1));
            if (posicio != -1)
                ++frequencies[posicio];            
        }
        
        Locale.setDefault(Locale.US);
        for (int i = 0; i < frequencies.length; ++i)        
            System.out.printf("Freqüència de la lletra %s: %3.2f%% \n", 
           abecedari.substring(i,i+1),(float)frequencies[i]*100/frase.length());
                            
    }
    
}
