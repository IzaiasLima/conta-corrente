package dev.izaias.contas.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ClienteHtml {

	@GetMapping
	@ResponseBody
	public String home() {
		return "<h1>Home</h1>";
		
	}
	
}
