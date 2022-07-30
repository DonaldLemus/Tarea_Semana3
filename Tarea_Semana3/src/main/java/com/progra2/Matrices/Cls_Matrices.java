package com.progra2.Matrices;

import com.progra2.OtrasMatrices.Cls_Matriz30x10;
import com.progra2.OtrasMatrices.Cls_MatrizUsuario;
import com.programa2.matriz8x8.Cls_MatrizX;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cls_Matrices 
{
    public static void main(String[] args) 
    {
        Cls_MatrizX ma = new Cls_MatrizX();
        Cls_Matriz30x10 pa = new Cls_Matriz30x10();
        Cls_MatrizUsuario us = new Cls_MatrizUsuario();
        Scanner std = new Scanner(System.in);
        int opcion;
        
        try
        {
            do
        {
                System.out.println("Seleccione lo que desee hacer");
                System.out.println("1. Imprimir Columnas X");
                System.out.println("2. Dibujar L");
                System.out.println("3. Dibujar L y L invertida");
                System.out.println("4. Numero Primos, Impares y Pares");
                System.out.println("5. Matriz Ingresada por el Usuario");
                System.out.println("6. Salir");
                opcion = std.nextInt();

                switch(opcion)
                {
                    case 1:
                        ma.columnasx();
                        ma.imprimeMatriz();
                        break;
                    case 2:
                        ma.cicloWhile();
                        ma.imprimeMatriz();
                        break;
                    case 3:
                        ma.LyLinvertida();
                        ma.imprimeMatriz(); 
                        break;
                    case 4:
                        pa.imparespatres();
                        pa.imprimeMatriz2();
                        break;
                    case 5:
                        us.PedirDatos();
                        us.accion();
                        break;
                    default:
                        System.out.println("Opcion no valida\n");
                        break;
                 }              
        }while(opcion != 6);
        }catch(Exception e)
        {
            System.out.println("Hubo un error");
        }       
    }
}

