package com.lssdeveloper.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lssdeveloper.entity.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String>{

	List<Perfil> findByNomeLikeIgnoreCase(String nome);

}
