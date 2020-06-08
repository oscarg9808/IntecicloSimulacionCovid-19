/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Dato;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author opizarro
 */
public class ControladorProbabilidad {

    public double calcularMediana(double[] m) {
        Arrays.sort(m);

        int middle = m.length / 2;
        if (m.length % 2 == 1) {
            return m[middle];
        } else {
            return (m[middle - 1] + m[middle]) / 2.0;
        }
    }

    /**
     * Metodo para calcular el modelo probabilistico
     * @param opcion
     * @param dias
     * @return 
     */
    public double[] calcularProbabilistico(String opcion, int dias) {
        List<Dato> datos = ControladorDato.cargarDatos();
        double[] y = cargararreglo(opcion, datos);
        //double x[] = ControladorGeneric.generarX(0, y);
        double[] ypred = new double[y.length + dias];
        
        System.arraycopy(y,
                0,/*desde donde copiar el array a*/
                ypred,/**/
                0,/*la posicion en donde empieza el otro array(inicio)*/
                y.length /*cuantos datos a partir del inicio va a copiar*/
        ); 
               

        for (int i = 0; i < ypred.length; i++) {

            double nuevo[] = new double[y.length + i ];
            try{
            
            System.arraycopy(ypred,
                    0,/*desde donde copiar el array a*/
                    nuevo,/**/
                    0,/*la posicion en donde empieza el otro array(inicio)*/
                    nuevo.length-1 /*cuantos datos a partir del inicio va a copiar*/
            );
            ypred[y.length + i] = obtenerSiguientePrediccion(nuevo);
            }catch(Exception e){
                return ypred;
            }
            
        }
        
        return ypred;
    }

    private double obtenerSiguientePrediccion(double[] y) {
        double mediana = calcularMediana(y);
        double ultimoValor = y[y.length - 1];
        return mediana + ultimoValor;
    }

    private double[] cargararreglo(String opcion, List<Dato> datos) {
        double resultado[] = new double[datos.size()];

        for (int i = 0; i < datos.size(); i++) {
            Dato dato = datos.get(i);
            if (opcion.compareToIgnoreCase("confirmados") == 0) {
                resultado[i] = dato.getNumeroConfirmado();
            }

            if (opcion.compareToIgnoreCase("recuperados") == 0) {
                resultado[i] = dato.getNumeroRecuperados();
            }

            if (opcion.compareToIgnoreCase("fallecidos") == 0) {
                resultado[i] = dato.getNumeroFallecido();
            }
        }

        return resultado;
    }

    private void print(String mensaje) {
        System.out.println(mensaje);
    }
}
