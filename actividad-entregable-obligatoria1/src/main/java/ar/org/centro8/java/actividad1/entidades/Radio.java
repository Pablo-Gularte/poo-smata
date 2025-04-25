package ar.org.centro8.java.actividad1.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Radio {
    private String marca;
    private String potencia;
    private boolean enUso;

    public Radio(String marca, String potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.enUso = false;
    }

}
