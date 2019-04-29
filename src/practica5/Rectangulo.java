/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    public Rectangulo(){
    }
    
    public Rectangulo(double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    public void setAlto(double alto){
        this.alto=alto;
    }
    
    @Override
    public double getArea(){
        return this.ancho*this.alto;
    }
    
    @Override
    public double getPerimetro(){
        return (2*this.ancho)+ (2*this.alto);
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" creado el "+ super.getFechaCreacion()+ "\nÁrea:" + this.getArea() + "\nPerímetro:" + this.getPerimetro() + "\nAncho:"+ this.getAncho() + "\nAlto:" + this.getAlto();
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
            Rectangulo rectanguloClone = (Rectangulo)super.clone();
            return rectanguloClone;  
    }
    
}
