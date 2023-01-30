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

            UsuarioDao usuarioDao = new UsuarioDaoJDBC(conexion);

            List<UsuarioDTO> usuarios = usuarioDao.seleccionar();

            for (UsuarioDTO usuario : usuarios) {
                System.out.println("usuario DTO = " + usuario);
            }

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
