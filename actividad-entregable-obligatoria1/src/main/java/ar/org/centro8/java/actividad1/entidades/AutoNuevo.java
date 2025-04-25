package ar.org.centro8.java.actividad1.entidades;

public class AutoNuevo extends Vehiculo {
    // Se utiliza la palabra reservada "extends" para que la clase "AutoNuevo" herede los miembros de la clase "Vehiculo".

    public AutoNuevo(String marca, String modelo, String color, String marcaRadio, String potenciaRadio) {
        super(marca, modelo, color);
        this.agregarRadio(new Radio(marcaRadio, potenciaRadio));    // Se agrega el atributo radio al objeto en tiempo de creación
                                                                    // lo que define una relación de tipo composición entre las clases
                                                                    // "Radio" y "AutoNuevo".
    }

    @Override
    public String tipoVehiculo() {
        return "Auto nuevo";
    }

}
