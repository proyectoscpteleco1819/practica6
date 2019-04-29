/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.io.Serializable;

/**
 *
 * @author Félix Delgado Ferro
 * @author Jesús Enrique Fernández-Aparicio Ortega
 */
public abstract class Figura implements Comparable<Figura>, Serializable{
    private java.util.Date fechaCreacion;
    
    protected Figura(){
        fechaCreacion= new java.util.Date() ;
    }
    
    public java.util.Date getFechaCreacion(){
        return fechaCreacion;
    }
    
    public String toString(){
        return "Creado el "+ fechaCreacion;
    }
    
    public abstract double getArea();    
    public abstract double getPerimetro(); 
    public abstract int compareTo(Figura figura);
    
    public Object clone(){
        try{
            Figura figuraClone = (Figura)super.clone();
            figuraClone.fechaCreacion = (java.util.Date)(fechaCreacion.clone());
            return figuraClone;
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede clonar");
            return null;
        }
    }   
    
    public void setFechaCreaciontoTiempoActual(){
        fechaCreacion.setTime((new java.util.Date()).getTime());
    }
}

