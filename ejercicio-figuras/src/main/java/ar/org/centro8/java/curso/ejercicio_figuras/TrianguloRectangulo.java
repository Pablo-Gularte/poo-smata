package ar.org.centro8.java.curso.ejercicio_figuras;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class TrianguloRectangulo {
    private double base;
    private double altura;

    public double getPerimetro() {
        return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double getSuperficie() {
        return (base * altura) / 2;
    }
}
