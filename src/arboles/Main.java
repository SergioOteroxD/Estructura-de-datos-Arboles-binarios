package arboles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        Arbol arbolito = new Arbol();
        while (!salir) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que quiere ejecutar\n"
                    + "1. Añadir nodo\n"
                    + " 2. Mostrar en preorden\n"
                    + " 3. Mostrar en inorden\n"
                    + " 4. Mostrar en postorden\n"
                    + " 5. Eliminar un nodo\n"
                    + " 6. SALIR\n"));

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1 Añadir nodo");
                    int ins;
                    ins = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el valor del nodo"));
                    arbolito.insertar(ins);
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2 Mostrar en preorden");
                    arbolito.mostrarPreorden();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3 Mostrar en inorden");
                    arbolito.mostrarInorden();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4 Mostrar en postorden");
                    arbolito.mostrarPostorden();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5 Eliminar un nodo");
                    int eli;
                    eli= Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el valor a eliminar"));
                    arbolito.eliminar(eli);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

}
