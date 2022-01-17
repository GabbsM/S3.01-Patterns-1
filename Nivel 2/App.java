public class App {
    public static void main(String[] args) {
        ContactFactory fabrica;

        //Agregamos contacto de Italia:
        fabrica = new ItalianContact();
        System.out.println();
        fabrica.agregarDireccion();
        fabrica.agregarTelefono();
        System.out.println();

        // Agregamos contacto de Francia:
        fabrica = new FrenchContact();
        fabrica.agregarTelefono();
        fabrica.agregarDireccion();
        System.out.println();

        // Agregamos contacto de Alemania:
        fabrica = new GermanyContact();
        fabrica.agregarTelefono();
        fabrica.agregarDireccion();
    }
}