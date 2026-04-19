<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalogue des animaux</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h1>Notre catalogue</h1>
    <table border="1" cellpadding="10" cellspacing="0">
        <thead>
            <tr>
                <th>Nom</th>
                <th>Espèce</th>
                <th>Prix</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${animaux}" var="animal">
                <tr>
                    <td>${animal.nom}</td>
                    <td>${animal.espece}</td>
                    <td>${animal.prix} €</td>
                    <td><a href="panier?action=ajouter&id=${animal.id}">Ajouter au panier</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
