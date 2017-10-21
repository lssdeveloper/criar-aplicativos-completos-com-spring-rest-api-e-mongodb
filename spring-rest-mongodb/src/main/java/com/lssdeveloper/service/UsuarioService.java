package com.lssdeveloper.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lssdeveloper.entity.Usuario;
import com.lssdeveloper.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> listaUsuario() {
 
        return usuarioRepository.findAll();
	}

	public Usuario salvarUsuario(Usuario usuarioAdd) {
		
		return usuarioRepository.save(usuarioAdd);
	}
	public void deletarUsuario(String id) {
		
		usuarioRepository.delete(id);		
	}
	public Usuario getById(String id) {
		
		return usuarioRepository.findOne(id);
	}

	public Page<Usuario> listaPaginada(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return usuarioRepository.findAll(pages);
	}

	public List<Usuario> buscarPorNome(String nome) {
		
		return usuarioRepository.findByNomeLikeIgnoreCase(nome);
	}
	
}
