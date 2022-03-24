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
public class Ex03_Matriu {
    
    public static void main(String[] args) {
        
        final int files = 4, columnes = 11;
        
        int[][] matriu = new int[files][columnes];
        
        for (int i = 0; i < matriu[0].length; ++i)
        {
            matriu[0][i] = 2 * (i + 1);
            matriu[1][i] = (i + 1) * (i + 1);
            //matriu[1][i] = (int)Math.pow(i + 1, 2);
            matriu[2][i] = matriu[0][i] - matriu[1][i];
            matriu[3][i] = matriu[0][i] + matriu[1][i] + matriu[2][i];
        }
        
        
        for (int fila = 0; fila < matriu.length; ++fila)
        {
            for (int columna = 0; columna < matriu[0].length; ++columna)
                System.out.print(matriu[fila][columna] + "\t");
            System.out.print("\n");          
        }
        
        /*
        for (int[] fila : matriu)
        {
            for (int valor : fila)
                System.out.print(valor + "\t");
            System.out.print("\n");          
        }*/
        System.out.println("Total files: " + matriu.length);
        System.out.println("Total de columnes: " + matriu[0].length);
        
        System.out.println("");
    }
}
