/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author camilo
 */
public class PilaVec {

    public static int op;
    public static int tope;
    Object[] pila ;
    int size;

    public PilaVec(int size){
        pila = new Object[size];
        this.size = size;
    }
    public void push(Object dato) {
       try{
        if (tope == 10) {
            JOptionPane.showMessageDialog(null,"Pila llena");
        } else {
            
                pila[tope] = dato;
                tope++;
            
        }
       }catch(Exception e){
       JOptionPane.showMessageDialog(null,"Pila llena");
       }
       
    }

    public Object pop() {
        if (tope != 0) {
            --tope;
                
            return pila[tope];
        } else {
            System.err.println("pila vacia no hay nada que mostrar");
            return null;
        }
        
    }

    public void vaciar() {
        if (tope < 0) {
            System.out.println("pila vacia");
        } else if (tope == 10) {
            tope--;
            pila[tope] = 0;
            tope--;
        } else {
            pila[tope] = 0;
            tope--;
        }
    }
    public boolean isVacia(){
        return tope ==0;
    }
    public boolean isLlena(){
        return tope!=0;
    }
    public int getSize(){
        return tope;
    }
    public boolean buscar(Object find){
        boolean f=false;
        for(int i =0;i<tope;i++){
            if(find.equals(pila[i])){
                System.out.println("Entra al if");
                f=true;
            }
              System.out.println("Entra al for");
              System.out.println("Valor de i "+i);
              System.out.println("Valor de la pila "+pila[i]);
              System.out.println("Valor de find "+find);
        }
        
        return f;
    }
public void flush(){
    tope=0;
}
public Object getCima(){
    return pila[tope];
}
public int tamanPila(){
    return size;
}
}
