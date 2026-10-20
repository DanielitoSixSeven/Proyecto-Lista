/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_lista;
import java.util.Scanner;
/**
 *
 * @author UTS2025
 */
public class Proyecto_lista {

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        lista miLista = new lista();
        
     do{
         System.out.println("1. Insertar nodo ");
         System.out.println("2. Encontrar nodo");
         System.out.println("3. Cambiar nodo");
         System.out.println("4. Encontrar valor de nodo ");
         System.out.println("5. Borrar nodo");
         System.out.println("6. Imprimir tamaño de lista");
         System.out.println("7. Imprimir lista");
         System.out.println("8. Salir");
         System.out.println("Seleccionar una opcion -->");
         opcion = sc.nextInt();
         
         switch(opcion){
             
             case 1:
                 int valornodo;
                 System.out.println("Ingrese el valor del nodo a ingresar");
                 valornodo = sc.nextInt();
                 miLista.Add(valornodo);
         }
         
         
     }while(opcion != 8);
        
        
        
        
    }
}
