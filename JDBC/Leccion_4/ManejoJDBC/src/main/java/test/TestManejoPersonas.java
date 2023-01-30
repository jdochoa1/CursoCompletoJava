package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDao = new PersonaDAO(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivone");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@mail.com");
            cambioPersona.setTelefono("33225566");
            personaDao.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            //nuevaPersona.setApellido("Ramirez132123123123123113213213212132131131232123132123123132123123123123132132132123132123123132132123123132132123132123123123123123132132123");
            nuevaPersona.setApellido("Ramirez");
            personaDao.insertar(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
                            

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
