package test;

import datos.*;
import domain.*;
import java.util.*;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        //Insertamos un nuevo usuario
   //     Usuario usuario = new Usuario("Karla Lara", "456");
   //     usuarioDao.insertar(usuario);
   
           //Actualizamos un usuario
      //  Usuario usuario = new Usuario(2, "Karla Lara", "789");
      //  usuarioDao.actualizar(usuario);
      
      
         
           //Borramos un usuario
        //Usuario usuario = new Usuario(3);
       //usuarioDao.borrar(usuario);

// Ejecutando listado de usuarios;
        List<Usuario> usuarios = usuarioDao.seleccionar();
      for (Usuario usuario : usuarios) {
           System.out.println("usuario = " + usuario);
      }

    }
}
