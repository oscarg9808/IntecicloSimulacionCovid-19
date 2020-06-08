/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author opizarro
 */
public class Hospital {
    
    private String nombre;
    private int numeroPersonal;
    private int numeroCamas;  
    private int numeroAmbulancias;
    private int numeroRespiradores;
    private double costoMonetario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(int numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroAmbulancias() {
        return numeroAmbulancias;
    }

    public void setNumeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
    }

    public int getNumeroRespiradores() {
        return numeroRespiradores;
    }

    public void setNumeroRespiradores(int numeroRespiradores) {
        this.numeroRespiradores = numeroRespiradores;
    }

    public double getCostoMonetario() {
        return costoMonetario;
    }

    public void setCostoMonetario(double costoMonetario) {
        this.costoMonetario = costoMonetario;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", numeroPersonal=" + numeroPersonal + ", numeroCamas=" + numeroCamas + ", numeroAmbulancias=" + numeroAmbulancias + ", numeroRespiradores=" + numeroRespiradores + ", costoMonetario=" + costoMonetario + '}';
    }
    
    
}
