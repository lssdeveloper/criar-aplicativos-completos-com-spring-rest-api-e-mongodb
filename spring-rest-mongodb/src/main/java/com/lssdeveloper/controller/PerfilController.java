package com.lssdeveloper.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lssdeveloper.entity.Perfil;
import com.lssdeveloper.entity.Usuario;
import com.lssdeveloper.service.PerfilService;

@RestController
public class PerfilController {
	
	@Autowired
	PerfilService perfilService;
	
	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public List<Perfil> listar(){
		return perfilService.listaPerfil();
	}
	@RequestMapping(value = "/perfil", method = RequestMethod.POST)
	public Perfil salvarPerfil(@RequestBody Perfil perfil){
		return perfilService.salvarPerfil(perfil);
	}
	@RequestMapping(value = "/perfil", method = RequestMethod.PUT)
	public Perfil editarPerfil(@RequestBody Perfil perfil){
		return perfilService.salvarPerfil(perfil);
	}	
	@RequestMapping(value = "/perfil/{id}", method = RequestMethod.DELETE)
	public void deletarPerfil(@PathVariable String id){
		perfilService.deletarPerfil(id);
	}
    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.GET)
    public Perfil getBtId(@PathVariable String id) {
        return perfilService.getById(id);
    }
    @RequestMapping(value = "/perfil/{page}/{count}", method = RequestMethod.GET)
    public Page<Perfil> listaPaginada(@PathVariable int page, @PathVariable int count) {
        return perfilService.listaPaginada(page, count);
    }
    @RequestMapping(value = "/perfil/{nome}/nome", method = RequestMethod.GET)
    public List<Perfil> listaPaginada(@PathVariable String nome) {
        return perfilService.buscarPorNome(nome);
    }	
	
	

}
