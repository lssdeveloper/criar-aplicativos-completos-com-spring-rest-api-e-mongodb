package com.lssdeveloper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lssdeveloper.entity.Profissao;
import com.lssdeveloper.service.ProfissaoServie;

@RestController
public class ProfissaoController {
	
	@Autowired
	ProfissaoServie profissaoService;
	
	@RequestMapping(value = "/profissao", method = RequestMethod.GET)
	public List<Profissao> listaProfissao(){
		return this.profissaoService.listaProfissao();
	}
	@RequestMapping(value = "/profissao", method = RequestMethod.POST)
	public List<Profissao> listaProfissao(@RequestBody Profissao profissao){
		return this.profissaoService.listaProfissao(profissao);
	}

}
