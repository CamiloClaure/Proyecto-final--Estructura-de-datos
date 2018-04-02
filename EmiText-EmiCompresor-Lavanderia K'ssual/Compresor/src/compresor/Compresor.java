/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
public class Compresor {
 
ZipParameters parametros;
ZipFile archivo;
  String directorioZip;
    
    public Compresor() {//constructor
     /*   try{
            
            directorioZip=JOptionPane.showInputDialog(null,"Ingrese el  directorioZip");
        archivo=new ZipFile(directorioZip+".zip");//asignar ruta con un filejchooser
        ArrayList lista=new ArrayList();
        lista.add(new File(archivo+".txt"));//añadir el archivo con un jfilechoser
         parametros=new ZipParameters();
         
          parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
          parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
          parametros.setEncryptFiles(true);
          parametros.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
          parametros.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
          parametros.setPassword("123");//crer una variable string o char
          archivo.addFiles(lista, parametros);
          /* ZipFile archivo=new ZipFile("D:/Compresion/prueba6.zip");
        ArrayList lista=new ArrayList();
        lista.add(new File("D:/Compresion/lol.txt"));
    
        ZipParameters parametros=new ZipParameters();
        parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        
        archivo.addFiles(lista, parametros);
        }catch(ZipException e)
        {
        e.printStackTrace();
        }*/
    }
    String ruta;
    String nombre;
    String respueta;
    ZipFile archivod;
    String archivos;
    String sruta;
   File archivoss; 
    Scanner tecla=new Scanner(System.in);

   public void add_a_un_zip () {
  try {
      
      System.out.println("Añade ");
      ruta=tecla.next();
   ZipFile zipFile = new ZipFile(ruta+".zip");
      System.out.println("Se lo creo ");
//("D:\\Compresion\\intento62.zip");
  //"D:\\Compresion\\ere\\again.txt"
      
      
 ArrayList filesToAdd = new ArrayList();
  filesToAdd.add(new File(archivos));
      System.out.println("Se lo creo3");   
   ZipParameters parameters = new ZipParameters();
   parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE); // set compression method to deflate compression
   

   parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL); 
   
   
   zipFile.addFiles(filesToAdd, parameters);
                               
  } catch (ZipException e) {
   e.printStackTrace();
  }  
   }
     public static void main(String[] args){
    
    Compresor fe=new Compresor();
    fe.add_a_un_zip();
    }

    
}
