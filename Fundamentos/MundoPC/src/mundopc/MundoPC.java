package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("Numerico", "HP");
        Raton ratonHP   = new Raton("Ergonomico", "HP");
        Computadora computadoraHP = new Computadora("Gerencia", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer",34);
        Teclado tecladoGamer = new Teclado("Numerico", "Gamer");
        Raton ratonGamer   = new Raton("Ergonomico", "Gamer");
        Computadora computadoraGamer = new Computadora("Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
    
}
