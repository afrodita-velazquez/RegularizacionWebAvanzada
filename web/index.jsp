<%-- 
    Document   : index
    Created on : 11/01/2021, 11:02:37 PM
    Author     : molli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container col-lg-3">
            <form action="Controlador">
                <div class="form-group text-center">
                    <img src="img/1.png" height="100" width="200"/>
                    <p><srrong>Bienvenidos</srrong></p>
                </div>
                <div class="form-group">
                    <label>Nombre:</label>
                    <input class="form-control" type="text" name="txtNombre" placeholder="Ingrese su nombre...">
                <div class="form-group">
                    <label>Contraseña:</label>
                    <input type="pass" name="txtContra" placeholder="Ingrese su contraseña..." class="form-control">
                </div>
                    <input class="btn btn-danger btn-block" type="submit" name="accion" value="Ingresar">
            
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
