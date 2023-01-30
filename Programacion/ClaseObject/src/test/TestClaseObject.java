package test;

import domain.Empleado;

public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("David", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia de memoria");
        } else {
            System.out.println("Tienen distinta referencia");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Son iguales en contenido");
        } else {
            System.out.println("son distintos");
        }

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("el valor hashcode es igual");
        } else {
            System.out.println("el valor hashcode es distinto");
        }
    }

}
