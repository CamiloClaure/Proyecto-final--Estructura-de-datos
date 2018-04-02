
import java.util.Scanner;
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
public class PILALISTA {

    NodoPila cima;
    int tamaño;

    public PILALISTA() {
        cima = null;
        tamaño = 0;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void insertar(Object elemento) {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    public Object quitar()  {
       
            Object aux = cima.dato;
            cima = cima.siguiente;
            tamaño--;
            return aux;
    
    }
    public Object cimaPila() {
      
            return cima.dato;
      
          
        
    }

    public int tam() {
        return tamaño;
    }
public void mostrar(){

while (!pilaVacia()){
         Object aux = cima.dato;
          JOptionPane.showMessageDialog(null,"Mostrando " + aux,"Obteniendo datos de la pila",JOptionPane.INFORMATION_MESSAGE);
         cima = cima.siguiente;
     
     } 

}
    public void imprimir() {
        
        System.out.println("Listado de todos los elementos de la pila.");
        while (!pilaVacia()) {
            Object aux=cima.dato;
            System.out.println(aux);
            cima = cima.siguiente;
        }
        System.out.println();
    }

    public void limpiarPila() {
        NodoPila t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
     public static void main(String arg[]) throws Exception {
        int opcion=0;
        Object dato;
        Scanner teclado = new Scanner(System.in);
        
        PILALISTA pilita = new PILALISTA();
        do {
            System.out.println("1. Agregar dato");
            System.out.println("2. Eliminar dato");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Buscar dato");
            System.out.println("5. Salir");
            System.out.println("6.Limpiar pila");
            System.out.println("7.Salir");
            System.out.println("Que desea hacer? ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba un dato: ");
                    dato = teclado.next();
                    
                        pilita.insertar(dato);
                 
                    break;
                case 2:
                    if (!pilita.pilaVacia()) {
                        pilita.quitar();
                    } else {
                        System.out.println("vACIA");
                    }
                    break;
                case 3:
                     if (!pilita.pilaVacia()) {
                         System.out.println("Pila vacia");
                    } else {
                        System.out.println("No esta vacia");
                    }
                    break;
                case 4:
                    if(!pilita.pilaVacia()){
                        System.out.println("El elemento se encuetra en la cima" + pilita.cimaPila());
                    }else{
                    System.out.println("pila vacia");
                    }
                    break;
                case 5:
                    
                    System.out.println("el tamaño de la pila es" + pilita.tam());
                    break;
                case 6:
                     pilita.limpiarPila();
                    if(!pilita.pilaVacia())
                        System.out.println("La pila se ha vaciado" );
                   
                    else{
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
            }
        } while (opcion != 7);
    }
}
