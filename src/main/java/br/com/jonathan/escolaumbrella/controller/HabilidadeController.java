package br.com.jonathan.escolaumbrella.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.jonathan.escolaumbrella.model.Aluno;
import br.com.jonathan.escolaumbrella.model.Habilidade;
import br.com.jonathan.escolaumbrella.repository.AlunoRepository;

@Controller
public class HabilidadeController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/habilidade/cadastrar/{id}")
	public String cadastrar(@PathVariable String id, Model model) {
		
		Aluno aluno = repository.findById(id).get();
		model.addAttribute("aluno", aluno);
		model.addAttribute("habilidade",new Habilidade());
		return "habilidade/cadastrar";
	}
}
