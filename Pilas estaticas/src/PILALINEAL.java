
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
public class PILALINEAL {

    int vectorPila[];
    int cima;

    //Constructor
    public PILALINEAL(int tamaño) {
        vectorPila = new int[tamaño];
        cima = -1;//cuando esta vacia o un nuevo datos

    }
//Metodo push

    public void empujar(int dato) {
        cima++;
        vectorPila[cima] = dato;
    }
//Metodo pop


    public int sacar() {
        int fuera = vectorPila[cima];//auxiliar para almacenar el objeto
        cima--;
        return fuera;
    }
//Metodo para saber si la pila esta vacia

    public boolean vacia() {
        return cima == -1;

    }
//Metodo para saber si esta llena

    public boolean estaLlena() {
        return vectorPila.length - 1 == cima;//si el tamaño es igual a la cima osea si el vector es 10 entonces -1 es 9 y cima lego a 9

    }
//Metodo para saber que elemento se encuentra en la cima

    public int cimaPila() {
        return vectorPila[cima];//retorname lo que hay en el vector pila
    }

//Metodo int tamaño
    public int tamaño() {
        return vectorPila.length;
    }

    public void limpiar() {
        while (!vacia()) {
            sacar();
        }
            JOptionPane.showMessageDialog(null,"Pila vacia, no se puede extaer");
    }

    public int quitar()  {
        if (vacia()) {
            JOptionPane.showMessageDialog(null,"Pila vacia, no se puede extaer");
        }
        int aux = vectorPila[cima];
        cima--;
        return aux;
    }

    private void Mostrar() {
        if (!vacia()) {
            for (int a = vectorPila.length-1; a >=0; a--) {
              JOptionPane.showMessageDialog(null,"pila" +vectorPila[a]);
            }
        } else {
            System.out.println("Pila vacia");
        }
    }
    int ac=0;
   
        private void Mostrare() throws Exception {
        if (!vacia()) {
            for (int a = vectorPila.length-1; a >=0; a--) {
                if(vectorPila[a]%2==0){
              ac=ac+vectorPila[a];
                    System.out.println("Par" + ac); 
                }else{
                ac=ac+vectorPila[a];
                    System.out.println("Impar" + ac);
                }
            }
        } else {
            System.out.println("Pila vacia");
        }
    }

    public boolean Buscar(int dato) {
        boolean encontrado = false;
        if (!vacia()) {
            
            for (int a = vectorPila.length-1; a >=0; a--) {
                if (vectorPila[a] == (dato)) {
                    encontrado = true;
                }

            }
        } else {
            JOptionPane.showMessageDialog(null,"No hay datos para buscar en la pila");
        }
        return encontrado;
    }


    public static void main(String arg[]) throws Exception {
        int t, opcion;
        int dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Pilas---");
        System.out.println("Tamanio para la pila: ");
        t = teclado.nextInt();
        PILALINEAL pilita = new PILALINEAL(t);
        do {
            System.out.println("1. Agregar dato");
            System.out.println("2. Eliminar dato");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Buscar dato");
            System.out.println("5. Salir");
            System.out.println("Que desea hacer? ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba un dato: ");
                    dato = teclado.nextInt();
                    if (!pilita.estaLlena()) {
                        pilita.empujar(dato);
                    } else {

                        System.out.println("Pila llena");
                    }
                    break;
                case 2:
                    if (!pilita.vacia()) {
                        pilita.sacar();
                    } else {
                        System.out.println("vACIA");
                    }
                    break;
                case 3:
                    dato = teclado.nextInt();
                    if (pilita.Buscar(dato)) {
                        System.out.println("Dato encontrado");
                    } else {
                        System.out.println("Dato no encontrado");
                    }
                    break;
                case 4:
                   
                   if(!pilita.vacia()){
                   int sw=0;
                   int x=pilita.quitar();
                   for(int a=pilita.vectorPila.length-1;a>=0;a--){
                       if(pilita.vectorPila[a]%2==0){
                       sw=sw+x;
                       }
                   }
                       System.out.println("El par es" + sw);
                   }
                    //System.out.println("limpiar ");
                    //pilita.limpiar();
System.out.println("Dato a buscar: ");
    //dato=teclado.next();
    //if(pilita.Buscar(dato)) System.out.println("Dato encontrado");
   // else System.out.println("Dato no encontrado");
                    break;
                case 5:
                    if(!pilita.vacia()){
                    pilita.Mostrar();
                    }
                    break;
            }
        } while (opcion != 5);
    }
}
