package caja;


public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3, 2, 6);
        caja1.calcularVolumen();
        
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Caja caja2 = new Caja();
        caja2.ancho = ancho;
        caja2.alto = alto;
        caja2.profundo = profundo;
        
        int volumen=caja2.calcularVolumenConRetorno();
        System.out.println("Volumen con retorno: " + volumen);
        
    }
    
}
