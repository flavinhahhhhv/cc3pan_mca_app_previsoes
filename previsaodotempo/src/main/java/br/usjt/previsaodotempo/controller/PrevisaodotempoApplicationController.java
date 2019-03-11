package br.usjt.previsaodotempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaodotempo.model.Previsao;
import br.usjt.previsaodotempo.repository.PrevisaodotempoApplicationRepository;
@Controller
public class PrevisaodotempoApplicationController {
	@Autowired
	private PrevisaodotempoApplicationRepository prevRepo;
	
	@GetMapping("/previsao")
	public ModelAndView listaPrevisao() {
		ModelAndView mv = new ModelAndView("view");
		List<Previsao> previsoes = prevRepo.findAll();
		mv.addObject("previsoes", previsoes);
		mv.addObject("previsao",new Previsao());
		return mv;
	}
	@PostMapping("/previsaoadd")
	public String salvar(Previsao previsao) {
		prevRepo.save(previsao);
		return "redirect:/previsao";
	}
}
