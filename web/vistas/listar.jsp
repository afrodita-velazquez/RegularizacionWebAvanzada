<%-- 
    Document   : listar
    Created on : 11/01/2021, 11:18:17 PM
    Author     : molli
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Usuarios"%>
<%@page import="modeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Lista de Accesos:</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar usuario</a>
            <br> <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Tipo documento</th>
                        <th class="text-center">Identificacion</th>
                        <th class="text-center">Fecha y hora</th>
                        <th class="text-center">Visita a</th>
                        <th class="text-center">Motivo</th>
                        <th class="text-center">Contraseña</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <%
                    UsuarioDAO dao = new UsuarioDAO();
                    List<Usuarios>list = dao.listar();
                    Iterator<Usuarios>iter = list.iterator();
                    Usuarios u = null;
                    while(iter.hasNext()){
                        u = iter.next();
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= u.getUsuario_id() %></td>
                        <td class="text-center"><%= u.getNombre() %></td>
                        <td class="text-center"><%= u.getApellido() %></td>
                        <td class="text-center"><%= u.getDocumento() %></td>
                        <td class="text-center"><%= u.getIden() %></td>
                        <td class="text-center"><%= u.getFechayhora() %></td>
                        <td class="text-center"><%= u.getVisita() %></td>
                        <td class="text-center"><%= u.getMotivo() %></td>
                        <td class="text-center"><%= u.getContra() %></td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?accion=Editar&usuario_id=<%=u.getUsuario_id()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=Eliminar&usuario_id=<%=u.getUsuario_id()%>">Eliminar</a>
                        </td>
                    </tr>
                    <% 
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
