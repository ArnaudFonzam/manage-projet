# manage-projet
Many to many relationship with spring boot
Ce project va te permettre de mieux maitriser l'utilisation des relation many to many
## Description du project
Nous allons dans ce projet nous focalisé sur la gestion des projets et des employés et 
l'assignation des projets aux employés et vise versa. les principales taches sont les suivantes:
Pour un Employé on doit:
 - créer un nouvel employé (/saveEmployee)
 - créer un employé et l'assignation un projet (/createEmployeeForProject/{projId})
 - recupérer un employé existant et l'assigné un projet (/assignEmployeeToProject/{projId})
 - consulter les détail d'un employé et les projet auquels il est associé (/getEmployee/{empId})
Pour un Projet on doit pouvoir:
 - créer un nouveau project (/createProject)
 - créer un projet et ajouter un employé à ce projet (/createProjectForEmployees)
 - recupérer un projet existant et ajouter un employé à ce projet (/assignProjectToEmployees/{projId}/{empId})
 - consulter un projet existant et les employées associés.
name,
 EMPLOYEE( id,  email, technicalSkill, projects);
 PROJECT( id, projectName, technologyUsed, employees);

 Chaque Entité doit avoir:
  - les getters
  - les setters
  - un constructeur sans argument
  - un constructeur avec argument (email, technicalSkill, projects)
  - une methode toString
## Configuration de l'environnement
    - Installation de Xammp pour la base de données
    - Installation d'un IDE (Intelig Idea, Spring Tool suite, Vs Code)
    - Creation du project sur Spring Initializ (https://start.spring.io/)
        Ajouter les dépendances suivantes: 
         -- Spring Boot DevTools
         -- Spring Web
         -- Spring Data JPA
         -- MySQL Driver
    -- Importation du projet sur L'IDE et té
## Connection à la base de donnée
   confert le fichier application.properties
   - création de la base de donné dans mysql
## Creation de la structure du projet
    - controller
    - service
        -serviceImpl
    - entity
    - repository
## Création des  Entité
    Confert le package entity
## Gérer la Rélation Many to Many entre les deux classes

 *.@ManyToMay.* permet d'établir la relation entre les deux tables
 *.@JoinTable.* permet de créer la table d'association 
 *.@JoinColumn.* permet d'ajouter une colonne dans la table d'association

