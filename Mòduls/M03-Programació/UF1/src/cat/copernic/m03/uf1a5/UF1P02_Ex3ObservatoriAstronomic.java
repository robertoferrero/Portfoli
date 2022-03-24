/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf1a5;

/**
 *
 * @author rferrero
 */
import java.util.Locale;
import java.util.Scanner;

public class UF1P02_Ex3ObservatoriAstronomic {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int TOTAL_ASTRES = 10;
        Scanner entrada = new Scanner(System.in);

        int[] brillantors = new int[TOTAL_ASTRES];
        int[] comptadorBrillantors = new int[10];
        int comptador = 0;
        while (comptador < TOTAL_ASTRES)
        {
            int brillantor = entrada.nextInt();
            if (brillantor >= 0 && brillantor <=9) 
            {
                brillantors[comptador++] = brillantor;
                comptadorBrillantors[brillantor]++;
            }
        }
        entrada.close();


        float mitja=0.0f;
        for (int brillantor : brillantors)       
            mitja += brillantor;        
        
        mitja /= TOTAL_ASTRES;
        System.out.printf("Brillantor mitja: %.2f\n" ,mitja);

        int moda=0,brillantorModa=0;
        for(int i = 0;i < 10;i++) 
        {
            if (comptadorBrillantors[i] > moda) 
            {
               moda = comptadorBrillantors[i];
               brillantorModa = i;
            }
        }

        System.out.println("El valor més freqüent de brillantor és " + 
                         brillantorModa + " que apareix " + moda + " vegades.");

        float suma = 0.0f;
        for(int brillantor:brillantors) 
            suma += (brillantor-mitja)*(brillantor-mitja);

        System.out.printf("Desviació típica: %.2f\n",(float)Math.sqrt(suma/TOTAL_ASTRES));
    }
}