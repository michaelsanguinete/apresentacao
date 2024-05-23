package com.example.apresentacao.service;

import com.example.apresentacao.dto.UsuarioRequest;
import com.example.apresentacao.dto.UsuarioResponse;
import com.example.apresentacao.entity.Usuario;
import com.example.apresentacao.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario salvar(UsuarioRequest request) {
        Usuario usuario = new Usuario(request);
        usuarioRepository.save(usuario);
        return usuario;
    }

    public UsuarioResponse buscarPorId(Long id) {
        return new UsuarioResponse(usuarioRepository.findById(id).orElseThrow());
    }

    public List<UsuarioResponse> buscarTodos() {
        return usuarioRepository.findAll().stream().map(UsuarioResponse::new).toList();
    }
}
