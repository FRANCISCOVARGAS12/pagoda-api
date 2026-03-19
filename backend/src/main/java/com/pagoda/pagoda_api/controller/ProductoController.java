package com.pagoda.pagoda_api.controller;

import com.pagoda.pagoda_api.entity.operacion.Producto;
import com.pagoda.pagoda_api.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> obtenerTodos() {
        return ResponseEntity.ok(productoService.obtenerTodos());
    }

    @GetMapping("/categoria/{categoriaId}")
    public ResponseEntity<List<Producto>> obtenerPorCategoria(@PathVariable Integer categoriaId) {
        return ResponseEntity.ok(productoService.obtenerPorCategoria(categoriaId));
    }

    @PostMapping
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.guardar(producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        productoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}