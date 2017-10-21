package com.lssdeveloper.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lssdeveloper.entity.Profissao;

@Service
public class ProfissaoServie {
	
	public List<Profissao> listaProfissao(){
		
		List<Profissao> lstProfissao = new ArrayList<>();
		
		Profissao profissao = new Profissao();
		profissao.setCodigo(1L);
		profissao.setDescricao("Analista Desenvolvedor");
		
		lstProfissao.add(profissao);
		
		profissao = new Profissao();
		profissao.setCodigo(2L);
		profissao.setDescricao("Gerente de Projetos");
		
		lstProfissao.add(profissao);
		
		return lstProfissao;
	}
	public List<Profissao> listaProfissao(Profissao profissaoAdd){
		
		List<Profissao> lstProfissao = this.listaProfissao();
		
		lstProfissao.add(profissaoAdd);
		return lstProfissao;
	}

}
