package paquete1;

class Clase1 {
    private String atributoPrivado = "Valor atributo privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    
   
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
