package ar.org.centro8.java.actividad1.entidades;

public final class Colectivo extends Vehiculo {
    // Se utiliza la palabra reservada "final" para impedir que la clase "Colectivo" tenga clases hijas.
    // Se utiliza la palabra reservada "extends" para que la clase "Colectivo" herede los miembros de la clase "Vehiculo".

    public Colectivo(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public String tipoVehiculo() {
        return "Colectivo";
    }

}
