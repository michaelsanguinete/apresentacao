package com.example.apresentacao.controller;

import com.example.apresentacao.dto.UsuarioRequest;
import com.example.apresentacao.dto.UsuarioResponse;
import com.example.apresentacao.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/salvar")
    public void salvar(@RequestBody UsuarioRequest request) {
        usuarioService.salvar(request);
    }

    @GetMapping("/buscarPorId/{id}")
    public UsuarioResponse buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    @GetMapping("/buscarTodos")
    public List<UsuarioResponse> buscarTodos() {
        return usuarioService.buscarTodos();
    }
}
