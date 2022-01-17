public class ItalianContact implements ContactFactory {
    @Override
    public void agregarTelefono() {
        System.out.println("Ha agregado un teléfono de un contacto de Italia");
    }

    @Override
    public void agregarDireccion() {
        System.out.println("Ha agregado una dirección de un contacto de Italia");
    }
}