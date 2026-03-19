package com.pagoda.pagoda_api.repository.catalogos;

import com.pagoda.pagoda_api.entity.catalogos.EstadoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoItemRepository extends JpaRepository<EstadoItem, Integer> {
}