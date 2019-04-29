/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
/**
 * Programa que reemplaza un string por otro en un fichero
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException{
        //Leemos los argumentos del programa
        String ficheroOriginal = args[0];
        String nuevoFichero = args[1];
        String antiguo = args[2];
        String nuevo = args[3];
        
            
        //Creamos un objeto File
        java.io.File file_in = new java.io.File(ficheroOriginal);
        java.io.File file_out = new java.io.File(nuevoFichero);
        
        //Creamos un scanner para el file
        Scanner input = new Scanner(file_in);   
        java.io.PrintWriter output = new java.io.PrintWriter(file_out);
        
        //Leemos los datos del fichero
        while(input.hasNext()){
            String palabras = input.nextLine();
            String modificado = palabras.replaceAll(antiguo,nuevo);
            output.print(modificado);
        }  
        output.close();
        input.close();
       
    }
}

