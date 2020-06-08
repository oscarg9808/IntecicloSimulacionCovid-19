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
    private double numeroFallecido;
    private double numeroConfirmado;
    private double numeroRecuperados;

    
    private int numeroPoblacion;
    
    
    public Dato() {
    }

    public Dato(int numeroDia, double numeroFallecido, double numeroConfirmado, double numeroRecuperados, int numeroPoblacion) {
        this.numeroDia = numeroDia;
        this.numeroFallecido = numeroFallecido;
        this.numeroConfirmado = numeroConfirmado;
        this.numeroRecuperados = numeroRecuperados;
        this.numeroPoblacion = numeroPoblacion;
    }
    

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public double getNumeroFallecido() {
        return numeroFallecido;
    }

    public void setNumeroFallecido(double numeroFallecido) {
        this.numeroFallecido = numeroFallecido;
    }

    public double getNumeroConfirmado() {
        return numeroConfirmado;
    }

    public void setNumeroConfirmado(double numeroConfirmado) {
        this.numeroConfirmado = numeroConfirmado;
    }

    public double getNumeroRecuperados() {
        return numeroRecuperados;
    }

    public void setNumeroRecuperados(double numeroRecuperados) {
        this.numeroRecuperados = numeroRecuperados;
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
