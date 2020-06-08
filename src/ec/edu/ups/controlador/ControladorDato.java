/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Dato;
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
    
    public void refrescarDatos(){
        
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
}
