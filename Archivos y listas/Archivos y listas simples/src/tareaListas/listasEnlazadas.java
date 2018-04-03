/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaListas;

import java.util.Scanner;

/**
 *
 * @author camilo
 */
public class listasEnlazadas {

    Nodo tope;
    int size;

    public listasEnlazadas() {
        tope = null;
        size = 0;

    }

    public boolean isVacia() {

        return tope == null;
    }

    public void addPrimero(Object obj) {
        if (tope == null) {
            tope = new Nodo(obj);
        } else {
            Nodo temp = tope;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSig(temp);
            tope = nuevo;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void eliminar() {
        tope = null;
        size = 0;
    }

    public Object getPosicion(int index) {
        int cont = 0;
        Nodo temp = tope;
        while (cont < index) {
            temp = temp.getSig();
            cont++;
        }
        return temp.getValor();
    }

    public void agregarAlFinal(Object valor) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (isVacia()) {

            tope = nuevo;

        } else {

            Nodo aux = tope;

            while (aux.getSig() != null) {
                aux = aux.getSig();
            }

            aux.setSiguiente(nuevo);
        }

        size++;
    }

    public void removerPorPosicion(int posicion) {

        if (posicion >= 0 && posicion < size) {

            if (posicion == 0) {

                tope = tope.getSig();
            } else {

                Nodo aux = tope;

                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSig();
                }

                Nodo siguiente = aux.getSig();

                aux.setSiguiente(siguiente.getSig());
            }

            size--;
        }
    }
    public int buscar(Object dato){
        int pos=0;
        Nodo nd = tope;
        boolean f = false;
        while(nd!=null){
            pos++;
            if(dato.equals(nd.getValor())){
                f =true;
                break;
            }
            nd = nd.getSig();
        }
        if(f){
        return pos;}
        else return -1;
    }
    public void insertarO(int dato){
        Nodo t= tope;
        int cont =0;
        boolean f=false;
        while(t!=null&&dato>(Integer)t.getValor()){
            System.out.println("Valor de t: "+t.getValor());
            cont++;
           
            t=t.getSig();
            f=true;
        }
      if(t==null){agregarAlFinal(dato);}else{introducirDato(cont,dato);}
 
 
        size++;
    }
    
    public void introducirDato(int pos, int dato){
        Nodo aux=tope;
        Nodo auxDato=null; //Debemos crear un nodo para insetar el dato
        Nodo anterior=tope; //Debemos crear un nodo para insetar el dato
         
        int contador=0;
         
        if(pos<0 || pos>getSize()){
            System.out.println("La posicion insertada no es correcta");
        }else{
             
            if(pos==0){
                addPrimero(dato);
            }else if(pos==getSize()){
                agregarAlFinal(dato);
            }else{
                //Recorremos
                while(aux!=null){
                    if (pos == contador){
                        //Creo el nodo
                        auxDato=new Nodo(dato, aux);
                        //El siguiente del anterior a aux es auxDato
                        anterior.setSiguiente(auxDato);
                    }
                     
                    //Actualizo anterior
                    anterior=aux;
                     
                    contador++;
                    aux=aux.getSig(); //Actualizo siguiente
                }
            }
        }
        
    }

    public static void main(String[] args) {
        String ans = "";
        Object dato = null;
        Scanner leer = new Scanner(System.in);

        int i = 0;
        listasEnlazadas lista = new listasEnlazadas();
        System.out.println("Esta vacia " + lista.isVacia());

        do {
            System.out.println("Ingrese valor para la lista");
            dato = leer.next();
            lista.agregarAlFinal(dato);

            System.out.print("Desea continuar?: ");

            ans = leer.next();
        } while (!"n".equals(ans));
        try {

            while (i < lista.getSize()) {
                System.out.println(lista.getPosicion(i));
                i++;
            }
        } catch (Exception e) {
        } finally {
            System.out.println("Esta vacia " + lista.isVacia());

            System.out.println("Primer elemento : " + lista.getPosicion(0));
            System.out.println("Ultimo elemento : " + lista.getPosicion(lista.getSize() - 1));
            lista.removerPorPosicion(3);
            i = 0;
        }
        try {
            while (i < lista.getSize()) {
                System.out.println(lista.getPosicion(i));
                i++;
            }
        } catch (Exception e) {
        }
        System.out.println("longitud de la lista " + lista.getSize());

    }

}
