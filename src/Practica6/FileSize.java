/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 6. Programa que calcula el tamaño de un fichero mediante FileInputStream
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class FileSize {
    
    public static void main(String[] args) throws IOException{
        //Obtenemos de los argumentos el nombre del fichero
        String fichero = args[0];
        
        FileInputStream archivo = null;
        int i;
        int contador=0;
        //Creamos un objeto para la lectura del fichero
        try {
            archivo = new FileInputStream(fichero);
        } catch (FileNotFoundException ex) {
            System.out.println("[-]Error: archivo no encontrado");
        }
        //Leemos en bucle el fichero y vamos contando el numero de Bytes
        do{
            i = archivo.read();
            if(i != -1){
                contador += 1;
            }
        } while (i != -1);
        archivo.close();
        System.out.println("Tamaño: "+contador+" Bytes");
        
    }
    
}
