package com.jayd.java.demoapi1.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/{uId}")
	public List<ContatosAdicionados> getAll(@PathVariable Long uId){
		return ContatosAdicionadosRepository.listaCont(uId);
		}
	@GetMapping("/{uId1}/{uId2}")
	public Long get(@PathVariable Long uId1, @PathVariable Long uId2){
		return ContatosAdicionadosRepository.existId(uId1,uId2);
		}
	
	@PostMapping
	public ContatosAdicionados post(@RequestBody ContatosAdicionados contatosAdicionados) {
		return ContatosAdicionadosRepository.save(contatosAdicionados);
	}
	@PostMapping("/{uId1}/{uId2}")
	public Long post(@PathVariable Long uId1, @PathVariable Long uId2) {
		return ContatosAdicionadosRepository.addCont(uId1,uId2);
	}
}
