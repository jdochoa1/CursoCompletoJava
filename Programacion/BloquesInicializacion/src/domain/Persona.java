package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Ejecución bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10;        
    }
    
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
