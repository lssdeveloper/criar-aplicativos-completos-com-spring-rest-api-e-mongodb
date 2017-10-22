package com.lssdeveloper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lssdeveloper.entity.Perfil;
import com.lssdeveloper.entity.Usuario;
import com.lssdeveloper.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;
	
	public List<Perfil> listaPerfil(){
		return perfilRepository.findAll();
	}
	
	public Page<Perfil> listaPaginada(int page, int count){
		Pageable pages = new PageRequest(page, count);
		return perfilRepository.findAll(pages);
	}

	public Perfil salvarPerfil(Perfil perfil) {
		
		return perfilRepository.save(perfil);
	}

	public void deletarPerfil(String id) {
		
		perfilRepository.delete(id);
	}

	public Perfil getById(String id) {
		
		return perfilRepository.findOne(id);
	}

	public List<Perfil> buscarPorNome(String nome) {
		
		return perfilRepository.findByNomeLikeIgnoreCase(nome);
	}
	
 
}
