/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author opizarro
 */
public class ControladorPaciente {
    
    private List<Paciente> listaPacientes;

    public ControladorPaciente() {
        listaPacientes = new ArrayList();
    }
    
    public void crear(Paciente paciente){
        listaPacientes.add(paciente);
    }
    
    public boolean eliminar(Paciente paciente){
        listaPacientes.remove(paciente);
        return false;
    }
    
    public List<Paciente> listar(){
        return this.listaPacientes;
    }
}
