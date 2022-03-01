package dev.izaias.contas.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.izaias.contas.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {
	
	@GetMapping
	public List<Cliente> listar() {
		
		List<Cliente> clientes = new ArrayList<>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Izaias");
		c1.setEndereco("Rua 12");
		c1.setNumeroDoc("123");
		
		Cliente c2 = new Cliente();
		c2.setNome("Natanael");
		c2.setEndereco("Rua 12");
		c2.setNumeroDoc("456");
		
		clientes.add(c1);
		clientes.add(c2);
		
		return clientes;
	}

}
