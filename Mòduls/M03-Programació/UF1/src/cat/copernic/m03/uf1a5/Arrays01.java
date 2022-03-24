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
public class Arrays01 {
    
    public static void main(String[] args) {
        
        /*int edat0 = 18;
        int edat1 = 20;
        int edat2 = 23;
        int edat3 = 20;
        
        
        double mitja = (edat0 + edat1 + edat2 + ....)/total;*/
        /*
        int[] edats;                
        edats = new int[20];
        edats[4] = 27;
        
        System.out.println("Edat del 5è alumne: " + edats[4]);
        
        int[] edats2 = new int[20];
        
        boolean[] resultats = new boolean[15];
        resultats[2] = false;
        System.out.println("Anirà a l'excursió el 3er alumne? " + resultats[2]);
        
        
        String[] paisos = new String[3];
        paisos[0] = "Espanya";
        paisos[1] = "França";
        paisos[2] = "Itàlia";
        
        
        String[] paisos2 = {"Espanya", "França", "Itàlia"};
        
        System.out.println("2on país: " + paisos2[1]);
        */
        /*double[] temperatures = {12.7,19.6,10.5,-1.5,6.8};
        System.out.println("La temperatura al final del dia és de " + 
                            temperatures[4] + " ºC");
        
        System.out.println("Total de temperatures: " + temperatures.length);
        */
        //Gos[] gossos = new Gos[10];
        //int[][] valors = new int[2][3];
        /*
        int[] valors = {2,-5,6,8,-3,9,-1,6,-2,0};
        
        System.out.println("Valors inicials: ");
        for (int i = 0; i < valors.length; ++i)
            System.out.print(valors[i] + " ");        
        System.out.println("");

        for (int i = 0; i < valors.length; ++i)
            valors[i] += 5;
        valors[3] = 10;
        
        System.out.println("Valors finals: ");
        for (int i = 0; i < valors.length; ++i)
            System.out.print(valors[i] + " ");
        System.out.println("");        
        */
        
        Locale.setDefault(new Locale("en","US"));
        Scanner entrada = new Scanner(System.in);
               
        System.out.print("Introdueix el total de temperatures: ");
        int totalTemperatures = entrada.nextInt();
        double[] temperatures = new double[totalTemperatures];
        
        for (int i = 0; i < totalTemperatures; ++i)
        {
            System.out.print("Temperatura " + i + ": ");
            temperatures[i] = entrada.nextDouble();
        }

        System.out.println("Temperatures: ");
        /*for (int i = 0; i < temperatures.length; ++i)
            System.out.print(temperatures[i] + " ");*/
        for (double temperatura : temperatures)
            System.out.print(temperatura + " ");
        System.out.println("");
        
        double suma = 0.0;
        /*for (int i = 0; i < temperatures.length; ++i)
            suma += temperatures[i];*/
        for (double temperatura : temperatures)
            suma += temperatura;                    
        System.out.printf("Mitja: %.2f\n" ,suma/totalTemperatures);
        
        
        
    }
}
