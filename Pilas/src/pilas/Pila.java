/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author camilo
 */
public class Pila {
    private NodoPila inicio=null;
    private int size =0;
    public boolean isVacia(){
        return inicio==null;
      
        
    }
    public boolean isLlena(){
        return inicio!=null;
    }
    
      public void push(Object valor){
       NodoPila nuevo = new NodoPila();
   nuevo.setValor(valor);

        if (isVacia()) {
       inicio = nuevo;
        }

        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
       
        size++;
    } 
    public Object pop(){
        NodoPila tmp;
        tmp = inicio;
        inicio= inicio.getSiguiente();
        size--;
        return tmp.getValor();
        
    }
    public int getSize(){
        return size;
    }
    public boolean buscar(Object find){
        boolean f=false;
        NodoPila aux = inicio;
        
        while(!f&&aux!=null){
          if(find.equals(aux.getValor())){
              f=true;
          }else{
              aux= aux.getSiguiente();
          }
          
       }
        return f;
    }
    public void eliminar(Object dato){
        boolean f=false;
        NodoPila aux = inicio;
        Pila pilaAux =new Pila();
        while(f!=true && aux != null){
           if(dato.equals(aux.getValor())){
               f =true;
           }else{
              pilaAux.push(this.pop());
              aux = aux.getSiguiente();
           }
           
            
        }
        if(f){
               this.pop();
               while(pilaAux.isLlena()){
                   this.push(pilaAux.pop());
               }
           }else{
               while(pilaAux.isLlena()){
                   this.push(pilaAux.pop());
               }
           }
        
    }
    public NodoPila getInicio(){
        return inicio;
    }
    public void flush(){
        inicio =null;
    }
    public Object getCima(){
        return inicio.getValor();
    }
    
    public int getMin(){
        int min=32700;
        NodoPila np = inicio;
        while(np!=null){
            if(min>Integer.parseInt((String)np.getValor())){
                min = Integer.parseInt((String)np.getValor());
            }
            np= np.getSiguiente();
        }
        return min;
    }
    public int getMax(){
        int max =0;
         NodoPila np = inicio;
        while(np!=null){
            if(max<Integer.parseInt((String)np.getValor())){
                max = Integer.parseInt((String)np.getValor());
            }
            np= np.getSiguiente();
        }
        return max;
        
    }
}
