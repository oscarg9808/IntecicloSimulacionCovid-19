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
public class Dato {
    
    private int numeroDia;
    private int numeroFallecido;
    private int numeroConfirmado;
    private int numeroRecuperados;

    
    private int numeroPoblacion;
    
    
    public Dato() {
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public int getNumeroFallecido() {
        return numeroFallecido;
    }

    public void setNumeroFallecido(int numeroFallecido) {
        this.numeroFallecido = numeroFallecido;
    }

    public int getNumeroConfirmado() {
        return numeroConfirmado;
    }

    public void setNumeroConfirmado(int numeroConfirmado) {
        this.numeroConfirmado = numeroConfirmado;
    }

    public int getNumeroRecuperados() {
        return numeroRecuperados;
    }

    public void setNumeroRecuperados(int numeroRecuperados) {
        this.numeroRecuperados = numeroRecuperados;
    }

    public int getNumeroPoblacion() {
        return numeroPoblacion;
    }

    public void setNumeroPoblacion(int numeroPoblacion) {
        this.numeroPoblacion = numeroPoblacion;
    }
    
    @Override
    public String toString() {
        return "Dato{" + "numeroDia=" + numeroDia + ", numeroFallecido=" + numeroFallecido + ", numeroConfirmado=" + numeroConfirmado + ", numeroRecuperados=" + numeroRecuperados + ", numeroPoblacion=" + numeroPoblacion + '}';
    }
}
