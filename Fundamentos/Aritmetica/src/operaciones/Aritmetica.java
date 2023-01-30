
package operaciones;

public class Aritmetica {
    //Atributos
    int a;
    int b;
 
    //Constructor vacio
    
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    //Constructor con argumentos
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodo
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
