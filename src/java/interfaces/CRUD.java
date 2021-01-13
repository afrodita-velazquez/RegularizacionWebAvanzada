
package interfaces;
import modelo.Usuarios;
import java.util.List;

public interface CRUD {
    public List listar();
    public Usuarios list(int usuario_id);
    public boolean add(Usuarios u);
    public boolean edit(Usuarios u);
    public boolean eliminar(int usuario_id);

}
