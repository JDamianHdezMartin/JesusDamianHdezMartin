<%-- 
    Document   : saludar
    Created on : 9 may 2022, 16:45:20
    Author     : daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Ejemplos JSP</title>
    </head>
    <body>
        <H1>Ejemplo de scriplet</H1>
            <%
                int numero = 7, factorial = 1;
                for (int i = numero; i > 1; i--) {
                    factorial *= i;
                }
            %>
            <%-- Se muestran en negrita el número y el resultado del factorial --%>
            <%= "El factorial de <b>" + numero + "</b> es <b>" + factorial + "</b>"%>
    </body>
</html>
