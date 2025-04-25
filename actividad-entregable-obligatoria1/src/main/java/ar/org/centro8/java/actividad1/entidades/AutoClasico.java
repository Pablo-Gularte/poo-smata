package ar.org.centro8.java.actividad1.entidades;

public class AutoClasico extends Vehiculo {
    // Se utiliza la palabra reservada "extends" para que la clase "AutoClasico" herede los miembros de la clase "Vehiculo".

    public AutoClasico(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public String tipoVehiculo() {
        return "Auto clásico";
    }

}
