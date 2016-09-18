
package Fuentes;

import GUI.Ventana_Principal;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Proceso_De_Validacion_2016 
{
    
    
    public static void main(String[] args)  
    {   
        BaseDeDatos BaseMain = new BaseDeDatos ();
        Ventana_Principal ventanap = new Ventana_Principal (BaseMain);
        ventanap.setVisible(true);
                
    }
    

}


