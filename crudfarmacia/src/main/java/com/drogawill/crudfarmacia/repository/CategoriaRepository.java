package com.drogawill.crudfarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.drogawill.crudfarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
