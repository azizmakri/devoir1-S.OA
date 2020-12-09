package com.aziz.motos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aziz.motos.entities.Moto;
import com.aziz.motos.service.MotoService;

@SpringBootApplication
public class MotosApplication implements CommandLineRunner{

	@Autowired
	MotoService motoService; 
	
	public static void main(String[] args) {
		SpringApplication.run(MotosApplication.class, args);
	}//bbbb

	@Override
	public void run(String... args) throws Exception {
		
		motoService.saveMoto(new Moto("103",600.0,new Date()));
		motoService.saveMoto(new Moto("kawasaki Z1000", 10000.0, new Date()));
		motoService.saveMoto(new Moto("KTM DUKE", 5500.0, new Date()));
		
	}

}