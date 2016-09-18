
package Fuentes;

import java.io.Serializable;


public class Elector implements Serializable
{

    public Elector(String Ced, String NomE, String FechaN, double Latitud, double Longitud) {
        this.Ced = Ced;
        this.NomE = NomE;
        this.FechaN = FechaN;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        
    }
 // Constructor
    public Elector() 
    {
        
    }
 // Atributos 
    public String Ced;
    public String NomE;
    public String FechaN;
    public double Latitud;
    public double Longitud;
    
    // Getters and Setters 
    public String getCed() {
        return Ced;
    }

    public void setCed(String Ced) {
        this.Ced = Ced;
    }

    public String getNomE() {
        return NomE;
    }

    public void setNomE(String NomE) {
        this.NomE = NomE;
    }

    public String getFechaN() {
        return FechaN;
    }

    public void setFechaN(String FechaN) {
        this.FechaN = FechaN;
    }

    

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    
    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }
    
    
    
    
}
