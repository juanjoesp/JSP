<%-- 
    Document   : index
    Created on : 22-04-2020, 16:39:11
    Author     : juanjo espinoza & Guillermo Vasquez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>Index JSP</title>
        <link href="index.css" rel="stylesheet" type="text/css">
        <style type="text/css">
        </style>
    </head>
    <body>
        <form action="paginaDestino.jsp" method="post">
            <p><label for="nombre" >Nombre <br> </label>
                <input  type="text" name="nombre" id="name" placeholder="Introduce tu nombre" maxlength="45" required/></p>
            <p>
                <label>Monto <br> </label>
                <input type="number" name="monto" id="monto" placeholder="Introduce el monto" min="1" pattern="^[0-9]+" required/> UF</p>            <p>
                <label for="referencias">Cuotas (Años) <br></label>
                <select name="cuotas" id="cuota">
                    <option value="null">Selecciona una</option>
                    <option value="1" selected>1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                </select>
            </p>
            <p> Seguro Desgravamen</p>
            <input type="radio" name="seguro1" value="Degravamen"checked> 
            Si
            <input type="radio" name="seguro1" value=""> No
            <p> Seguro Contra Incendio</p>
            <input type="radio" name="seguro2" value="Contra Incendio"checked> 
            Si
            <input type="radio" name="seguro2" value=""> No

            <p>
                <input type="submit" value="Aceptar" />
            </p>
        </form>
    </body>
</html>
