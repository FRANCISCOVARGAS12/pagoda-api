package com.pagoda.pagoda_api.repository.catalogos;

import com.pagoda.pagoda_api.entity.catalogos.MetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {
}