public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Turismo turismo = new Turismo(1, "Ford Focus", 50, 200);
        Camion camion = new Camion(2, "Volvo FH", 100, 5);

        // Calculamos el precio del alquiler para el turismo y el camión
        double precioTurismo = turismo.calcularPrecioAlquiler();
        double precioCamion = camion.calcularPrecioAlquiler();

        // Mostramos los resultados
        System.out.println("Precio de alquiler del turismo: " + precioTurismo);
        System.out.println("Precio de alquiler del camión: " + precioCamion);
    }
}
