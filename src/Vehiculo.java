public interface Vehiculo {
    public static final String matricula = "DD23455";
    public static float maxVel = 120;
    public void arrancar();
    public void detener();
    default void claxon(){
      System.out.println("Sonando claxon");
   }
}
