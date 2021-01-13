<%-- 
    Document   : edit
    Created on : 12/01/2021, 12:12:11 PM
    Author     : molli
--%>

<%@page import="modelo.Usuarios"%>
<%@page import="modeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
                <%
                UsuarioDAO dao = new UsuarioDAO();
                int usuarioid;
                int usuario_id = Integer.parseInt((String)request.getAttribute("usuarioid"));
                Usuarios u = (Usuarios)dao.list(usuario_id);
                %>
            <h1>Modificar usuario</h1>
            <form action="Controlador">
                Nombre:<br>
                    <input class="form-control" type="text" name="txtNombre" value="<%= u.getNombre() %>"><br>
                Apellido:<br>
                    <input class="form-control" type="text" name="txtApellido" value="<%= u.getApellido() %>"><br>
               Documento:<br>
                    <input class="form-control" type="text" name="txtDocumento" value="<%= u.getDocumento() %>"><br>
               Identificacion:<br>
                    <input class="form-control" type="text" name="txtIden" value="<%= u.getIden() %>"><br>
               Visita a:<br>
                    <input class="form-control" type="text" name="txtVisita" value="<%= u.getVisita() %>"><br>
               Motivo:<br>
                    <input class="form-control" type="text" name="txtMotivo" value="<%= u.getMotivo() %>"><br>
               Contraseña:<br>
                    <input class="form-control" type="text" name="txtContra" value="<%= u.getContra() %>"><br>
                    
                    <input type="hidden" name="txtUsuario_id" value="<%= u.getUsuario_id() %>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                    <a href="Controlador?accion=listar">Regresar</a>
            </form> 
        </div>
    </body>
</html>
