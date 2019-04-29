/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class TestFileStream {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String numeros = "1 2 3 4 5 6 7 8 9 10";
        byte buffer[] = numeros.getBytes();
        
        //Generar un fichero temporal binario con los datos
        OutputStream archivo = new FileOutputStream("temp.dat");
        for(int i = 0; i < buffer.length; i++){
            archivo.write(buffer[i]);
        }
        archivo.close();
        
        //Leemos dicho fichero
        FileInputStream lectura;
        
        lectura = new FileInputStream("temp.dat");
        int i;
        do{
            i = lectura.read();
            if(i != -1){
                System.out.print((char)i);
            }
        }while (i != -1);
        lectura.close();
        
        
    }
}
