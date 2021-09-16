package com.whnm.service.impl;

import java.util.List;

import com.whnm.model.Persona;
import com.whnm.service.PersonaService;

public class PersonaServiceImpl implements PersonaService {

	@Override
	public void crear() {
		System.out.println("Persona creada");
	}

	@Override
	public List<Persona> listar() {
		return null;
	}

}
