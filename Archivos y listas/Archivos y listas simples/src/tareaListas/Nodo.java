/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaListas;

/**
 *
 * @author camilo
 */
public class Nodo {

  private  Object valor;
    Nodo siguiente;

    public Nodo(Object d) {
        valor = d;
        siguiente = null;
    }
    public Nodo(Object d, Nodo sig){
        valor = d;
        siguiente = sig;
    }
    public Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    public Object getValor(){
    
    return valor;
    }
    public void setValor(Object valor){
        this.valor = valor;
        
    }
    
    public void enlazarSig(Nodo n){
    siguiente = n;
    
    }
    
    public Nodo getSig(){
    
    
    return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
    
}
