package com.programa2.matriz8x8;

/**
 *
 * @author ASUS
 */
public class Cls_MatrizX 
{
    private static String[][] ma = new String[8][8];
    
     public static void columnasx()
    {
       for (int c = 0; c < ma[0].length; c++) 
        {
            for (int f = 0; f < ma[0].length; f++) 
            {
                ma[f][c] = "";                
            }
        }              
        for (int f = 0; f < ma.length; f++) 
        {
            ma[f][f]="\\";
            ma[f][(ma.length-1)-f]="/";
        }
    }
     
   public static void cicloWhile()
   {
       for (int c = 0; c < ma[0].length; c++) 
       {
           for (int f = 0; f < ma[0].length; f++) 
           {
               ma[f][c] = " ";
           }
       }
       
       int f = 0;
       int c = ma.length;
       int a = ma[0].length;
       while (f != ma.length) 
        {
            if(c <= ma.length)
            {
               ma[ma.length - c][ma[0].length - ma.length] = "L"; //Fila
               ma[ma[0].length - 1][ma[0].length - a] = "L"; //columna
            }
            f++;
            c--; 
            a--;
        }
   }
   
   public static void LyLinvertida()
   {
       for (int c = 0; c < ma[0].length; c++) 
       {
           for (int f = 0; f < ma[0].length; f++) 
           {
               ma[f][c] = " ";
           }
       }
       
       int f = 0;
       int c = ma.length;
       int a = ma[0].length;
       while (f != ma.length) 
        {
            if(c <= ma.length)
            {
               ma[ma.length - c][ma[0].length - ma.length] = "#";
               ma[ma[0].length - 1][ma[0].length - a] = "#";
               
               ma[ma.length - ma.length][ma[0].length - c] = "%";
               ma[ma[0].length - a][ma[0].length - 1] = "%";
            }
            f++;
            c--; 
            a--;
        }
   }
     
    public static void imprimeMatriz()
    {
        for (int x = 0; x < ma.length; x++) 
        {
            System.out.print("");
            for (int y = 0; y < ma[x].length; y++) 
            {
                System.out.print(ma[x][y]);
                if(y != ma[x].length-1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
     
     
     
}
