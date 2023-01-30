package test;

import datos.*;
import domain.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoUsuarios {
    
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(2);
            cambioUsuario.setUsuario("karlau");
            cambioUsuario.setPassword("123456");
            usuarioDao.actualizar(cambioUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            //nuevoUsuario.setUsuario("Jgomez22222222222222222222222222222222222222222222222222222222222222222222");
            nuevoUsuario.setUsuario("Jose Gomez");
            nuevoUsuario.setPassword("123456");
            usuarioDao.insertar(nuevoUsuario);
            
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
