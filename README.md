# TP Docker - Application Spring Boot & MySQL

Ce projet est un Travaux Pratique (TP) visant à conteneuriser une application Java Spring Boot et à l'orchestrer avec une base de données MySQL à l'aide de Docker.

## Fonctionnalités
- Application Spring Boot 3.5.12 (Java 17).
- Conteneurisation avec **Dockerfile**.
- Orchestration multi-conteneurs avec **Docker Compose**.
- Base de données **MySQL 8.0**.

## Prérequis
- Docker Desktop installé.
- Java 17 (pour la compilation locale).
- Maven (ou utiliser le wrapper `./mvnw`).

## Architecture du tp 

<img width="533" height="968" alt="Screenshot 2026-03-24 023138" src="https://github.com/user-attachments/assets/d8449d94-2a31-4f90-abb5-209e929ae448" />

#### Architecture du projet
# Dockerfile : Définit l'image de l'application Java basée sur eclipse-temurin:17-jdk-alpine.

# docker-compose.yml : Gère le déploiement simultané de l'application et de MySQL, incluant la configuration du réseau et des variables d'environnement.

<img width="1919" height="1006" alt="Screenshot 2026-03-24 023409" src="https://github.com/user-attachments/assets/bdc9f6ee-93b7-4174-aa68-11e00c40090b" />

<img width="951" height="496" alt="Screenshot 2026-03-24 023503" src="https://github.com/user-attachments/assets/642bb52a-d598-4eb6-a52b-72298e55a3f6" />
<img width="1536" height="910" alt="Screenshot 2026-03-24 023725" src="https://github.com/user-attachments/assets/e8e2de68-ce5c-41a7-9495-337fded19763" />
<img width="1424" height="599" alt="Screenshot 2026-03-24 023732" src="https://github.com/user-attachments/assets/77645141-f89c-4ea4-ae05-ab86f8d748c8" />


