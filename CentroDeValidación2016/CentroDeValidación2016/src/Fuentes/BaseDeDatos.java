/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

import java.util.HashMap;
import java.io.Serializable;


/**
 *
 * @author Jose
 */

public class BaseDeDatos implements Serializable
{
    
        private  HashMap<String, Elector> BaseElectores = new HashMap<>(); 
        private  HashMap<String, Centro> BaseCentros = new HashMap<>();
        
      //Atributos  
       
        String Cedula;
        String NumCentro;
        Elector Eaux;
        Centro Caux;
        
        
    // Base de Electores
 public HashMap<String, Elector> getBE() 
    {
       return BaseElectores;
    }
  public void setBE(String ced, Elector aux) 
    {
        this.Cedula=ced;
        this.Eaux = aux;
       BaseElectores.put(Cedula,Eaux );
    }
  
  
  // Base de Centros
  public HashMap<String, Centro> getBC() 
    {
       return BaseCentros;
    }
  public void setBC(String nc, Centro aux) 
    {
        this.NumCentro=nc;
        this.Caux = aux;
        BaseCentros.put(NumCentro,Caux );
    }

            

  
 
    
    
}