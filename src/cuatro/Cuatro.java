/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import javax.swing.JOptionPane;

import Arbol.ArbolInt;


public class Cuatro {

    public void mostrar() {
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        ArbolInt arbolInt = new ArbolInt();
        arbolInt.insertar(-255);
        arbolInt.insertar(-26540);
        arbolInt.insertar(-9654);
        arbolInt.insertar(-106);
        arbolInt.insertar(-23857);
        arbolInt.insertar(-8054);
        arbolInt.insertar(-1560);
        arbolInt.insertar(-8658);
        arbolInt.insertar(-2168);
        arbolInt.insertar(-621682);
        arbolInt.insertar(-475);
        arbolInt.insertar(-32);
        System.out.println("Preorden: ");
        arbolInt.mostrarPreorden();
        System.out.println("----------------------------");

        while (!salir) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que quiere ejecutar\n"
                    + "1. Insertar en Arbol -B\n"
                    + " 2. Eliminar en Arbol -B\n"
                    + " 3. SALIR\n"));

            switch (opcion) {
                case 1:
                    int res;
                    System.out.println("Has seleccionado la opcion 2 insertar en Arbol -B: ");
                    do {
                        res = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero negativo: "));
                    } while (res >= 0);

                    arbolInt.insertar(res);
                    System.out.println("Preorden: ");
                    arbolInt.mostrarPreorden();
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2 eliminar en Arbol -B");
                    do {
                        res = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero a eliminar: "));
                    } while (res >= 0);

                    arbolInt.eliminar(res);
                    System.out.println("Preorden: ");
                    arbolInt.mostrarPreorden();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
                case 3:
                    salir = true;
                    System.out.println("----------------------------");
                    break;

                default:
                    System.out.println("Solo números entre 1 y 3");
                    System.out.println("----------------------------");

            }

        }
    }

}
