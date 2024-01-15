package com.example.project.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    /* Creates a table called quiz_questions(quiz_id, question_id) */
    @ManyToMany
    private List<Question> questions;
}
