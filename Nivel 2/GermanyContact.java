public class GermanyContact implements ContactFactory {
    @Override
    public void agregarTelefono() {
        System.out.println("Ha agregado un teléfono de un contacto de Alemania");
    }

    @Override
    public void agregarDireccion() {
        System.out.println("Ha agregado una dirección de un contacto de Alemania");
    }
}