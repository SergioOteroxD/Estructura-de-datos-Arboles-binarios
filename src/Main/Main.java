package Main;

import Arbol.ArbolInt;
import ArbolString.ArbolString;
import cinco.Cinco;
import cuatro.Cuatro;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        ArbolInt arbolInt = new ArbolInt();
        arbolInt.insertar(25);
        arbolInt.insertar(20);
        arbolInt.insertar(90);
        arbolInt.insertar(10);
        arbolInt.insertar(23);
        arbolInt.insertar(80);
        arbolInt.insertar(100);
        arbolInt.insertar(8);
        arbolInt.insertar(21);
        arbolInt.insertar(62);
        arbolInt.insertar(47);
        arbolInt.insertar(32);

        while (!salir) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que quiere ejecutar\n"
                    + "1. Mostar dos arboles binarios\n"
                    + " 2. Calculo del arbol\n"
                    + " 3. Intercambiar ramas\n"
                    + " 4. Arboles-B\n"
                    + " 5. Arboles-B+\n"
                    + " 6. Arboles-B+\n"
                    + " 7. Arboles-B+\n"
                    + " 8. Arboles-B+\n"
                    + " 9. Arboles-B+\n"
                    + " 10. SALIR\n"));

            switch (opcion) {
                case 1:
                    System.out.println("Mostar dos arboles binarios: ");

                    ArbolString arbolString = new ArbolString();
                    arbolString.insertar("K");
                    arbolString.insertar("B");
                    arbolString.insertar("W");
                    arbolString.insertar("M");
                    arbolString.insertar("Z");
                    arbolString.insertar("A");
                    arbolString.insertar("F");
                    arbolString.insertar("D");
                    arbolString.insertar("L");
                    arbolString.insertar("O");
                    arbolString.insertar("P");
                    System.out.println("Preorden: ");
                    arbolString.mostrarPreorden();
                    System.out.println("\nInorden: ");
                    arbolString.mostrarInorden();
                    System.out.println("\nPostorden: ");
                    arbolString.mostrarPostorden();
                    System.out.println("\n----------------------------");

                    System.out.println("Preorden: ");
                    arbolInt.mostrarPreorden();
                    System.out.println("\nInorden: ");
                    arbolInt.mostrarInorden();
                    System.out.println("\nPostorden: ");
                    arbolInt.mostrarPostorden();
                    System.out.println("\n----------------------------");
                    break;

                case 2:
                    System.out.println("Has seleccionado la opcion 2 Calculo del arbol");
                    System.out.println("Preorden: ");
                    arbolInt.mostrarPreorden();
                    System.out.println("\n----------------------------");
                    System.out.println("\nEl tamaño es de: " + arbolInt.getTamanio());
                    System.out.println("\n----------------------------");
                    System.out.println("Máximo valor: " + arbolInt.findSuccessor());
                    System.out.println("\n----------------------------");
                    System.out.println("El promedio es: " + arbolInt.getPromedio());
                    System.out.println("\n----------------------------");
                    System.out.println("Hojas: ");
                    arbolInt.mostrarHojas();
                    System.out.println("\n----------------------------");
                    System.out.println("Nodos internos: ");
                    arbolInt.mostrarNodosInternos();
                    System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3 Intercambiar ramas");
                    System.out.println("Preorden: ");
                    arbolInt.mostrarPreorden();
                    arbolInt.cambioRamas();
                    System.out.println("----------------------------");
                    System.out.println("Preorden despues del cambio: ");
                    arbolInt.mostrarPreorden();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4 Arboles-B");
                    Cuatro cuatro = new Cuatro();
                    cuatro.mostrar();
                    System.out.println("----------------------------");
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5 Arboles-B+");
                    Cinco cinco = new Cinco();
                    cinco.mostrar();
                    System.out.println("----------------------------");
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion ");
                    System.out.println("----------------------------");
                    break;
                case 7:
                    System.out.println("Has seleccionado la opcion ");
                    System.out.println("----------------------------");
                    break;
                case 8:
                    System.out.println("Has seleccionado la opcion ");
                    System.out.println("----------------------------");
                    break;
                case 9:
                    System.out.println("Has seleccionado la opcion ");
                    System.out.println("----------------------------");
                    break;
                case 10:
                    salir = true;
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Solo números entre 1 y 10");
                    System.out.println("----------------------------");

            }

        }
    }

}
