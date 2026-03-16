package com.example.demo.dto;
// Import des annotations de validation utilisées pour vérifier les données
// envoyées par l'utilisateur (formulaire ou requête API)
import jakarta.validation.constraints.*;

// Définition d'un record Java (introduit en Java 16, compatible avec Java 17)
// Un record est une classe simplifiée utilisée pour transporter des données (DTO)
public record StudentRequestDTO(

        // Vérifie que le prénom n'est pas vide ou null
        @NotBlank(message = "Le prénom est obligatoire")
        String firstName,

        // Vérifie que le nom n'est pas vide
        @NotBlank(message = "Le nom est obligatoire")
        String lastName,

        // Vérifie que l'email n'est pas vide
        @NotBlank(message = "L'email est obligatoire")

        // Vérifie que l'email respecte un format valide
        @Email(message = "Format d'email invalide")
        String email,

        // Vérifie que la filière n'est pas vide
        @NotBlank(message = "La filière est obligatoire")
        String major,

        // Vérifie que l'âge n'est pas null
        @NotNull(message = "L'âge est obligatoire")

        // Vérifie que l'âge minimum est 17
        @Min(value = 17, message = "L'âge minimal est 17")

        // Vérifie que l'âge maximum est 100
        @Max(value = 100, message = "L'âge maximal est 100")
        Integer age
) {}

