package com.aziz.motos.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aziz.motos.entities.Moto;

public interface MotoService {
	Moto saveMoto(Moto m);
	Moto updateMoto(Moto m);
	void deleteMoto(Moto m);
	void deleteMotoById(Long id);
	Moto getMoto(Long id);
	List<Moto> getAllMotos();
	
	
	Page<Moto> getAllMotosParPage(int page, int size);

}
