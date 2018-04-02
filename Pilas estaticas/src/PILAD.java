
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaque
 */
public class PILAD {
    private static final int TAM=79;
    Object vectorPila[];
    int cima;

    //Constructor
    public PILAD() {
        vectorPila = new Object[TAM];
        cima = -1;//cuando esta vacia o un nuevo datos

    }
//Metodo push

    public void empujar(Object dato) {
       
        cima++;
        vectorPila[cima] = dato;
    }
//Metodo pop


    public Object sacar() {
        Object fuera = vectorPila[cima];//auxiliar para almacenar el objeto
        cima--;
        return fuera;
    }
//Metodo para saber si la pila esta vacia

    public boolean vacia() {
        return cima == -1;

    }
//Metodo para saber si esta llena

    public boolean estaLlena() {
        return cima==TAM -1 ;//si el tamaño es igual a la cima osea si el vector es 10 entonces -1 es 9 y cima lego a 9

    }
//Metodo para saber que elemento se encuentra en la cima

    public Object cimaPila() {
        return vectorPila[cima];//retorname lo que hay en el vector pila
    }

//Metodo int tamaño
    public int tamaño() {
        return vectorPila.length;
    }

    public void limpiar() {
        /*while (!vacia()) {
            sacar();
        }
            JOptionPane.showMessageDialog(null,"Pila vacia, no se puede extaer");*/
    
    cima=-1;
    }
    

    public Object quitar()  {
        if (vacia()) {
            JOptionPane.showMessageDialog(null,"Pila vacia, no se puede extaer");
        }
        Object aux = vectorPila[cima];
        cima--;
        return aux;
    }

    public void Mostrar() {
        if (!vacia()) {
            for (int a = vectorPila.length-1; a >=0; a--) {
              JOptionPane.showMessageDialog(null,"pila" +vectorPila[a]);
            }
        } else {
            System.out.println("Pila vacia");
        }
    }
}
