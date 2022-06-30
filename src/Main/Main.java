package Main;

import Arbol.ArbolInt;
import ArbolString.ArbolString;

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
                    + " 2. Mostrar en preorden\n"
                    + " 3. Mostrar en inorden\n"
                    + " 4. Mostrar en postorden\n"
                    + " 5. Eliminar un nodo\n"
                    + " 6. SALIR\n"));

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
                    System.out.println("Has seleccionado la opcion 2 Mostrar en preorden");
                    System.out.println("El tamaño es de: "+ arbolInt.getTamanio());
                    System.out.println("Máximo valor: "+ arbolInt.findSuccessor());
                    System.out.println("El promedio es: "+ arbolInt.getPromedio());
                    System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3 Mostrar en inorden");
                    System.out.println("----------------------------");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4 Mostrar en postorden");
                    System.out.println("----------------------------");
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5 Eliminar un nodo");
                    int eli;
                    eli = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el valor a eliminar"));
                    System.out.println("----------------------------");
                    break;
                case 6:
                    salir = true;
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
                    System.out.println("----------------------------");

            }

        }
    }

}
