package com.example.demo.entities;
// Importation des annotations JPA depuis Jakarta (utilisées avec Spring Boot 3+ et Java 17)
import jakarta.persistence.*;

// Cette annotation indique que cette classe représente une entité JPA
// c'est-à-dire une table dans la base de données
@Entity

// Spécifie le nom de la table dans la base de données
@Table(name = "students")
public class Student {

    // Indique que cet attribut est la clé primaire de la table
    @Id

    // Spécifie que la valeur de l'id sera générée automatiquement
    // par la base de données (Auto Increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Définition de la colonne firstName dans la table
    // nullable = false : le champ est obligatoire
    // length = 100 : taille maximale de 100 caractères
    @Column(nullable = false, length = 100)
    private String firstName;

    // Colonne pour le nom de famille
    @Column(nullable = false, length = 100)
    private String lastName;

    // Colonne pour l'email
    // unique = true : chaque email doit être unique dans la table
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    // Colonne représentant la spécialité de l'étudiant
    @Column(nullable = false, length = 100)
    private String major;

    // Colonne représentant l'âge de l'étudiant
    @Column(nullable = false)
    private Integer age;

    // Constructeur vide (obligatoire pour JPA)
    public Student() {
    }

    // Constructeur avec tous les attributs pour créer un objet Student facilement
    public Student(Long id, String firstName, String lastName, String email, String major, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.age = age;
    }

    // Getter pour récupérer l'id
    public Long getId() {
        return id;
    }

    // Setter pour modifier l'id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter pour récupérer le prénom
    public String getFirstName() {
        return firstName;
    }

    // Setter pour modifier le prénom
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter pour récupérer le nom
    public String getLastName() {
        return lastName;
    }

    // Setter pour modifier le nom
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter pour récupérer l'email
    public String getEmail() {
        return email;
    }

    // Setter pour modifier l'email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter pour récupérer la spécialité
    public String getMajor() {
        return major;
    }

    // Setter pour modifier la spécialité
    public void setMajor(String major) {
        this.major = major;
    }

    // Getter pour récupérer l'âge
    public Integer getAge() {
        return age;
    }

    // Setter pour modifier l'âge
    public void setAge(Integer age) {
        this.age = age;
    }
}

