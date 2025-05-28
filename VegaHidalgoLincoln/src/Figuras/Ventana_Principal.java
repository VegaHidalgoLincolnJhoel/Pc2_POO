/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;
import java.util.*;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Ventana_Principal {

    // Clase principal para pruebas
     private static List<FiguraPlana> figuras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menu de Figuras Planas ---");
            System.out.println("1. Crear figura");
            System.out.println("2. Mostrar todas las figuras");
            System.out.println("3. Buscar figura por nombre");
            System.out.println("4. Eliminar figura por nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearFigura();
                    break;
                case 2:
                    mostrarFiguras();
                    break;
                case 3:
                    buscarFigura();
                    break;
                case 4:
                    eliminarFigura();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion inválida.");
            }
        } while (opcion != 5);
    }

    private static void crearFigura() {
        System.out.println("\n--- Crear Figura ---");
        System.out.println("1. Pentagono");
        System.out.println("2. Octogono");
        System.out.println("3. Trapezoide");
        System.out.println("4. Romboide");
        System.out.print("Seleccione una opcion: ");
        int tipo = scanner.nextInt();

        switch (tipo) {
            case 1:
                System.out.print("Longitud de lado: ");
                double l1 = scanner.nextDouble();
                System.out.print("Apotema: ");
                double a1 = scanner.nextDouble();
                figuras.add(new Pentagono(l1, a1));
                break;
            case 2:
                System.out.print("Longitud de lado: ");
                double l2 = scanner.nextDouble();
                System.out.print("Apotema: ");
                double a2 = scanner.nextDouble();
                figuras.add(new Octogono(l2, a2));
                break;
            case 3:
                System.out.print("Ancho: ");
                double ancho1 = scanner.nextDouble();
                System.out.print("Alto: ");
                double alto1 = scanner.nextDouble();
                figuras.add(new Trapezoide(ancho1, alto1));
                break;
            case 4:
                System.out.print("Ancho: ");
                double ancho2 = scanner.nextDouble();
                System.out.print("Alto: ");
                double alto2 = scanner.nextDouble();
                figuras.add(new Romboide(ancho2, alto2));
                break;
            default:
                System.out.println("Tipo no valido.");
        }
    }

    private static void mostrarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras creadas.");
        } else {
            for (FiguraPlana f : figuras) {
                System.out.println("\nFigura: " + f.getNombre());
                f.dibujar();
                f.pintar();
                f.mover();
                f.redimensionar();
                System.out.println("Area: " + f.calcularArea());
                System.out.println("Perimetro: " + f.calcularPerimetro());
                if (f instanceof FiguraPlanaIrregular) {
                    ((FiguraPlanaIrregular) f).deformar();
                    ((FiguraPlanaIrregular) f).reporte();
                }
            }
        }
    }

    private static void buscarFigura() {
        System.out.print("Ingrese el nombre de la figura a buscar: ");
        String nombre = scanner.nextLine();
        for (FiguraPlana f : figuras) {
            if (f.getNombre().equalsIgnoreCase(nombre)) {
                f.buscar();
                System.out.println("Figura encontrada: " + f.getNombre());
                return;
            }
        }
        System.out.println("Figura no encontrada.");
    }

    private static void eliminarFigura() {
        System.out.print("Ingrese el nombre de la figura a eliminar: ");
        String nombre = scanner.nextLine();
        Iterator<FiguraPlana> it = figuras.iterator();
        while (it.hasNext()) {
            FiguraPlana f = it.next();
            if (f.getNombre().equalsIgnoreCase(nombre)) {
                f.eliminar();
                it.remove();
                System.out.println("Figura eliminada.");
                return;
            }
        }
        System.out.println("Figura no encontrada.");
    }
}
