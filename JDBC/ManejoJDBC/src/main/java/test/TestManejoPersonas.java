package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto persona
//        Persona personaNueva = new Persona("Carlos", "Escobar", "cescobar@mail.com", "55544422233");
//        int mensaje = personaDao.insertar(personaNueva);
//        System.out.println("Se insertaron " + mensaje + " registros");


        //Modificar un registro
        
//        Persona personaModificar = new Persona(3, "Juan Carlos","Escobar","jcescobar@mail.com","5554442233");
//        int mensaje = personaDao.actualizar(personaModificar);
//        System.out.println("Se modificaron " + mensaje + " registros");

        //Borrar un registro
        
        Persona personaBorrar = new Persona(4);
        int mensaje = personaDao.borrar(personaBorrar);
        System.out.println("Se borraron " + mensaje + " registros");
        
        //Listar personas

        List<Persona> personas = personaDao.seleccionar();
//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }

}
