/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Hospital;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author opizarro
 */
public class ControladorHospital {
    
    private List<Hospital> listaHospital;

    public ControladorHospital() {
        listaHospital = new ArrayList<>();
    }
    
    public void crear(Hospital hospital){
        listaHospital.add(hospital);
    }
    
    public boolean eliminar (Hospital hospital){
        return listaHospital.remove(hospital); 
    }
    
    public List<Hospital> listar(){
        return listaHospital;
    }
}
