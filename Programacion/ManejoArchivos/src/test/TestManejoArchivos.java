package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "/home/david/Documentos/prueba.txt";
  //      crearArchivo(nombreArchivo);
        
  //      escribirArchivo(nombreArchivo, "Hola desde Java");
  //      anexarArchivo(nombreArchivo, "Adios");
        
    leerArchivo(nombreArchivo);
    }
}
