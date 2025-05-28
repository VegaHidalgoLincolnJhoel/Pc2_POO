/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase Trapezoide
public class Trapezoide extends FiguraPlanaIrregular {

    public Trapezoide(double ancho, double alto) {
        super("Trapezoide", "Irregular", ancho, alto);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un trapezoide.");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo el trapezoide.");
    }

    @Override
    public void redimensionar() {
        System.out.println("Redimensionando el trapezoide.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el trapezoide.");
    }

    @Override
    public double calcularArea() {
        return ancho * alto / 2; // simplificación
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto); // simplificación
    }

    @Override
    public void deformar() {
        System.out.println("Deformando el trapezoide.");
    }
}