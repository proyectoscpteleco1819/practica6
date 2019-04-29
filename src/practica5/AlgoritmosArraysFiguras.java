/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
import java.util.Random;
/**
 *
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class AlgoritmosArraysFiguras {
    
    public static Figura randomFigura(double prob, double dimMax){
        Figura figura = null;
        Random random = new Random();
        double aleatorio= random.nextDouble();
        
        if(aleatorio < prob){
            figura = new Rectangulo(dimMax * random.nextDouble(),dimMax * random.nextDouble());
        } else{
            figura = new Circulo(0.5 * dimMax * random.nextDouble());
        }
        
        return figura;
    }
    
    public static Figura[] randomArraysFiguras(int nFiguras, double prob, double dimMax){
        Figura[] arrayFiguras = new Figura[nFiguras];
        
        for(int i=0;i<nFiguras;i++){
            arrayFiguras[i]= randomFigura(prob, dimMax);
        }
        
        return arrayFiguras;
    }
    
    public static void printArrayFiguras(Figura[] arrayFiguras){
        
        for(int i=0; i < arrayFiguras.length ; i++){
            System.out.println(arrayFiguras[i].toString()+ "\n");
        }
        
    }
    
    static Figura mayorFigura(Figura[] array){
        Figura figuraMayor= null;    
        for(int i=0; i< array.length;i++){
            if(figuraMayor == null){
                figuraMayor= array[i];
            }else{
                if(figuraMayor.compareTo(array[i]) == -1){
                    figuraMayor=array[i];
                }
            }
        }
        return figuraMayor;
        
    }
    
    static void ordenaArrayFiguras(Figura[] figuras){
    
        for(int i=0; i < figuras.length - 1; i++){
            for(int j = 0; j < figuras.length - 1; j++){
                if (figuras[j].compareTo(figuras[j+1]) == 1){
                    Figura figuraAux = figuras[j+1];
                    figuras[j+1] = figuras[j];
                    figuras[j] = figuraAux;
                }
            }
        }
    }
}
