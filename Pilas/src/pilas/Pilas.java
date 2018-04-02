/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Stack;

/**
 *
 * @author camilo
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(50);
        pila.push("Hola");
        pila.push("EMI");
        pila.push(50);
        pila.push("Hola");
        pila.push("ADADF");
        
       while(!pila.isVacia()){
           System.out.println("Salida de la pila: "+pila.pop());
       }
        System.out.println(pila.isVacia());
        
        
    }
    
}
