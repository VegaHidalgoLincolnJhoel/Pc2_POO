/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase FiguraPlanaIrregular
public abstract class FiguraPlanaIrregular extends FiguraPlana {
    protected double ancho;
    protected double alto;

    public FiguraPlanaIrregular(String nombre, String tipo, double ancho, double alto) {
        super(nombre, tipo);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public abstract void deformar();

    public void reporte() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}