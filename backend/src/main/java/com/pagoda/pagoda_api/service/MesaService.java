package com.pagoda.pagoda_api.service;

import com.pagoda.pagoda_api.entity.operacion.Mesa;
import com.pagoda.pagoda_api.repository.operacion.MesaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MesaService {

    private final MesaRepository mesaRepository;

    public List<Mesa> obtenerTodas() {
        return mesaRepository.findAll();
    }

    public List<Mesa> obtenerLibres() {
        return mesaRepository.findByEstadoNombre("LIBRE");
    }

    public Mesa obtenerPorId(Integer id) {
        return mesaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mesa no encontrada"));
    }

    public Mesa guardar(Mesa mesa) {
        return mesaRepository.save(mesa);
    }
}