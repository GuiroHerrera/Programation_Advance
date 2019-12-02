<%-- 
    Document   : authors
    Created on : 02/12/2019, 13:32:04
    Author     : memo1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Authors!</h1>
        <div>
            <h3>Choose an author:</h3>
            <form method="get">
                <input type="checkbox" name="author" value="Guillermo">Guillermo
                <input type="checkbox" name="author" value="Edison">Edison
                <input type="checkbox" name="author" value="Pedro">Pedro
                <input type="submit" value="Save Authors">
            </form>
            <% String[] authors = request.getParameterValues("author");
                if (authors != null) {%>
            <h3> you have selected authors</h3>
            <ol>
                <% for (int i = 0; i < authors.length; i++) {
                %>
                <li><%= authors[i]%></li>
                    <%}%>
            </ol>
            <a href="<%= request.getRequestURI()%>">BACK</a>
            <%}%>
        </div>
    </body>
</html>
