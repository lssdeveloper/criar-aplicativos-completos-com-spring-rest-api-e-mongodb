package com.lssdeveloper.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lssdeveloper.entity.Usuario;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getTexto() {
		return "Endpoint inicial";	
	}	
//	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
//	public Usuario getTexto(@PathVariable String nome) {
//		Usuario usuario = new Usuario();
//		usuario.setNome(nome);
//		return	usuario;
//	}
}


