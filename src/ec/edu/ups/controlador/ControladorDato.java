/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Dato;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author opizarro
 */
public class ControladorDato {

    
    private List<Dato> listaDatos;

    public ControladorDato() {
        listaDatos = new ArrayList<>();
    }
    
    
    private static double[] cargarCSV(String ruta) {
        
        return ControladorGeneric.cargarCSV(ruta);
    }
    
    
    
    public static List<Dato> cargarDatos(){
        String ruta = "datos/confirmados.csv";
        List<Dato> resultado = new ArrayList<>();
        double [] confirmados = cargarCSV(ruta);
        ruta = "datos/fallecidos.csv";
        double [] fallecidos = cargarCSV(ruta);
        ruta = "datos/recuperados.csv";
         double [] recuperados = cargarCSV(ruta);
         
         for  (int i = 0 ; i< recuperados.length;i++){
             Dato d = new Dato();
             d.setNumeroDia(i+1);
             d.setNumeroConfirmado(confirmados[i]);
             d.setNumeroFallecido(fallecidos[i]);
             d.setNumeroRecuperados(recuperados[i]);
             resultado.add(d);
         }
         return resultado;
    }
    
   
    
    public void crear(Dato dato){
        listaDatos.add(dato);
    }
    
    public boolean eliminar(Dato dato){
        return listaDatos.remove(dato);
    }
    
    public List<Dato> listar(){
        return listaDatos;
    }
    
    public void print(String mensaje){
        System.out.println(mensaje);
    }
}
