<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Panier</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>Panier</h1>
<table border="1" cellpadding="10" cellspacing="0">
    <thead>
    <tr>
        <th>Nom</th>
        <th>Espèce</th>
        <th>Prix</th>
        <th>Retirer</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${panier.listeAnimaux}" var="animal">
        <tr>
            <td>${animal.nom}</td>
            <td>${animal.espece}</td>
            <td>${animal.prix} €</td>
            <td><a href="panier?action=retirer&id=${animal.id}">Retirer</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="panier?action=valider">Valider ma commande</a>
<a href="catalogue">Retour au catalogue</a>
<p>Prix total: ${panier.total}</p>
<a href="panier?action=vider">Vider le panier</a>

</body>
</html>
