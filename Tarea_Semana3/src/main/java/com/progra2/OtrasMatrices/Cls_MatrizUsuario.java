package com.progra2.OtrasMatrices;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cls_MatrizUsuario
{
    private static int[][] datos = new int[3][3];
    private static Scanner numeros = new Scanner(System.in);
    
    public static void PedirDatos()
   {
       
       for (int f = 0; f < datos.length; f++) 
       {
           for (int c = 0; c < datos[0].length; c++) 
           {
               System.out.println("Ingrese los valores de las celdas: ");
               datos[f][c] = numeros.nextInt();
           }
       }
       
       for (int x = 0; x < datos.length; x++) 
        {
            System.out.print("");
            for (int y = 0; y < datos[x].length; y++) 
            {
                System.out.print(datos[x][y]);
                if(y != datos[x].length-1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
   }
   
   public static void accion()
   {
       int opcion, suma = 0, suma2 = 0, opcion2, media = 0, total = 0;
               
       System.out.println("Seleccione que quiere sumar: ");
       System.out.println("1. Columnas");
       System.out.println("2. Filas");
       opcion = numeros.nextInt();
       
       switch(opcion)
       {
           case 1:
               System.out.println("Que columna desea sumar: ");
               opcion2 = numeros.nextInt();
               
               for (int c = 0; c < datos[0].length; c++) 
               {
                   suma += datos[c][opcion2 - 1];
               }
               System.out.println("\nLa suma de la columna es : "+suma);
               break;
           case 2:
               System.out.println("Que fila desea sumar: ");
               opcion2 = numeros.nextInt();
               
               for (int f = 0; f < datos.length; f++) 
               {
                   suma += datos[opcion2 - 1][f];
               }
               System.out.println("La suma de la fila es: "+suma);
               break;  
       }
       int diagonal[] = new int[datos.length];
       int inversa[] = new int[datos.length];
       
       for (int f = 0; f < datos.length; f++) 
       {
           for (int c = 0; c < datos[0].length; c++) 
           {
               if(f==c)
               {
                   diagonal[f] = datos[f][c];
               }
               if((f+c) == datos.length - 1)
               {
                   inversa[f] = datos[f][c];
               }
           }
       }
       
       for(int elemento:diagonal)
       {
           suma2 = suma2 + elemento;
       }
       System.out.println("Suma de diagonal: "+suma2);
       suma2 = 0;
       for(int elemento:inversa)
       {
           suma2 = suma2 + elemento;
       }
       System.out.println("Suma de diagonal inversa: "+suma2);
       
       for (int i = 0; i < datos.length; i++) 
       {
           for (int j = 0; j < datos[0].length; j++) 
           {
               total = total + datos[i][j];
           }
       }
       media = total / datos.length;
       System.out.println("La media de la matriz es: "+media);
 }
}
