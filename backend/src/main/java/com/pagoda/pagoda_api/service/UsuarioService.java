package com.pagoda.pagoda_api.service;

import com.pagoda.pagoda_api.entity.operacion.Usuario;
import com.pagoda.pagoda_api.repository.operacion.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerPorId(Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}