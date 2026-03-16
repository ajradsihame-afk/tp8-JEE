package com.example.demo.mapper;
// Import des DTO utilisés pour recevoir et envoyer les données de l'API
import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.dto.StudentResponseDTO;

// Import de l'entité Student qui correspond à la table de la base de données
import com.example.demo.entities.Student;

// Import de l'annotation Component pour que Spring puisse gérer ce mapper comme un bean
import org.springframework.stereotype.Component;

// Cette classe sert à convertir les objets entre les différentes couches :
// DTO <-> Entity
@Component
public class StudentMapper {

    // Cette méthode convertit un StudentRequestDTO (données reçues dans l'API)
    // en objet Student (entité utilisée pour la base de données)
    public Student toEntity(StudentRequestDTO dto) {

        // Création d'un nouvel objet Student
        Student student = new Student();

        // Copie des valeurs du DTO vers l'entité
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        student.setMajor(dto.major());
        student.setAge(dto.age());

        // Retourne l'entité prête à être sauvegardée dans la base
        return student;
    }

    // Cette méthode convertit une entité Student
    // en StudentResponseDTO (données renvoyées au client dans l'API)
    public StudentResponseDTO toResponseDTO(Student student) {

        // Création d'un DTO de réponse avec les données de l'entité
        return new StudentResponseDTO(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getMajor(),
                student.getAge()
        );
    }

    // Cette méthode met à jour une entité Student existante
    // avec les nouvelles valeurs provenant du DTO
    public void updateEntityFromDTO(StudentRequestDTO dto, Student student) {

        // Mise à jour des champs de l'entité
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        student.setMajor(dto.major());
        student.setAge(dto.age());
    }
}

