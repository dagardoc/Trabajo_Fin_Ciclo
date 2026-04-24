package com.gimnasio.gimnasio_app.repositories;

import com.gimnasio.gimnasio_app.entity.Clase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Long> {
}