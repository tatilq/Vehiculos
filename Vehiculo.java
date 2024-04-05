import java.time.LocalDate;

// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected int id;
    protected String modelo;
    protected double precioBase;

    // Constructor
    public Vehiculo(int id, String modelo, double precioBase) {
        this.id = id;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    // Método abstracto para calcular el precio del alquiler
    public abstract double calcularPrecioAlquiler();

    //crear metodo alquilar y devolver (crearlas y  ue sean abastrcatas y en los hijos se porgrama)

    //revisar cuando es una clase abstracta
}

