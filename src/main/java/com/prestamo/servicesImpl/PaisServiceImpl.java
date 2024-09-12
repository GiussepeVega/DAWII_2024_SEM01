package com.prestamo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Pais;
import com.prestamo.repository.PaisRepository;
import com.prestamo.services.PaisService;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisRepository repo;
	
	@Override
	public List<Pais> findAll() {
		return repo.findAll();
	}

}
