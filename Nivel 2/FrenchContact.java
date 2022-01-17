public class FrenchContact implements ContactFactory{
    @Override
    public void agregarTelefono() {
        System.out.println("Ha agregado un teléfono de un contacto de Francia");
    }

    @Override
    public void agregarDireccion() {
        System.out.println("Ha agregado una dirección de un contacto de Francia");
    }
}