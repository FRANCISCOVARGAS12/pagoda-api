package com.pagoda.pagoda_api.service;

import com.pagoda.pagoda_api.entity.operacion.Producto;
import com.pagoda.pagoda_api.repository.operacion.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> obtenerTodos() {
        return productoRepository.findByActivoTrue();
    }

    public List<Producto> obtenerPorCategoria(Integer categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public void eliminar(Integer id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setActivo(false);
        productoRepository.save(producto);
    }
}