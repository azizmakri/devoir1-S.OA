package com.aziz.motos;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.aziz.motos.entities.Moto;
import com.aziz.motos.repos.MotoRepository;
import com.aziz.motos.service.MotoService;


@SpringBootTest
class MotosApplicationTests {
	
	@Autowired
	private MotoService motoService;
	
	@Autowired
	private MotoRepository motoRepository;
		
	
	@Test
	public void testCreateMoto() {
	Moto motoo = new Moto("booster",20200.500,new Date());
	motoRepository.save(motoo);
	}
	
	
	
	@Test
	public void testFindMoto()
	{
	Moto m = motoRepository.findById(1L).get();
	System.out.println(m);
	}
	
	@Test
	public void testUpdateMoto()
	{ Moto m = motoRepository.findById(1L).get();
	m.setPrixMoto(1000.0);
	motoRepository.save(m);
	}
	
	@Test
	public void testDeleteMoto()
	{
		motoRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousMoto()
	{
	List<Moto> motoos = motoRepository.findAll();
	for (Moto m : motoos)
	{
	System.out.println(m);
	}
	}
	
	
	@Test
	public void testFindByMarqueMotoContains()
	{
	Page<Moto> motoos = motoService.getAllMotosParPage(0,2);
	System.out.println(motoos.getSize());
	System.out.println(motoos.getTotalElements()); System.out.println(motoos.getTotalPages());
	motoos.getContent().forEach(m -> {System.out.println(m.toString());
	});
	/*ou bien
	for (Moto m : motoos)
	{
	System.out.println(m);
	} */
	}
}
