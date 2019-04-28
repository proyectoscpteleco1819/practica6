/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 7. Programa que toma cualquier fichero de instancia del problema del
 * viajante de comercio y lo escribe en un fichero binario
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class TransformarABinarioTSP {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String ficheroEntrada = args[0];
        String ficheroBinario = args[1];
        
        //Creamos el archivo de entrada de flujo de caracteres
        java.io.File archivo_in = new java.io.File(ficheroEntrada);
        //Creamos el archivo de salida de flujo binario
        DataOutputStream archivo_out = new DataOutputStream(new FileOutputStream(ficheroBinario));
        
        //Comenzamos la lectura del archivo .tsp
        Scanner lectura = new Scanner(archivo_in);
        String DIMENSION = lectura.next();      //Tomamos la palabra DIMENSION:
        int NumeroCiudades = lectura.nextInt(); //Tomamos el numero de ciudades
        
        //Escribimos en el archivo binario los dos primeros datos
        archivo_out.writeUTF(DIMENSION);
        archivo_out.writeInt(NumeroCiudades);
        
        int ciudad = 0;
        double posX = 0.0, posY = 0.0;
        //Recorremos en bucle el resto de ciudades
        for(int i = 0; i < NumeroCiudades; i++){
            //Leemos del archivo
            ciudad = lectura.nextInt();
            posX = lectura.nextDouble();
            posY = lectura.nextDouble();
            //Escribimos en el achivo
            archivo_out.writeInt(ciudad);
            archivo_out.writeDouble(posX);
            archivo_out.writeDouble(posY);
        }
        archivo_out.close();
        lectura.close();
        
        //Leemos el fichero binario que hemos escrito y lo imprimimos por pantalla
        DataInputStream entradaBinaria = new DataInputStream(new FileInputStream(ficheroBinario));
        
        System.out.println(entradaBinaria.readUTF());
        int CiudadesLeidas = entradaBinaria.readInt();
        System.out.println(CiudadesLeidas);
        
        for (int i = 0; i < CiudadesLeidas; i++){
            System.out.println(entradaBinaria.readInt()+" "+entradaBinaria.readDouble() +" "+entradaBinaria.readDouble());
        }
 
    }
}
