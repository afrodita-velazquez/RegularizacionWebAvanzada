
package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuarios;
import modelo.validar;

/**
 *
 * @author molli
 */
public class PersonaDAO implements validar{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;

    @Override
    public int validar(Usuarios u) {
        String sql = "select * from usuario where nombre=? and contra=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getContra());
            rs= ps.executeQuery();
            while(rs.next()){
                r=r+1;
                u.setNombre(rs.getString("nombre"));
                u.setContra(rs.getString("contra"));
            }
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        }catch(Exception e){
            return 0;
        }
    }
    
}
