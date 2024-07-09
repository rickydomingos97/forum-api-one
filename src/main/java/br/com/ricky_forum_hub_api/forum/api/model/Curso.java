package br.com.ricky_forum_hub_api.forum.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
}