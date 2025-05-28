/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase Pentagono
public class Pentagono extends FiguraPlanaRegular {

    public Pentagono(double longitudLado, double apotema) {
        super("Pentagono", "Regular", 5, longitudLado, apotema);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un pentagono.");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo el pentagono.");
    }

    @Override
    public void redimensionar() {
        System.out.println("Redimensionando el pentagono.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando el pentagono.");
    }
}