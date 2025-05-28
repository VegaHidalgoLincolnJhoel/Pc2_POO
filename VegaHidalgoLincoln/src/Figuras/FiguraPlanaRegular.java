/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase FiguraPlanaRegular
public abstract class FiguraPlanaRegular extends FiguraPlana {
    protected int numLados;
    protected double longitudLado;
    protected double apotema;

    public FiguraPlanaRegular(String nombre, String tipo, int numLados, double longitudLado, double apotema) {
        super(nombre, tipo);
        this.numLados = numLados;
        this.longitudLado = longitudLado;
        this.apotema = apotema;
    }

    // Getters y Setters
    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularPerimetro() {
        return numLados * longitudLado;
    }

    @Override
    public double calcularArea() {
        return (calcularPerimetro() * apotema) / 2;
    }
}