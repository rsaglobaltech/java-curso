public class App {
    public static void main(String[] args) throws Exception {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setDatos(5, 6);
        System.out.println("El Area del cuadrado es => " + rectangulo.calcularArea());
        
        Triangulo triangulo = new Triangulo();
        triangulo.setDatos(30, 25);
        System.out.println("El Area del triangulo es =>" + triangulo.calcularArea());
    }
}
