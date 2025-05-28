/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase Romboide
public class Romboide extends FiguraPlanaIrregular {

    public Romboide(double ancho, double alto) {
        super("Romboide", "Irregular", ancho, alto);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un romboide.");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo el romboide.");
    }

    @Override
    public void redimensionar() {
        System.out.println("Redimensionando el romboide.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el romboide.");
    }

    @Override
    public double calcularArea() {
        return ancho * alto; // base * altura
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto); // simplificación
    }

    @Override
    public void deformar() {
        System.out.println("Deformando el romboide.");
    }
}