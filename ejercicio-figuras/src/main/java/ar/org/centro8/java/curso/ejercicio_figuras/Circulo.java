package ar.org.centro8.java.curso.ejercicio_figuras;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Circulo {
    private double radio;

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

}