package com.example.apresentacao.dto;

import com.example.apresentacao.entity.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponse {

    private String nome;
    private String email;

    public UsuarioResponse(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }
}
