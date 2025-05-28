/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase Octogono
public class Octogono extends FiguraPlanaRegular {

    public Octogono(double longitudLado, double apotema) {
        super("Octogono", "Regular", 8, longitudLado, apotema);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un octogono.");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo el octagono.");
    }

    @Override
    public void redimensionar() {
        System.out.println("Redimensionando el octagono.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el octagono.");
    }
}