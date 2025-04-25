package ar.org.centro8.java.actividad1.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Vehiculo {
    // Se utiliza la palabra reservada "abstract" para definir una clase abstracta.
    // Esto quiere decir que no se podrán crear instancias de objetos de clase "Vehículo".
    private String marca;
    private String modelo;
    private String color;
    private float precio;
    private Radio radio;    // Este atributo es de clase "Radio", lo que establece un tipo de relación de agregación
                            // entre las clases "Radio" y "Vehiculo".

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void agregarRadio(Radio nuevaRadio) {
        // Se valida que no se quegra agregar una radio nueva cuando ya hay una asignada al vehículo.
        if(this.radio != null && nuevaRadio != null) {
            System.out.println("Ya hay una radio asignada en el vehículo");
            return;
        }
        // Se valida que no se intente agregar una valor nulo de radio nueva.
        if(nuevaRadio == null) {
            System.out.println("No es posible agregar una radio nula");
            return;
        }
        // Se valida que la radio no esté en uso actualmente.
        if(nuevaRadio.isEnUso()) {
            System.out.println("La radio que se quiere agregar ya está en uso en otro vehículo");
            return;
        }
        // Se asigna la nueva radio y se la marca en uso para futuras validaciones.
        this.radio = nuevaRadio;
        this.radio.setEnUso(true);
        System.out.println("Se agregó con éxito la radio " + this.radio.getMarca());
    }
    
    public void cambiarRadio(Radio nuevaRadio){
        // Se valida si la nueva radio a cambiar es la misma que ya está en el objeto
        if(this.radio == nuevaRadio) {
            System.out.println("La radio que quiere cambiar es la misma que está en el vehículo");
            return;
        }
        // Se valida que ya exista una radio para cambiar en el vehículo
        if(this.radio == null) {
            System.out.println("El vehículo no tiene radio asignada que se pueda cambiar");
            return;
        }
        // Se valida si se quiere cambiar la radio por una nueva o si se quiere quitar la radio del vehículo
        if(nuevaRadio == null) {
            System.out.println("Se quita la radio " + this.radio.getMarca() + " del vehículo");
            this.radio.setEnUso(false);
            this.radio = null;
        } else {
            // Se valida que la radio a cambiar no esté en uso
            if(nuevaRadio.isEnUso()) {
                System.out.println("La radio que se quiere cambiar ya está en uso en otro vehículo");
            } else {
                nuevaRadio.setEnUso(true);
                this.radio.setEnUso(false);
                this.radio = nuevaRadio;
                System.out.println("Se cambió la radio anterior por la nueva " + this.radio.getMarca());
            }
        }
    }

    // Se sobreescribe el "setRadio()" de lombok para redireccionarlo hacia la lógica de validación
    // del método "agregarRadio()"
    public void setRadio(Radio radioNueva) {
        agregarRadio(radioNueva);
    }

    // Se valida que el precio no sea un valor negativo
    public void setPrecio(float nuevoPrecio) {
        if(nuevoPrecio < 0) {
            System.out.println("No es posible asignar un precio negativo");
        } else {
            this.precio = nuevoPrecio;
        }
    }
    
    // Se utiliza la palabra reservada "abstract" para definir al método como abstracto.
    // Esto quiere decir que la implementación del método debe estar definida en las clases
    // hijas.
    public abstract String tipoVehiculo();
}
