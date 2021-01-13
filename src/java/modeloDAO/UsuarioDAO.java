
package modeloDAO;

import config.Conexion;
import interfaces.CRUD;
import java.util.List;
import modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class UsuarioDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuarios u = new Usuarios();

    @Override
    public List listar() {
        ArrayList<Usuarios>list=new ArrayList<>();
        String sql = "select * from usuario";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuarios u = new Usuarios();
                u.setUsuario_id(rs.getInt("usuario_id"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setDocumento(rs.getString("documento"));
                u.setIden(rs.getString("Iden"));
                u.setFechayhora(rs.getString("fechayhora"));
                u.setVisita(rs.getString("visita"));
                u.setMotivo(rs.getString("motivo"));
                u.setContra(rs.getString("contra"));
                list.add(u);
            }
        }catch (Exception e){
        }
        return list;
    }

    @Override
    public Usuarios list(int usuario_id) {
        String sql = "select * from usuario where usuario_id="+usuario_id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                u.setUsuario_id(rs.getInt("usuario_id"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setDocumento(rs.getString("documento"));
                u.setIden(rs.getString("Iden"));
                u.setFechayhora(rs.getString("fechayhora"));
                u.setVisita(rs.getString("visita"));
                u.setMotivo(rs.getString("motivo"));
                u.setContra(rs.getString("contra"));
            }
        }catch (Exception e){
        }
        return u;
    }

    @Override
    public boolean add(Usuarios u) {
        String sql = "insert into usuario(nombre, apellido, documento, iden, visita, motivo, contra) values ('"+u.getNombre()+"','"+u.getApellido()+
                "','"+u.getDocumento()+ "','"+u.getIden()+ "','"+u.getVisita()+ "','"+u.getMotivo()+"','"+u.getContra()+"')";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }

    @Override
    public boolean edit(Usuarios u) {
        String sql = "update usuario set nombre='"+u.getNombre()+"',apellido='"+u.getApellido()+
                "',documento'"+u.getDocumento()+ "',iden'"+u.getIden()+ "',visita'"+u.getVisita()+ 
                "',motivo'"+u.getMotivo()+"', contra='"+u.getContra()+"' where usuario_id="+u.getUsuario_id();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }

    @Override
    public boolean eliminar(int usuario_id) {
        String sql = "delete from usuario where usuario_id="+usuario_id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }
    
}
