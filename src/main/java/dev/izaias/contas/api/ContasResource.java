package dev.izaias.contas.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contas")
public class ContasResource {

	@GetMapping
	public String listar() {
		return "Listar todas as contas";
	}
	
}
