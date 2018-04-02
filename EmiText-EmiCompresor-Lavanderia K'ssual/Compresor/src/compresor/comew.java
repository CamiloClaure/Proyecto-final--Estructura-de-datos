/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class comew {
    String direccion="";
String Carpeta2="";
String respuesta="";
String contraseña="";
   
    public comew() {}
       /*  try{
             ZipFile archivo=new ZipFile("D:/Compresion/pruebafilla.zip");
      
        String carpeta="D:/Compresion/pruebafilla";
          ZipParameters parametros=new ZipParameters();
          parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
          parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
          parametros.setEncryptFiles(true);
          parametros.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
       //  parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
          parametros.setPassword("789");
          archivo.addFolder(carpeta, parametros);
      /*  ZipFile archivo=new ZipFile("D:/Compresion/prueba6.zip");
        ArrayList lista=new ArrayList();
        lista.add(new File("D:/Compresion/lol.txt"));
    
        ZipParameters parametros=new ZipParameters();
        parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        
        archivo.addFiles(lista, parametros);
        }catch(ZipException e)
        {
        e.printStackTrace();
        }
         
       
    }*/
    public String AÑADIRZ(String direccion, String Carpeta2,String contraseña){
         try{
             ZipFile archivo=new ZipFile(direccion);
      
    
          ZipParameters parametros=new ZipParameters();
          parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
          parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
          parametros.setEncryptFiles(true);
          parametros.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
       //  parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
          parametros.setPassword(contraseña);
          archivo.addFolder(Carpeta2, parametros);
     
   
         }catch(ZipException e){
         e.printStackTrace();
         }
        
    return respuesta;
    }
  public String Descomprimmir (String destino,String contraseña) {

 try{
     String fu;
     fu="ele.zip";
 ZipFile zipFile = new ZipFile (fu);
 if (zipFile.isEncrypted ()) {
 zipFile.setPassword (contraseña);
 }
 zipFile.extractAll (destino);
 } catch (ZipException e) {
 e.printStackTrace ();
 }
 return respuesta;
 }
 public static void main (String args []){
   comew np=new comew();
   
    Scanner tec=new Scanner(System.in); 
    try{
        
        System.out.println("DESTIONO");
        String nombre;
        nombre=tec.next();
        String cont;
        System.out.println("digite la contraseña");
        cont=tec.next();
        String respuesa=np.AÑADIRZ(nombre,nombre,cont);
        System.out.println("Se creo fff" + respuesa);
    }catch(Exception e){
        System.out.println("Error");
    }
 
 }
}
