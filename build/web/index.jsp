<%-- 
    Document   : index
    Created on : 08/03/2021, 21:06:28
    Author     : Thiago Mathias
    RM         : 1290481923047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atividade JUROS</title>
    </head>
    <body>
        <h1>Atividade JUROS</h1>
        
        <form action="JurosSimplesServlet" method="post">
            <label for="valPresente">Valor Presente: </label><input type="text" name="valPresente"></input><br><br>
            <label for="taxJuros">Taxa de Juros: </label><input type="text" name="taxJuros"></input><br><br>
            <label for="tmpMeses">Tempo (meses): </label><input type="number" max="999" min="1" name="tmpMeses"></input>

            <br><br><br>

            <input type="submit"">

            <br><br>
        </form>
    </body>
</html>
