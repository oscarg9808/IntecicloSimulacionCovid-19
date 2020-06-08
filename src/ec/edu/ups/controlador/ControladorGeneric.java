/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author opizarro
 */
public class ControladorGeneric {

    
     public static double[] cargarCSV(String ruta){
        
        BufferedReader br = null;
         ArrayList<Double> lista = new ArrayList();
        try {

            br = new BufferedReader(new FileReader(ruta));
            String line = br.readLine();

            while (null != line) {
                line = br.readLine();
                lista.add(Double.valueOf(line));
            }

        } catch (Exception e) {

        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (Exception ex) {
                }
            }
        }
        double[] resultado = new double[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            Double numero = lista.get(i);
            resultado[i] = numero;
        }
        return resultado;
    }
    
     
    
       public static  double [] generarX(int inicio,double []y){
       double x[] = new double[y.length];
        for (int i = inicio; i < y.length; i++) {
            x[i] = i;
        }
        return x;
   } 
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
