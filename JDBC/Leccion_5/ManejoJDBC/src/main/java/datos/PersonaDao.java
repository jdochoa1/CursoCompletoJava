package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDao {
    
    public List<PersonaDTO> seleccionar() throws SQLException;
    
    public int insertar(PersonaDTO persona) throws SQLException;
    
    public int actualizar(PersonaDTO persona)throws SQLException;
    
    public int borrar(PersonaDTO persona)throws SQLException;
}
