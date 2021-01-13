<%-- 
    Document   : add
    Created on : 11/01/2021, 11:18:04 PM
    Author     : molli
--%>

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
            <div class="col-lg-6">
                <h1>Agregar usuario</h1>
            <form action="Controlador">
                Nombre:<br>
                    <input class="form-control" type="text" name="txtNombre"><br>
                Apellido:<br>
                    <input class="form-control" type="text" name="txtApellido"><br>
               Documento:<br>
                    <input class="form-control" type="text" name="txtDocumento"><br>
               Identificacion:<br>
                    <input class="form-control" type="text" name="txtIden"><br>
               Visita a:<br>
                    <input class="form-control" type="text" name="txtVisita"><br>
               Motivo:<br>
                    <input class="form-control" type="text" name="txtMotivo"><br>
               Contraseña:<br>
                    <input class="form-control" type="text" name="txtContra"><br>
                    
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
            </form>
            </div>
        </div>
    </body>
</html>
