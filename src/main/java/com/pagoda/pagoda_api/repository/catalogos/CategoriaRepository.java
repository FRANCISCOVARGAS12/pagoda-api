package com.pagoda.pagoda_api.repository.catalogos;

import com.pagoda.pagoda_api.entity.catalogos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}