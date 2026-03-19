package com.pagoda.pagoda_api.controller;

import com.pagoda.pagoda_api.entity.operacion.Mesa;
import com.pagoda.pagoda_api.service.MesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mesas")
@RequiredArgsConstructor
public class MesaController {

    private final MesaService mesaService;

    @GetMapping
    public ResponseEntity<List<Mesa>> obtenerTodas() {
        return ResponseEntity.ok(mesaService.obtenerTodas());
    }

    @GetMapping("/libres")
    public ResponseEntity<List<Mesa>> obtenerLibres() {
        return ResponseEntity.ok(mesaService.obtenerLibres());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mesa> obtenerPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(mesaService.obtenerPorId(id));
    }
}