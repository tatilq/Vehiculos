// Clase Camion que extiende de Vehiculo
class Camion extends Vehiculo {
    private int diasAlquiler;

    // Constructor
    public Camion(int id, String modelo, double precioBase, int diasAlquiler) {
        super(id, modelo, precioBase);
        this.diasAlquiler = diasAlquiler;
    }

    // Implementación del método abstracto para calcular el precio del alquiler
    @Override
    public double calcularPrecioAlquiler() {
        // El precio se calcula multiplicando los días de alquiler por el precio base
        return diasAlquiler * precioBase;
    }
}