package com.pagoda.pagoda_api.repository.catalogos;

import com.pagoda.pagoda_api.entity.catalogos.TipoCobro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCobroRepository extends JpaRepository<TipoCobro, Integer> {
}