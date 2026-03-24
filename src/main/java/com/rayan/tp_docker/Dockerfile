FROM eclipse-temurin:17-jdk-alpine
# On définit le répertoire de travail
WORKDIR /app
# On copie le fichier JAR (généré par votre 'mvn package' réussi)
COPY target/*.jar app.jar
# Commande pour lancer l'application
ENTRYPOINT ["java","-jar","app.jar"]