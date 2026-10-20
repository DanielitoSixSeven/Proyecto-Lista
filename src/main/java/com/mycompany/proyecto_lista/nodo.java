/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_lista;

/**
 *
 * @author UTS2025
 */
public class nodo {
    private int valor;
    private nodo sig;
    
    public nodo(int v){
        valor = v;
        sig=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }
            
}
