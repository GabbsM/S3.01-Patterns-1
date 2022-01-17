import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Instancia:

        Undo undo = Undo.getUndo();

        // Agregamos comandos:

        System.out.println();
        System.out.println("Agregamos comandos.");
        undo.agregarComando("foo");
        undo.agregarComando("baar");
        undo.agregarComando("comando1");
        undo.agregarComando("comando2");

        System.out.println();
        System.out.println("Impresión de los comandos: ");
        // Imprimimos comandos:
        undo.mostrarComandos();

        System.out.println();
        System.out.println("Eliminamos comandos.");

        // Eliminamos comandos:

        undo.eliminarComando("comando1");

        // Imprimimos comandos:

        System.out.println();
        System.out.println("Impresión de los comandos: ");

        undo.mostrarComandos();

    }
}
