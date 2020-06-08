/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author opizarro
 */
public class ControladorGeneric {

    public static void ejecutarComando(String comando) {

         try{
            String salida = null;
        
            // Ejecucion Basica del Comando
            Process proceso = Runtime.getRuntime().exec("cmd.exe /C "+ comando);

            InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
            BufferedReader stdInput = new BufferedReader(entrada);

            //Si el comando tiene una salida la mostramos
            if((salida=stdInput.readLine()) != null){
            	System.out.println("Comando ejecutado Correctamente");
            	while ((salida=stdInput.readLine()) != null){
                	System.out.println(salida);
                }
            }else{
            	System.out.println("No se a producido ninguna salida");
                
            }
        }catch (IOException e) {
                System.out.println("Excepción: ");
                e.printStackTrace();
        }
    }
}
