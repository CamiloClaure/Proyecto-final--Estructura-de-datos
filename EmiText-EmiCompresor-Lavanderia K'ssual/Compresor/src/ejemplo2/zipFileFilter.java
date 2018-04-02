/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import java.io.*;
import java.util.*;
public class zipFileFilter {
    private String name;
   private String extension;
   private boolean caseSensitive; 
public zipFileFilter (String namefile, String ext, boolean casesensitive) {
   caseSensitive = casesensitive;
   if (caseSensitive) { // for unix enviroments
      name = namefile; 
      extension = ext;
   } 
   else {
      name = namefile.toUpperCase();
      extension = ext.toUpperCase();
   }    
}
  
public boolean accept(java.io.File dir, String fileName) {
   if (name.equals("*") && extension.equals("*")) //this ignore the case letter
      return true;
   if (name.equals("*")) {
      if (caseSensitive) {    
         if(! fileName.endsWith("." + extension)) return false;
      } 
      else {
         if(! fileName.toUpperCase().endsWith("." + extension)) return false;     
      }       
      return true;
   }   
   if (extension.equals("*")) {//this ignore the case letter
      if (caseSensitive) {    
         if (!fileName.startsWith(name)) return false;  
      } 
      else {
        if(! fileName.toUpperCase().startsWith(name)) return false;
      }     
      return true;      
   }  
   if (caseSensitive) {   
      if (!fileName.startsWith(name)) return false;
         if (!fileName.endsWith("." + extension)) return false;
   }
   else {
      if (! fileName.toUpperCase().startsWith(name)) return false;
         if (! fileName.toUpperCase().endsWith("." + extension)) return false;      
      }  
      return true;
  }
}
