package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //determinarTipo(empleado);
        empleado = new Gerente("Karla", 100000, "Contabilidad");
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }

}
