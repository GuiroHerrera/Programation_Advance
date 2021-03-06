<!-- en la directiva page observamos el import="java.sql.*"-->
<!-- esta es la analogia en java a importar paquetes y/o clases-->
<!-- en el paquete java.sql.* estan las clases necesarias-->
<!-- para la conexion a la bd mysql -->
<%@ page language="java" import="java.sql.*" %>
<%
    /*conexion sera nuestra conexion a la bd*/
    Connection conexion=null;
 
    String mensaje="";
 
    /*parametros para la conexion*/
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/puerto_quito";
    String usuario = "root";
    String clave = "";
    /*procedimiento de la conexion*/
    try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url,usuario,clave);
 
        /*guardando la conexion en la session*/
        session.setAttribute("conexion",conexion);
    } catch (Exception ex){
        mensaje=ex.toString();
    }
 
    mensaje="conectado";
    if(conexion.isClosed()){
        mensaje="desconectado";
    }
%>
<html>
    <head>
        <title>EJERCICIO 03 CONEXION BD CON JSP</title>
    </head>
    <body>
        <form action="desconectar.jsp" method="post">
            <input name="estado" type="text" value="Estado: <%=mensaje%>"/>
            <input type="submit" value="Desconectar"/>
        </form>
    </body>
</html>
