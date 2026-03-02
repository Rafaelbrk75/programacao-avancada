package com.example.crud.repository;

import com.example.crud.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
