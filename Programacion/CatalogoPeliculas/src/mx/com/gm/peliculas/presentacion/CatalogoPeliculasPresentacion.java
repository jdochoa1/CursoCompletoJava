package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.*;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        
        while(opcion != 0){
            System.out.println("Elige una opción: \n"
                + "1. Iniciar catalogo de peliculas \n"
                + "2. Agregar pelicula\n"
                + "3. Listar peliculas\n"
                + "4. Buscar pelicula\n"
                + "0. Salir");
            
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce nombre pelicula: ");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce nombre pelicula: ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
