package br.usjt.previsaodotempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.previsaodotempo.model.DiaSemana;
import br.usjt.previsaodotempo.repository.DiaSemanaRepository;

public class DiaSemanaService {
	@Autowired
	private DiaSemanaRepository repo;
	
	public void salvar(DiaSemana dia) {
		repo.save(dia);
	}
	
	public List<DiaSemana> listarDias() {
		return repo.findAll();
	}
	
	public void excluir(DiaSemana dia) {
		repo.delete(dia);
	}

}
