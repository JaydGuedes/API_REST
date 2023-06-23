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

import com.jayd.java.demoapi1.model.Mensagens;
import com.jayd.java.demoapi1.repository.MensagensRepository;

@RestController
@RequestMapping("/mensagens")
public class MensagensController {
	
	@Autowired
	private MensagensRepository mensagensRepository;
	
	@GetMapping("/{uId1}/{uId2}")
	public List<Mensagens> getAll(@PathVariable Long uId1, @PathVariable Long uId2){
		return mensagensRepository.conversa(uId1, uId2);
	}
	
	@GetMapping(path = "/{mensId}")
	public Mensagens getOne(@PathVariable Long id) {
		if(mensagensRepository.existsById(id)) {
			return mensagensRepository.findById(id).get();
		}
		return null;
	}
	
	@PostMapping
	public Mensagens post(@RequestBody Mensagens mensagem) {
		return mensagensRepository.save(mensagem);
	}
		
	@PatchMapping(path = "/{mensId}")
	public Mensagens patch(@PathVariable Long id, @RequestBody Mensagens mensagem) {
		return null;
	}
}
