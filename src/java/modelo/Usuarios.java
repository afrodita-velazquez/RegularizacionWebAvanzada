/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author molli
 */
public class Usuarios {
    int usuario_id;
    String nombre;
    String apellido;
    String documento;
    String iden;
    String fechayhora;
    String visita;
    String motivo;
    String contra;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String documento, String iden, String fechayhora, String visita, String motivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.iden = iden;
        this.fechayhora = fechayhora;
        this.visita = visita;
        this.motivo = motivo;
        this.contra = contra;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    
    
    
}
