package com.pagoda.pagoda_api.service;

import com.pagoda.pagoda_api.entity.catalogos.Categoria;
import com.pagoda.pagoda_api.repository.catalogos.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }
}