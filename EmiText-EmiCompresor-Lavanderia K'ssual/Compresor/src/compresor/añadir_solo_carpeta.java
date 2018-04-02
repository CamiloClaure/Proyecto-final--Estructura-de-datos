/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import net.lingala.zip4j.core.*;
import net.lingala.zip4j.model.*;
import net.lingala.zip4j.util.*;
import net.lingala.zip4j.exception.ZipException;

import net.lingala.zip4j.util.Zip4jConstants;

/**
 *
 * @author Jaque
 */
public class añadir_solo_carpeta {

    String direccion = "";
    String Carpeta2 = "";
    String respuesta = "";
    String Contraseññ;

    public void añadirsolos(String zi,String c) {
     try {
   ZipFile zipFile = new ZipFile(zi);//"C:/Users/andres2288/Documents/compression/andres2288.zip"

   ArrayList filesToAdd = new ArrayList();
   filesToAdd.add(new File(c));//"C:/Users/andres2288/Documents/compression/soy_una_carpeta"

   ZipParameters parameters = new ZipParameters();
   parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE); // set compression method to deflate compression

   parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
parameters.setRootFolderInZip("Agregando/");
   zipFile.addFiles(filesToAdd, parameters);
  } catch (ZipException e) {
   e.printStackTrace();
  }
      
       //  parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
      //    parametros.setPassword("789");
        //  archivo.addFolder(carpeta, parametros);
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
         
          }   
    }*/
      }
      
    public String archiveDir(String path, String contraseñ) {
      File f;
        try {
            Calendar calendar = Calendar.getInstance();
            Date time = calendar.getTime();
            long milliseconds = time.getTime();
            
            // Initiate ZipFile object with the path/name of the zip file.
            ZipFile zipFile = new ZipFile(path + "_" + milliseconds + ".zip");
            f = new File(path);
            
            // Folder to add
            String folderToAdd = path;

            // Initiate Zip Parameters which define various properties such
            // as compression method, etc.
            ZipParameters parameters = new ZipParameters();

            // set compression method to store compression
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            parameters.setEncryptFiles(true);
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
            //  parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            parameters.setPassword(contraseñ);
            // Set the compression level

            // Add folder to the zip file
            zipFile.addFolder(folderToAdd, parameters);
            return f.getName();

        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        
    }

    public String AÑADIRZ(String direccion, String Carpeta2, String Contraseña) {
        try {

            ZipFile archivo = new ZipFile(direccion);

            String carpeta = Carpeta2;
            ZipParameters parametros = new ZipParameters();
            parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            parametros.setEncryptFiles(true);
            parametros.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
        } catch (ZipException e) {
            e.printStackTrace();
        }

        return respuesta;
    }

    public static void main(String args[]) {
        añadir_solo_carpeta q = new añadir_solo_carpeta();
        String e,cony,ca = "";
        Scanner tec = new Scanner(System.in);
        e = tec.next();
        ca=tec.next();
        cony=tec.next();
        q.añadirsolos(ca, e);
    }
}
