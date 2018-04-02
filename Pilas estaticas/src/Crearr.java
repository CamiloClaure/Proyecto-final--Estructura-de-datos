
import java.io.IOException;
import java.io.*;
import javax.swing.JOptionPane;
public class Crearr {
     File archivo; 
     String ruta;
     String nom;
     String r="";
    PrintWriter escribir;
      String nombre;  
       BufferedReader bufalmac;
        FileInputStream entrada;
        FileOutputStream salida;
        
       public String Escribir(String ge){
           
           try{
      archivo=new File(ruta + nombre );
      escribir=new PrintWriter(archivo,"utf-8");
      escribir.println(ge);
       r= ge;
          escribir.close();
      }catch(IOException e){
        r=("Error  3 "  + e);
        
      }
           
          return r; 
       }
       
       public String Conversion(File archivo){
       String contenido2="";
           try {
                entrada=new FileInputStream(archivo);
               int assci;
               while((assci=entrada.read())!=-1){
                   
               char caracter=(char)assci;
              if(caracter>=65 && caracter<=90)
               {
               caracter=Character.toLowerCase(caracter);
               contenido2+=caracter;
               }
               else{
                  caracter=Character.toUpperCase(caracter);
               contenido2+=caracter;
               
               }
               }
           } catch (Exception e) {
               
           }
       
       return contenido2;
       }
       public String AbrirArchivo(File archivo){
       String contenido="";
           try {
               entrada=new FileInputStream(archivo);
               int assci;
               while((assci=entrada.read())!=-1){
                   
               char caracter=(char)assci;
               if(caracter!=32){
               contenido+=caracter;
               }
               else{
               
               
               }
               }
           } catch (Exception e) {
               
           }
       return contenido;
       }
       
       public String AbrirArchivso(File archivo){
       String contenido="";
           try {
               entrada=new FileInputStream(archivo);
               int assci;
               while((assci=entrada.read())!=-1){
                   
               char caracter=(char)assci;
               
               contenido+=caracter;
              
               }
           } catch (Exception e) {
               
           }
       return contenido;
       }
       public String GuardarA(File archivo,String contenido){
       r=null;
           try {
               salida=new FileOutputStream(archivo);
               byte[] bytesTxt=contenido.getBytes();
               salida.write(bytesTxt);
               FileWriter escribir=new FileWriter(archivo,true);
               PrintWriter linea=new PrintWriter(escribir);
               r="Se guardo con exito el archivo";
           } catch (Exception e) {
           }
       return r;
       }
    public String de(String rut,String da){
      
         try{
             
      
       archivo=new File(rut + "//" + da  +".txt");
       
           if (archivo.createNewFile()){

       
           r= "Se ha creado el archivo.....";
         
         }
        
        } catch(IOException e){
          r=("No se ha creado el archivo" + e);
        }
         return r;
    }
    
    /*public String dd(String a){
    archivo=new File(System.getProperties().getProperty("user.dir"));
    
      if(!archivo.exists()){
         try{
         archivo.createNewFile();
         
         }catch(IOException e){
             System.out.println("Error 2 "+ e);
             
         
         }
      }
      else{
      try{
      
      escribir=new PrintWriter(archivo,"utf-8");
      //nombre=JOptionPane.showInputDialog(null,"Digite tu ..");
      escribir.println("Hola "+ nombre);
          System.out.println("Hola" + nombre);
          escribir.close();
      }catch(IOException e){
          System.out.println("Error  3 "  + e);
        
      }
      }
    return f;
    }*/
}

