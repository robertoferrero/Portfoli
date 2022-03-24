package cat.copernic.m03.uf1a4;

import java.util.Scanner;

public class Ex05_Palindrom {

	public static void main(String[] args) {
		
            Scanner entrada = new Scanner(System.in);
		
            System.out.print("Introdueix una cadena de caràcters: ");
            String frase = entrada.nextLine();
		
            // Elimina espais en blanc
            String fraseSenseEspais = "";
            for (int i = 0; i < frase.length(); ++i)
            {
                if (frase.charAt(i) != ' ')
                    fraseSenseEspais += frase.charAt(i);
            }
            
            /*
             * Solució 1
             *
            String fraseInvertida = "";
            for (int i = frase.length() - 1; i >= 0; --i)
            {
                if (frase.charAt(i) != ' ')
                    fraseInvertida += frase.charAt(i);                        
            }
            if (fraseInvertida.equalsIgnoreCase(fraseSenseEspais))                
                    System.out.println("La cadena és un palíndrom.");
            else
                    System.out.println("La cadena NO és un palíndrom.");
            */
            
            
            /*
             * Solució 2
             *
            */
            fraseSenseEspais = fraseSenseEspais.toLowerCase();
            boolean esPalindrom = true;
            for (int i = 0; i < fraseSenseEspais.length() / 2; ++i)
            {
                if (fraseSenseEspais.charAt(i) !=  
                    fraseSenseEspais.charAt(fraseSenseEspais.length() -i - 1))
                {
                    esPalindrom = false;
                    break;
                }
            }
            if (esPalindrom)                
                    System.out.println("La cadena és un palíndrom.");
            else
                    System.out.println("La cadena NO és un palíndrom.");
            
            entrada.close();
	}
}