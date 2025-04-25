package ar.org.centro8.java.actividad1.tests;

import ar.org.centro8.java.actividad1.entidades.AutoClasico;
import ar.org.centro8.java.actividad1.entidades.AutoNuevo;
import ar.org.centro8.java.actividad1.entidades.Colectivo;
import ar.org.centro8.java.actividad1.entidades.Radio;

public class DemostracionDeFuncionamiento {
    public static void main(String[] args) {
        // Instancio tres objetos de clase Radio
        Radio radio1 = new Radio("Pioneer", "300 Watts");
        Radio radio2 = new Radio("Samsung", "500 Watts");
        Radio radio3 = new Radio("LG", "100 Watts");

        // Instancio un vehículo de cada subclase (AUtoClasico, AutoNuevo y Colectivo)
        AutoNuevo autoNuevo1 = new AutoNuevo("Ford", "Fiesta", "Gris", "LG", "50 Watts");
        AutoClasico autoClasico1 = new AutoClasico("Fiat", "600", "Verde");
        Colectivo colectivo1 = new Colectivo("Mercedes Benz", "1114", "Blanco");

        // Muestro el estado de los objetos
        System.out.println("\n********************************");
        System.out.println("MUESTRO EL ESTADO DE LOS OBJETOS");
        System.out.println("********************************");
        System.out.println("radio1=" + radio1);
        System.out.println("radio2=" + radio2);
        System.out.println("radio3=" + radio3);
        System.out.println("autoNuevo1=" + autoNuevo1);
        System.out.println("autoClasico1=" + autoClasico1);
        System.out.println("colectivo1=" + colectivo1);
        System.out.println();

        // Valido el comportamiento de asignaciones de radios a los vehículos
        // PRUEBA #1: el vehículo ya tiene radio asignada
        System.out.println("PRUEBA #1: Intento asignar radio1 a autoNuevo1");
        System.out.println("(resultado esperado: 'Ya hay una radio asignada en el vehículo')");
        autoNuevo1.agregarRadio(radio1);
        System.out.println();
        
        // PRUEBA #2: el vehículo no tiene radio asignada
        System.out.println("PRUEBA #2: Intento asignar radio1 a autoClasico1");
        System.out.println("(resultado esperado: 'Se agregó con éxito la radio...')");
        autoClasico1.agregarRadio(radio1);
        System.out.println();
        
        // PRUEBA #3: El vehículo no tiene radio pero la radio ya está asignada a otro vehículo
        System.out.println("PRUEBA #3: Intento asignar radio1 a colectivo1");
        System.out.println("(resultado esperado: 'La radio que se quiere agregar ya está en uso en otro vehículo')");
        colectivo1.agregarRadio(radio1);

        // PRUEBA #4: Obtengo la radio de autoNuevo1 y pruebo agregarla a colectivo1
        System.out.println("PRUEBA #4: Obtengo la radio de autoNuevo1 y pruebo agregarla a colectivo1");
        System.out.println("(resultado esperado: 'La radio que se quiere agregar ya está en uso en otro vehículo')");
        Radio otraRadio = autoNuevo1.getRadio();
        colectivo1.agregarRadio(otraRadio);
        System.out.println();

        // Muestro el estado de los objetos
        System.out.println("\n********************************");
        System.out.println("MUESTRO EL ESTADO DE LOS OBJETOS");
        System.out.println("********************************");
        System.out.println(autoNuevo1);
        System.out.println(autoClasico1);
        System.out.println(colectivo1);
        System.out.println("autoNuevo1=" + autoNuevo1);
        System.out.println("autoClasico1=" + autoClasico1);
        System.out.println("colectivo1=" + colectivo1);
        System.out.println();

        // Valido el comportamiento de cambio de radios a los vehículos
        // PRUEBA #6: Intento cambiar la radio a colectivo1 que no tiene
        System.out.println("PRUEBA #6: Intento cambiar la radio a colectivo1 que no tiene");
        System.out.println("(resultado esperado: 'El vehículo no tiene radio asignada que se pueda cambiar')");
        colectivo1.cambiarRadio(radio3);
        System.out.println();

        // PRUEBA #7: cambio la radio de autoNuevo1 por radio3
        System.out.println("PRUEBA #7: cambio la radio de autoNuevo1 por radio3");
        System.out.println("(resultado esperado: 'Se cambió la radio anterior por la nueva...')");
        autoNuevo1.cambiarRadio(radio3);
        System.out.println();

        // PRUEBA #8: cambio la radio de autoClasico1 por radio3
        System.out.println("PRUEBA #8: cambio la radio de autoClasico1 por radio3");
        System.out.println("(resultado esperado: 'La radio que se quiere cambiar ya está en uso en otro vehículo')");
        autoClasico1.cambiarRadio(radio3);
        System.out.println();

        // PRUEBA #9: fuerzo el cambio de la radio de autoClasico1 por radio3 utilizando el método 'setRadio'
        System.out.println("PRUEBA #9: fuerzo el cambio de la radio de autoClasico1 por radio3 utilizando el método 'setRadio()'");
        System.out.println("(resultado esperado: 'Ya hay una radio asignada en el vehículo')");
        autoClasico1.setRadio(radio3);
        System.out.println();

        // PRUEBA #10: fuerzo el cambio de la radio de colectivo1 por radio3 utilizando el método 'setRadio'
        System.out.println("PRUEBA #10: fuerzo el cambio de la radio de colectivo1 por radio3 utilizando el método 'setRadio()'");
        System.out.println("(resultado esperado: 'La radio que se quiere agregar ya está en uso en otro vehículo')");
        colectivo1.setRadio(radio3);
        System.out.println();

        // PRUEBA #11: Creo radio4 y la agrego a colectivo1 con el método 'setRadio()' y pruebo cambiarla por ella misma
        System.out.println("PRUEBA #11: Creo radio4 y la agrego a colectivo1 con el método 'setRadio()' y pruebo cambiarla por ella misma");
        System.out.println("(resultado esperado: 'La radio que quiere cambiar es la misma que está en el vehículo')");
        Radio radio4 = new Radio("Aiwa", "250 Watts");
        colectivo1.setRadio(radio4);
        colectivo1.cambiarRadio(radio4);
        System.out.println();

        // PRUEBA #12: Cambio la radio de colectivo1 a 'null' para quitar la radio del vehículo
        System.out.println("PRUEBA #12: Cambio la radio de colectivo1 a 'null' para quitar la radio del vehículo");
        System.out.println("(resultado esperado: 'Se quita la radio ... del vehículo')");
        colectivo1.cambiarRadio(null);
        System.out.println();
    }
}
