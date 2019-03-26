package br.usjt.previsaodotempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaodotempo.model.Previsao;
import br.usjt.previsaodotempo.service.PrevisaodotempoApplicationService;
@Controller
public class PrevisaodotempoApplicationController {
	/*@Autowired
	private PrevisaodotempoApplicationRepository prevRepo;*/
	@Autowired
	private PrevisaodotempoApplicationService previsaoService;
	
	@GetMapping("/previsao")
	public ModelAndView listaPrevisao() {
		ModelAndView mv = new ModelAndView("view");
		mv.addObject(new Previsao());
		List<Previsao> previsoes = previsaoService.listarTodos();
		mv.addObject("previsoes", previsoes);
		return mv;
	}
	@PostMapping("/previsaoadd")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsao";
	}
}
