<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>    <link rel="css/style.css">

</head>
<body>
<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>
<form action="login" method="post">
    <label for="username">Identifiant:</label>
    <input type="text" id="username" name="username" required><br><br>
    <label for="password">Mot de passe:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Se connecter">

</form>

</body>
</html>
