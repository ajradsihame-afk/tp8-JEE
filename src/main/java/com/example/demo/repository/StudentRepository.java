package com.example.demo.repository;

// Import de l'entité Student située dans le package entity
import com.example.demo.entities.Student;

// Import de l'interface JpaRepository qui fournit les opérations CRUD
// (Create, Read, Update, Delete) automatiquement
import org.springframework.data.jpa.repository.JpaRepository;

// Import de Optional pour gérer les valeurs qui peuvent être null
import java.util.Optional;

// Déclaration de l'interface StudentRepository
// Elle hérite de JpaRepository pour utiliser les méthodes CRUD déjà fournies
// <Student, Long> signifie :
// Student = l'entité gérée
// Long = le type de la clé primaire (id)
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Méthode pour trouver un étudiant par son email
    // Spring Data JPA génère automatiquement la requête SQL
    // Optional est utilisé pour éviter les erreurs si aucun étudiant n'est trouvé
    Optional<Student> findByEmail(String email);

    // Méthode qui vérifie si un email existe déjà dans la base de données
    // Retourne true si l'email existe, sinon false
    boolean existsByEmail(String email);
}