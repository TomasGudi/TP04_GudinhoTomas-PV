package ar.edu.unju.fi.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class indexController {

	@GetMapping({"/index","/home"})
	public String getIndex() {
		return "index";
	} 
	
}

