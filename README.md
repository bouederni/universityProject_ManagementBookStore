
<h1>À FAIRE</h1>
<h3>ENLEVER TOUT CE QUI EST EN RAPPORT AVEC LA LIVRAISON </h3>
<h2>GLOBAL</h2>

* Refaire le rendu graphique du logiciel
* Ajout d'une icône
* Permettre un enregistrement des données à travers les sessions
* Modification du nom / MDP d'un magasin


<h2>MODEL</h2>

<b>Client</b> :
* Finaliser l'implémentation de la date de naissance dans NewClient/NewEmploye

<b>Magasin</b> : 
* Ajout d'autres arguments facultatifs (Mot de passe/Site web/téléphone/Nom du directeur/date de création/logo?)

<h2>CONTROLLER</h2>

* Faire en sorte que les appels aux fenêtres dans la View ne se déroulent que dans la partie View (en utilisant les variables de statut au niveau des contrôleur ainsi que des getters pour les différentes données modifiées)
* modifier l'affichage du téléphone |FRA|+33|nombre de taille 9|
* afficher un message d'erreur lorsque l'on souhaite supprimer un achat/employé/client/livre "Etes-vous sûre de vouloir supprimer cet ...?"

<h2>VIEW</h2>


<b>DoAch </b> : 


* Permettre de pouvoir afficher les infos d'un livre en double-cliquant sur un élément de la liste de livre 

<b>Gest_Achats </b> : 

* Afficher la liste des articles de l'achat dans la partie à droite

<b>Gest_Livre/Client/Employé </b> : 

* Afficher les articles de l'achat dans la partie à droite
* Bloquer l'accès à la modification du JTextfield id ou créer un JLabel
