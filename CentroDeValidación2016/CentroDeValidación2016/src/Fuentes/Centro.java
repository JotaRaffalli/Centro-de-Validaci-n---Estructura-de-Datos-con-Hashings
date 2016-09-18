
package Fuentes;

import java.io.Serializable;


public class Centro implements Serializable
{
    // Atributos 
    
    public String Numero;
    public String NomC;
    public String Direccion;
    public double Latitud;
    public double Longitud;

   
    
    //Constructores

    public Centro() 
    {
        
    }

    public Centro(String Numero, String NomC, String Direccion, double Latitud, double Longitud) {
        this.Numero = Numero;
        this.NomC = NomC;
        this.Direccion = Direccion;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }
    
    //Getters and Setters
    
    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double Distancia) {
        this.Distancia = Distancia;
    }
    public double Distancia;
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getNomC() {
        return NomC;
    }

    public void setNomC(String NomC) {
        this.NomC = NomC;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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
