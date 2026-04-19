# 🐾 PetShop Web Application - Java EE

## 📌 Présentation du Projet
Il s'agit d'une application de commerce électronique simplifiée pour un magasin d'animaux. Ce projet a été développé pour apprendre et mettre en pratique l'architecture **MVC (Modèle-Vue-Contrôleur)** en utilisant les technologies Java Web fondamentales.

## 🚀 Fonctionnalités
- **Catalogue d'animaux :** Affichage dynamique des animaux disponibles depuis un service Java.
- **Gestion du Panier :**
    - Ajout d'animaux au panier.
    - Suppression d'articles.
    - Calcul automatique du total.
- **Système d'Authentification :**
    - Page de connexion (Login) sécurisée avec la méthode POST.
    - Gestion de la session utilisateur (affichage personnalisé après connexion).
- **Design :** Interface stylisée avec du CSS pur.

## 🛠️ Technologies Utilisées
- **Backend :** Java EE (Servlets, JSP, Sessions)
- **Frontend :** HTML5, CSS3, JSTL (JavaServer Pages Standard Tag Library)
- **Architecture :** MVC (Model-View-Controller)
- **Serveur :** Apache Tomcat 9+
- **IDE :** IntelliJ IDEA

## 📂 Structure du Projet
- `com.petshop.model` : Contient les classes de données (`Animal`, `Panier`).
- `com.petshop.service` : Logique métier et simulateur de données (`AnimalService`).
- `com.petshop.controller` : Servlets gérant les requêtes HTTP (`CatalogueServlet`, `PanierServlet`, `LoginServlet`).
- `webapp/WEB-INF` : Pages JSP protégées et configuration `web.xml`.
- `webapp/css` : Fichiers de style.

## ⚙️ Installation
1. Cloner le dépôt : `git clone https://github.com/TON_PSEUDO/NOM_DU_PROJET.git`
2. Configurer votre serveur **Apache Tomcat** dans votre IDE.
3. Déployer l'artefact `.war`.
4. Accéder à l'application via `http://localhost:8080/NOM_DU_PROJET/catalogue`.

---
*Projet réalisé dans un cadre d'apprentissage des fondamentaux Java EE.*
