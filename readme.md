# Système de vente aux enchères distribué

Le système de vente aux enchères distribué est une application basée sur Java qui permet aux clients de participer à des enchères à distance. Le système utilise Java RMI (Invocation de Méthode à Distance) pour établir la communication entre le serveur d'enchères et les clients. Le serveur gère le processus d'enchères, suit les offres et déclare les gagnants. Les clients peuvent s'inscrire, placer des offres et recevoir des notifications sur l'état des enchères. Le système offre une approche distribuée et décentralisée, permettant à plusieurs clients d'interagir simultanément avec le serveur.

## Fonctionnalités

Le système de vente aux enchères distribué offre les fonctionnalités suivantes :

1. Inscription des clients : Les clients peuvent s'inscrire auprès du serveur d'enchères pour participer aux enchères.
2. Placement des offres : Les clients peuvent placer des offres sur les articles mis aux enchères en spécifiant le montant de leur offre.
3. Notification des offres : Les clients reçoivent des notifications lorsqu'ils sont surpassés par une offre supérieure.
4. Notification du gagnant : Lorsque l'enchère se termine, le client gagnant est notifié du résultat de l'enchère.
5. Démarrage et fin de l'enchère : Le serveur permet de démarrer et de mettre fin à l'enchère.

## Technologies utilisées

Les technologies suivantes ont été utilisées pour développer le système de vente aux enchères distribué :

- Java : Le langage de programmation principal utilisé pour implémenter le système.
- Java RMI : Utilisé pour la communication à distance entre le serveur d'enchères et les clients.
- IntelliJ IDEA : L'environnement de développement intégré (IDE) utilisé pour la création, le développement et le débogage des fichiers sources Java.

## Comment exécuter le système

Pour exécuter le système de vente aux enchères distribué, suivez les étapes ci-dessous :

1. Assurez-vous que vous avez Java installé sur votre machine.
2. Ouvrez IntelliJ IDEA et importez les fichiers source du système.
3. Exécutez la classe `AuctionServerApp` pour démarrer le serveur d'enchères.
4. Exécutez la classe `AuctionClientImpl` pour démarrer un client et participer aux enchères.
5. Suivez les instructions fournies par l'application pour placer des offres et interagir avec l'enchère.

N'hésitez pas à explorer le code source pour plus de détails sur la mise en œuvre du système.

