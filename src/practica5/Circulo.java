/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.lang.Math;
/**
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(){
    }
    
    public Circulo(double radio){
        this.radio= radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    } 
    
    
    @Override
    public double getArea(){
        return Math.PI*(Math.pow(this.radio,2));
    }
    
    @Override
    public double getPerimetro(){
       return Math.PI*2*radio;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" creado el "+ super.getFechaCreacion()+ "\nÁrea:" + this.getArea() + "\nPerímetro:" + this.getPerimetro() + "\nRadio:"+ this.getRadio();
    }
    
    @Override
    public int compareTo(Figura figura){
        int devolver;
        if(figura.getArea() > getArea()){
            devolver = -1;
        }else if (figura.getArea() < getArea()){
            devolver = 1;
        } else{
            devolver = 0;
        }
        return devolver;
    }
    
    @Override 
    public Object clone(){
            Circulo circuloClone = (Circulo)super.clone();
            return circuloClone;  
    }      
        
}
