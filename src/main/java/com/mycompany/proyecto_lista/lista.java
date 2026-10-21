/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_lista;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author UTS2025
 */
public class lista {
    
    private nodo inicio;
    public lista()
    {
        inicio=null;
    }
    
    public void Add(int num){
        nodo nuevo=new nodo(num);
        if(inicio==null)
            inicio=nuevo;
        else
        {
            nodo act=inicio;
            while(act.getSig()!=null)
                act=act.getSig();
            act.setSig(nuevo);
           
            
        }
        
    }
    
    public void Print(){
        nodo act=inicio;
        while(act!=null)
        {
            System.out.print(act.getValor()+"->");
            act=act.getSig();
        }
        System.out.println("|||");
    }  
    
      public int Count()
    {
        if(inicio!=null){
        int contador = 0;
        nodo act = inicio;
        
        while(act!=null){
        contador++;
        act = act.getSig();
        }
        return contador;
        }
        else{
            return -1;
        }
        
        
        // regresa cuantos nodos tiene la lista
        // y si esta vacia regresa -1
       
        // mostrar la lista esta vacia
        
    }
   
    public int Find(int pos)
    {
        int valor= -1;
        if(inicio!=null && pos>=0){
        int valorPosicion=0;
        nodo act = inicio;
            
        
        while(valorPosicion<pos && act.getSig()!=null){
            act = act.getSig();
            valorPosicion++;
        }
        if(valorPosicion==pos)
         valor = act.getValor();
        else
            valor=-1;
     }
        
        return valor;
    }
    // regresa el valor que esta en la posicion
        // comenzando con 0
        // si no esta la posicion regresa -1
        
    
   
   
    public int FindValue(int v)
    {
        //se envia el posible valor y regresa en que posicion
        // de la lisata esta
        // si no encuenta el valor regresara -1
        return -1;
    }
   
    public boolean Change(int pos, int newValue)
    {
        //asigna nuevo valor en la posicion enviada
        //regresa true si el cambio es exitoso
        // regresa false si no puedo hacer el cambio
        return false;
    }
   
    public boolean Delete(int pos)
    {
        // Borra el nodo de la posicion  indicada
        // regresa true si se elimina exitosamente
        // regresa false si no
        return false;
    }
    
    
}
