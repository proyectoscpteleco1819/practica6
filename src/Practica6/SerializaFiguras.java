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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import practica5.*; //Importamos las clases de la práctica 5

/**
 * Ejercicio 8. Programa que usa las clases Figura, Circulo y Rectangulo para generar
 * aleatoriamente un array de 100 figuras que sean serializables y almacenadas en serie
 * en un fichero y luego leidas e imprimidas
 * 
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class SerializaFiguras {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        String ficheroGenerado = args[0];
        
        //Establecemos los parámetros para generar las figuras aleatorias
        double prob = 0.5;
        int dimMax = 50;
        
        //Creamos el vector con 100 objetos Figura
        Figura[] figuras = new Figura[100];
        //Rellenamos dicho vector de forma aleatoria
        figuras = AlgoritmosArraysFiguras.randomArraysFiguras(100, prob, dimMax);
        
        //Creamos el objeto que serializa los objetos para almacenarlos
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ficheroGenerado));
        salida.writeObject(figuras);
        salida.close();
        
        //Creamos un objeto que lea datos en serie
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ficheroGenerado));
        
        Figura[] nuevas_figuras = (Figura[]) (entrada.readObject());
        
        for (int i = 0; i < 100; i++){
            System.out.println(nuevas_figuras[i]+"\n");
        }
        
        
        
        
        
    }
}
