package br.usjt.previsaodotempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaodotempo.model.Previsao;
import br.usjt.previsaodotempo.repository.PrevisaodotempoApplicationRepository;

@Service
public class PrevisaodotempoApplicationService {
	@Autowired
	private PrevisaodotempoApplicationRepository prevRepo;

	public void salvar(Previsao previsao) {
		prevRepo.save(previsao);
	}

	public List<Previsao> listarTodos() {
		return prevRepo.findAll();
	}
}
