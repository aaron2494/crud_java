<%-- 
    Document   : modificarPersonas
    Created on : 28/06/2022, 10:28:43
    Author     : aaron
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1>Lista de Personas</h1>
        <%
            List<Persona>listaPersonas=(List)request.getSession().getAttribute("listaPersonas");
            for(Persona per:listaPersonas){
        %>
        <p><b>Dni:</b><%=per.setDni(per.getDni())%></p>
        <p><b>Nombre:</b><%=per.setNombre("nombre")%></p>
        <p><b>Apellido:</b><%=per.setApellido("apellido")%></p>
        <p><b>Telefono:</b><%=per.setTelefono("telefono")%></p>
        <p>----------------------------</p>
        <%
            }
        %>
</html>
