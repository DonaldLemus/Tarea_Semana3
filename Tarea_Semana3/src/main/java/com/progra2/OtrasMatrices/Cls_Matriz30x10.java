package com.progra2.OtrasMatrices;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Cls_Matriz30x10 
{
    private static int[][] pa = new int[30][10];
        
    public static void imparespatres()
    {
        Random rnd = new Random();
        int min = 0;
        int max = 100;
        int numero = rnd.nextInt(max) + min;;
        
        for (int f = 0; f <= pa.length - 1; f++) 
        {
            for (int c = 0; c <= pa[0].length - 1; c++) 
            {
                if(c%2 != 0 | f%2 != 0)
                {
                    pa[f][c] = 5;
                }
                else
                {
                    do
                    {
                        if(c%2 == 0 && f%2 == 0)
                        {
                            numero = rnd.nextInt(max) + min;
                            pa[f][c] = numero; 
                        }
                    }while(numero % 2 != 0);
                }
            }
        }
    }
         
    public static void imprimeMatriz2()
    {
        for (int x = 0; x < pa.length; x++) 
        {
            System.out.print("");
            for (int y = 0; y < pa[x].length; y++) 
            {
                System.out.print(pa[x][y]);
                if(y != pa[x].length-1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
    
    
    
    
    
    
}
