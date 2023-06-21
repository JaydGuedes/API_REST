package com.jayd.java.demoapi1.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayd.java.demoapi1.model.ContatosAdicionados;
import com.jayd.java.demoapi1.repository.ContatosAdicionadosRepository;

@RestController
@RequestMapping("/contatosAdicionados")
public class ContatosAdicionadosController {
	@Autowired
	private ContatosAdicionadosRepository ContatosAdicionadosRepository;

	@GetMapping
	public List<ContatosAdicionados> getAll() {
		return ContatosAdicionadosRepository.findAll();
	}

	@GetMapping(path = "/{contId}")
	public ContatosAdicionados getOne(@PathVariable Long id) {
		if (ContatosAdicionadosRepository.existsById(id)) {
			return ContatosAdicionadosRepository.findById(id).get();
		}
		return null;
	}
	@GetMapping(path = "/{contId}")
	public ContatosAdicionados getOne(@PathVariable String contUserId) {
		if (ContatosAdicionadosRepository.existsById(null)) {
			return ContatosAdicionadosRepository.findById(null).get();
		}
		return null;
	}

	@PostMapping
	public ContatosAdicionados post(@RequestBody ContatosAdicionados contatosAdicionados) {
		return ContatosAdicionadosRepository.save(contatosAdicionados);
	}

	@PatchMapping(path = "/{contId}")
	public ContatosAdicionados patch(@PathVariable Long id, @RequestBody ContatosAdicionados contatosAdicionados) {
		return null;
	}

}
