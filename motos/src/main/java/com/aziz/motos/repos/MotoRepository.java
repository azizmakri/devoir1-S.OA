package com.aziz.motos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.motos.entities.Moto;

public interface MotoRepository extends JpaRepository<Moto, Long> {

}
