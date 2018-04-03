/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camilo
 */
public class manejoArchivos {

    private int largo = 87;

    public void borrar(File archivo) {

        try {

            //archivo = new File(ruta + nombre);
            archivo.delete();

        } catch (Exception e) {
            System.err.println("No se ha creado el archivo " + e);
        } finally {
        }
    }

    public void escribirTexto(String nombr) {
        /* 
        //by Lara
        File archivo;
        PrintWriter escribir;
        //archivo = new File(ruta+nombre);
        
        if(!archivo.exists()){
        try{
            archivo.createNewFile();
        }catch(IOException e){
            System.err.println("Error 2"+e);
        }
    }else{
            try{
                escribir = new PrintWriter(archivo,"utf-8");
                escribir.println("Hola "+ nombr);
                System.out.println("Hola "+ nombr);
                escribir.close();
            }catch(IOException e){
                
            }
        }
         */
    }
    public boolean setTexto(File archivo) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(archivo, true);

            try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                
                return true;
            } catch (IOException ex) {
                Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        } catch (FileNotFoundException e) {

            return false;
        } catch (IOException ex) {

            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (NullPointerException e) {

            return false;
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                }
            }
            // return false;
        }

    }

    public boolean setTexto(String texto, File archivo) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(archivo, true);

            try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                bfwriter.write(texto + "\n");
                return true;
            } catch (IOException ex) {
                Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        } catch (FileNotFoundException e) {

            return false;
        } catch (IOException ex) {

            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (NullPointerException e) {

            return false;
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                }
            }
            // return false;
        }

    }

    public ArrayList getTexto(File archivo) {
        ArrayList listaTexto = new ArrayList<>();
        String text;
        Scanner scanner = null;

        try {

            if (abrirArchivo(archivo)) {
                scanner = new Scanner(archivo);
                while (scanner.hasNext()) {
                    text = scanner.nextLine();
                    listaTexto.add(text);
                }
                scanner.close();

            }

        } catch (FileNotFoundException e) {
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return listaTexto;
    }

    private boolean abrirArchivo(File archivo) {

        try {

            if (!archivo.exists()) {
                //JTable aprender esa mierda

                JOptionPane.showMessageDialog(null, "Archivo no existente");
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            System.err.println("No se ha encontrado el archivo " + e);
            return false;
        }

    }

    public void crearArchivoED(File archivo) {
        // nombre = archivo.getName();
        // File archivo;
        try {

            // archivo = new File(ruta + nombre);
            if (!archivo.exists()) {
                //JTable aprender esa mierda
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "Archivo creado exitosamente!");
            } else {
                JOptionPane.showMessageDialog(null, "Archivo ya existente");
            }

        } catch (Exception e) {
            System.err.println("No se ha creado el archivo " + e);
        } finally {
        }
    }

    public ArrayList getTextoSE(File archivo) {
        ArrayList listaTexto = new ArrayList<>();
        String text;
        Scanner scanner = null;

        try {

            if (abrirArchivo(archivo)) {
                scanner = new Scanner(archivo);
                while (scanner.hasNext()) {
                    text = scanner.nextLine();
                    for (int i = 0; i < text.length(); i++) {
                        if (text.charAt(i) != ' ') {
                            listaTexto.add(text.charAt(i));
                        }
                    }

                }
                scanner.close();

            }

        } catch (FileNotFoundException e) {
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return listaTexto;
    }

    public ArrayList getTextoUpperCase(File archivo) {

        ArrayList listaTexto = new ArrayList<>();
        String text;
        Scanner scanner = null;

        char textTemp;
        try {

            if (abrirArchivo(archivo)) {
                scanner = new Scanner(archivo);
                while (scanner.hasNext()) {
                    text = scanner.nextLine();

                    for (int i = 0; i < text.length(); i++) {

                        if ((int) text.charAt(i) < 97 || (int) text.charAt(i) >= 122) {

                            textTemp = Character.toLowerCase(text.charAt(i));
                            listaTexto.add(textTemp);
                        } else if ((int) text.charAt(i) <= 65 || (int) text.charAt(i) >= 90) {
                            textTemp = Character.toUpperCase(text.charAt(i));
                            listaTexto.add(textTemp);
                            System.out.println("No entra aca");
                        }
                        if ((int) text.charAt(i) == 32) {
                            listaTexto.add(text.charAt(i));
                        }

                    }

                }
                scanner.close();

            }

        } catch (FileNotFoundException e) {
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return listaTexto;

    }

    public void unitTxt(File archivo1, File archivo2, File archivo3) {
        ArrayList texto1 = new ArrayList<>(), texto2 = new ArrayList<>();
        String text;
        Scanner scanner = null;
        texto1 = getTexto(archivo1);
        texto2 = getTexto(archivo2);
        crearArchivoED(archivo3);
        try {

            if (abrirArchivo(archivo1)) {
                scanner = new Scanner(archivo1);
                while (scanner.hasNext()) {
                    text = scanner.nextLine();
                    setTexto(text, archivo3);

                }
                scanner.close();

            }
            if (abrirArchivo(archivo2)) {
                scanner = new Scanner(archivo2);
                while (scanner.hasNext()) {
                    text = scanner.nextLine();
                    setTexto(text, archivo3);

                }
                scanner.close();

            }

        } catch (FileNotFoundException e) {
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

    public boolean insertarTexto(String[] palabra, File archivo) throws IOException {
        String texto = " ";
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 16; i++) {
                try {
                    texto += palabra[j].charAt(i);

                } catch (Exception e) {
                    texto += " ";
                }

            }
            texto += "|";

        }

        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(archivo, true);

            try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {

                bfwriter.write(texto + "\n");

                return true;
            } catch (IOException ex) {
                Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        } catch (FileNotFoundException e) {

            return false;
        }
    }

    public boolean insertarTexto(String[] palabra, File archivo, int pos) throws IOException {
        String texto = " ";
        RandomAccessFile archDir;

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 16; i++) {
                try {
                    texto += palabra[j].charAt(i);

                } catch (Exception e) {
                    texto += " ";
                }

            }
            texto += "|";

        }

        try {

            archDir = new RandomAccessFile(archivo, "rw");
            if (pos > archDir.length()) {
                JOptionPane.showMessageDialog(null, "La posicion supera el numero de registros existentes");
            } else {
                archDir.seek((pos - 1) * largo);

                archDir.writeBytes(texto);

                System.out.println("La longitud del archivo: " + archDir.length());
                System.out.println("Registro del archivo: " + archDir.length() / largo);
                System.out.println("Se actualizo el registro :-0");

                archDir.close();
            }
        } catch (Exception e) {
        }
        return false;
    }

    public void borrarLinea(int pos, File archivo) throws FileNotFoundException, IOException {
        RandomAccessFile leer = new RandomAccessFile(archivo, "rw");
        // BufferedReader  bufalmac = new BufferedReader(leer);
        String linea;
        int i = 0;
        String[] dat = new String[5];
        leer.seek((pos - 1) * 74);
        linea = leer.readLine();

        StringTokenizer dato = new StringTokenizer(linea, "|");

        while (dato.hasMoreElements()) {
            dat[i] = (dato.nextToken());
            System.out.println(dat[i]);
            i++;
        }
        dat[4] = "*";
        for (int k = 0; k < 5; k++) {
            System.out.println(dat[k]);
        }
        String texto = "";
        RandomAccessFile archDir;

        for (int j = 0; j < 5; j++) {
            for (int ii = 0; ii < 16; ii++) {
                try {
                    texto += dat[j].charAt(ii);
                    System.out.println(dat[j].charAt(ii) + " ");

                } catch (Exception e) {
                    texto += " ";
                }

            }
            texto += "|";

        }

        try {

            archDir = new RandomAccessFile(archivo, "rw");
            if (pos > archDir.length()) {
                JOptionPane.showMessageDialog(null, "La posicion supera el numero de registros existentes");
            } else {
                archDir.seek((pos - 1) * largo);

                archDir.writeBytes(texto);
                System.out.println(texto);

                System.out.println("La longitud del archivo: " + archDir.length());
                System.out.println("Registro del archivo: " + archDir.length() / largo);
                System.out.println("Se actualizo el registro :-0");

                archDir.close();
            }
        } catch (Exception e) {
        }

    }

    public int buscar(String find, File arc) throws FileNotFoundException, IOException {
        int pos = 0;
        boolean f = false;
        FileReader leer = new FileReader(arc);
        BufferedReader bufalmac = new BufferedReader(leer);
        String linea;
        while ((linea = bufalmac.readLine()) != null) {
            pos++;
            if (linea.contains(find)) {

                f = true;
                break;
            } else {

            }

        }
        if (f) {
            return pos;
        } else {
            return -1;
        }
    }
}
