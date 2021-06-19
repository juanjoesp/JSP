<%-- 
    Document   : paginaDestino
    Created on : 22-04-2020, 16:39:19
    Author     : juanjo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Destino JSP</title>
        <link href="paginaDestino.css" rel="stylesheet" type="text/css">
        <style type="text/css">
        </style>
    </head>
    <body>
        <%
            //Este es un scriplet
            //Es codigo en Java que captura los parametros enviados
            //en el objeto "request"
            String nombre = request.getParameter("nombre");
            int monto = Integer.parseInt(request.getParameter("monto"));
            int cuotas = Integer.parseInt(request.getParameter("cuotas"));
            String seguro1 = request.getParameter("seguro1");
            String seguro2 = request.getParameter("seguro2");
            int montoSeguro = Integer.parseInt(request.getParameter("monto"));
            double vseguroD = montoSeguro * 0.1;
            double vseguroI = montoSeguro * 0.05;
            double interes = 0;
            if (cuotas <= 10) {
                interes = Math.round(monto * 1.3);
            } else if (cuotas >= 11 && cuotas <= 20) {
                interes = Math.round(monto * 1.35);
            } else if (cuotas > 20) {
                interes = Math.round(monto * 1.4);
            }
        %>

        <table cellspacing="4" cellpadding="3" border="1">
            <tr>
                <td align="right"> Nombre: </td>
                <td> <%= nombre%> </td>
            </tr>
            <tr>
                <td align="right"> Monto Solicitado: </td>
                <td> <%= monto%> </td> 
            </tr>
            <tr>
                <td align="right"> N° de Cuotas: </td>
                <td> <%= cuotas%> </td> 
            </tr>
            <tr>
                <td align="right"> Seguro que acepto: </td>
                <td>
                    <%=seguro1%>
                    <%=seguro2%>
                </td> 
            </tr>
            <tr>
                <td align="right"> Valor seguro Desgravamen: </td>
                <td> <%= vseguroD%> </td> 
            </tr>
            <tr>
                <td align="right"> Valor seguro Contra Incendio: </td>
                <td> <%= vseguroI%> </td> 
            </tr>
            <tr>
                <td align="right"> Monto solicitado mas Intereses: </td>
                <td> <%= interes%> </td> 
            </tr>
        </table>
            <p>
        <form action="index.jsp" method="post">
            <center>
            <input type="submit" value="Regresar">
            </center>
        </form>
    </body>
</html>
