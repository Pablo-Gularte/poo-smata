package ar.org.centro8.java.curso.pruebas;

import ar.org.centro8.java.curso.ejercicio_figuras.*;

public class ProbarFiguras {
    public static void main(String[] args) {
        // Defino variable boolean para verificar si el resultado es el esperado
        boolean esResultadoEsperado;

        // Defino valores de prueba para clase TrianguloRectangulo
        double base = 3;
        double altura = 4;
        final double resultadoEsperadoPerimetroTriangulo = 12;  // TEOREMA DE PITÁGORAS: hipotenusa^2 = base^2 + altura^2
                                                                // --> base + altura + raiz_cuadrada(base^2 + altura^2) --> 
                                                                // --> 3 + 4 + raiz_cuadrada(9 + 16)
                                                                // --> 3 + 4 + raiz_cuadrada(25)
                                                                // --> 3 + 4 + 5 = 12
        final double resultadoEsperadoSuperficieTriangulo = 6; // (base * altura) / 2
        
        // Defino valores de prueba para clase Circulo
        double radio = 5;
        final double resultadoEsperadoPerimetroCirculo = 2 * Math.PI * 5; // 2 * PI * radio
        final double resultadoEsperadoSuperficieCirculo = Math.PI * Math.pow(5, 2); // PI * radio^2
        
        // Defino valores de prueba para clase Rectangulo
        double lado1 = 6;
        double lado2 = 7;
        final double resultadoEsperadoPerimetroRectangulo = 2 * (6 + 7); // 2 * (lado1 + lado2)
        final double resultadoEsperadoSuperficieRectangulo = 6 * 7; // lado1 * lado2


        // Crear un objeto de la clase TrianguloRectangulo y guardar el resultado de los métodos
        TrianguloRectangulo triangulo = new TrianguloRectangulo(base, altura);
        double resultadoPerimetroTriangulo = triangulo.getPerimetro();
        double resultadoSuperficieTriangulo = triangulo.getSuperficie();

        // Crear un objeto de la clase Circulo y guardar el resultado de los métodos
        Circulo circulo = new Circulo(radio);
        double resultadoPerimetroCirculo = circulo.getPerimetro();
        double resultadoSuperficieCirculo = circulo.getSuperficie();

        // Crear un objeto de la clase Rectangulo y guardar el resultado de los métodos
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        double resultadoPerimetroRectangulo = rectangulo.getPerimetro();
        double resultadoSuperficieRectangulo = rectangulo.getSuperficie();

        // Verificar el resultado del triangulo rectángulo
        System.out.println("\n**********************************************");
        System.out.println("* INICIA PRUEBA DE CLASE TrianguloRectangulo *");
        System.out.println("**********************************************\n");

        // Muestro estado del objeto triangulo
        System.out.println("Muestro estado del objeto triangulo --> " + triangulo);
        System.out.println("Perímetro: " + resultadoPerimetroTriangulo);
        System.out.println("Superficie: " + resultadoSuperficieTriangulo);

        // Verifico comportamiento de métodos de la clase TrianguloRectangulo
        System.out.println("Verifico el comportamiento de los métodos getPerimetro() y getSuperficie() de la clase TrianguloRectangulo");
        
        // Verifico método getPerimetro()
        esResultadoEsperado = resultadoPerimetroTriangulo == resultadoEsperadoPerimetroTriangulo;
        System.out.println("El resultado del perímetro es " + (esResultadoEsperado ? "el esperado" : "diferente al esperado"));
        
        // Verifico método getSuperficie()
        esResultadoEsperado = resultadoSuperficieTriangulo == resultadoEsperadoSuperficieTriangulo;
        System.out.println("El resultado de la superficie es " + (esResultadoEsperado ? "el esperado" : "diferente al esperado"));
        System.out.println("** FIN DE PRUEBA DE CLASE TrianguloRectangulo **\n");
        
        // Verificar el resultado del círculo
        System.out.println("\n*********************************************");
        System.out.println("* INICIA PRUEBA DE CLASE Circulo            *");
        System.out.println("*********************************************\n");

        // Muestro estado del objeto circulo
        System.out.println("Muestro estado del objeto circulo --> " + circulo);
        System.out.println("Perímetro: " + circulo.getPerimetro());
        System.out.println("Superficie: " + circulo.getSuperficie());
        System.out.println("Verifico el comportamiento de los métodos getPerimetro() y getSuperficie() de la clase Circulo");
        
        // Verifico método getPerimetro()
        esResultadoEsperado = resultadoPerimetroCirculo == resultadoEsperadoPerimetroCirculo;
        System.out.println("El resultado del perímetro es " + (esResultadoEsperado ? "el esperado" : "diferente al esperado"));
        
        // Verifico método getSuperficie()
        esResultadoEsperado = resultadoSuperficieCirculo == resultadoEsperadoSuperficieCirculo;
        System.out.println("El resultado de la superficie es " + (esResultadoEsperado ? "el esperado" : "diferente al esperado"));
        System.out.println("** FIN DE PRUEBA DE CLASE Circulo            **\n");

        // Verificar el resultado del rectángulo
        System.out.println("\n*********************************************");
        System.out.println("* INICIA PRUEBA DE CLASE Rectangulo         *");
        System.out.println("*********************************************\n");

        // Muestro estado del objeto rectangulo
        System.out.println("Muestro estado del objeto rectangulo --> " + rectangulo);
        System.out.println("Perímetro: " + rectangulo.getPerimetro());
        System.out.println("Superficie: " + rectangulo.getSuperficie());
        System.out.println("Verifico el comportamiento de los métodos getPerimetro() y getSuperficie() de la clase Rectangulo");

        // Verifico método getPerimetro()
        esResultadoEsperado = resultadoPerimetroRectangulo == resultadoEsperadoPerimetroRectangulo;
        System.out.println("El resultado del perímetro es " + (esResultadoEsperado ? "el esperado" : "diferente al esperado"));

        // Verifico método getSuperficie()
        esResultadoEsperado = resultadoSuperficieRectangulo == resultadoEsperadoSuperficieRectangulo;
        System.out.println("El resultado de la superficie es " + (esResultadoEsperado ? "el esperado" : "diferente al esperado"));
        System.out.println("** FIN DE PRUEBA DE CLASE Rectangulo         **\n");
    }
}