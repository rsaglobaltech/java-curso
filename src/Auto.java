public class Auto implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("arrancando motor...");
    }

    @Override
    public void detener() {
        System.out.println("deteniendo motor...");
    }
    
}
