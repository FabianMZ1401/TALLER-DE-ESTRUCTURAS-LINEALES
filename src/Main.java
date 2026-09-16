import java.util.Scanner;

import arreglos.ejercicio01.Ejercicio01Controlador;
import arreglos.ejercicio02.Ejercicio02Controlador;
import arreglos.ejercicio03.Ejercicio03Controlador;
import arreglos.ejercicio04.Ejercicio04Controlador;
import arreglos.ejercicio05.Ejercicio05Controlador;

import arraylist.ejercicio06.Ejercicio06Controlador;
import arraylist.ejercicio07.Ejercicio07Controlador;
import arraylist.ejercicio08.Ejercicio08Controlador;
import arraylist.ejercicio09.Ejercicio09Controlador;
import arraylist.ejercicio10.Ejercicio10Controlador;

import matrices.ejercicio11.Ejercicio11Controlador;
import matrices.ejercicio12.Ejercicio12Controlador;
import matrices.ejercicio13.Ejercicio13Controlador;
import matrices.ejercicio14.Ejercicio14Controlador;
import matrices.ejercicio15.Ejercicio15Controlador;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            mostrarMenu();
            System.out.print("Ingrese una opción (0-15): ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("\n--------------------------------------------------");
                
                ejecutarOpcion(opcion);
                
                System.out.println("--------------------------------------------------");
                
                
                if (opcion != 0) {
                    System.out.print("\n>>> Presione ENTER para volver al menú principal...");
                    scanner.nextLine();
                    System.out.println("\n\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nError: Por favor ingrese un número entero válido.\n");
                System.out.print(">>> Presione ENTER para continuar...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("==================================================");
        System.out.println("       MENÚ PRINCIPAL - TALLER DE ESTRUCTURAS     ");
        System.out.println("==================================================");
        System.out.println("--- MÓDULO 1: ARREGLOS UNIDIMENSIONALES ---");
        System.out.println(" 1. Ejercicio 1");
        System.out.println(" 2. Ejercicio 2 (Pares en 1 y 10 líneas)");
        System.out.println(" 3. Ejercicio 3");
        System.out.println(" 4. Ejercicio 4");
        System.out.println(" 5. Ejercicio 5");
        System.out.println("\n--- MÓDULO 2: ARRAYLISTS ---");
        System.out.println(" 6. Ejercicio 6");
        System.out.println(" 7. Ejercicio 7");
        System.out.println(" 8. Ejercicio 8");
        System.out.println(" 9. Ejercicio 9");
        System.out.println("10. Ejercicio 10 (Procesamiento Liga)");
        System.out.println("\n--- MÓDULO 3: MATRICES ---");
        System.out.println("11. Ejercicio 11 (Suma de Filas y Columnas)");
        System.out.println("12. Ejercicio 12 (Suma A + B)");
        System.out.println("13. Ejercicio 13 (Multiplicación A x B)");
        System.out.println("14. Ejercicio 14 (Matriz Traspuesta)");
        System.out.println("15. Ejercicio 15 (Matriz 3D)");
        System.out.println("--------------------------------------------------");
        System.out.println(" 0. Salir del programa");
        System.out.println("==================================================");
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                new Ejercicio01Controlador().ejecutar();
                break;
            case 2:
                new Ejercicio02Controlador().ejecutar();
                break;
            case 3:
                new Ejercicio03Controlador().ejecutar();
                break;
            case 4:
                new Ejercicio04Controlador().ejecutar();
                break;
            case 5:
                new Ejercicio05Controlador().ejecutar();
                break;

            case 6:
                new Ejercicio06Controlador().ejecutar();
                break;
            case 7:
                new Ejercicio07Controlador().ejecutar();
                break;
            case 8:
                new Ejercicio08Controlador().ejecutar();
                break;
            case 9:
                new Ejercicio09Controlador().ejecutar();
                break;
            case 10:
                new Ejercicio10Controlador().ejecutar();
                break;

            case 11:
                new Ejercicio11Controlador().ejecutar();
                break;
            case 12:
                new Ejercicio12Controlador().ejecutar();
                break;
            case 13:
                new Ejercicio13Controlador().ejecutar();
                break;
            case 14:
                new Ejercicio14Controlador().ejecutar();
                break;
            case 15:
                new Ejercicio15Controlador().ejecutar();
                break;

            case 0:
                System.out.println("¡Programa finalizado con éxito!");
                break;
            default:
                System.out.println("Opción no válida. Ingrese un número entre 0 y 15.");
                break;
        }
    }
}