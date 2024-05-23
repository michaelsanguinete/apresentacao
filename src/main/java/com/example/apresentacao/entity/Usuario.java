package com.example.apresentacao.entity;

import com.example.apresentacao.dto.UsuarioRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQ_USUARIO")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    public Usuario(UsuarioRequest request) {
        this.nome = request.getNome();
        this.email = request.getEmail();
    }
}
