// Clase Turismo que extiende de Vehiculo
class Turismo extends Vehiculo {
    private int kilometrosRecorridos;

    // Constructor
    public Turismo(int id, String modelo, double precioBase, int kilometrosRecorridos) {
        super(id, modelo, precioBase);
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // Implementación del método abstracto para calcular el precio del alquiler
    @Override
    public double calcularPrecioAlquiler() {
        // El precio se calcula multiplicando los kilómetros recorridos por el precio base
        return kilometrosRecorridos * precioBase;
    }


}