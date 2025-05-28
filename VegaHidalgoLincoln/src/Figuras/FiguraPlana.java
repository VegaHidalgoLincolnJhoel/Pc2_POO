/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
// Clase abstracta FiguraPlana
public abstract class FiguraPlana {
    protected String nombre;
    protected String tipo;
    public static final int SEXAGESIMAL = 360;

    public FiguraPlana(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public abstract void dibujar();
    public abstract void mover();
    public abstract void redimensionar();
    public abstract void pintar();
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void crear() {
        System.out.println("Figura creada: " + nombre);
    }

    public void modificar() {
        System.out.println("Figura modificada: " + nombre);
    }

    public void eliminar() {
        System.out.println("Figura eliminada: " + nombre);
    }

    public void buscar() {
        System.out.println("Buscando figura: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}