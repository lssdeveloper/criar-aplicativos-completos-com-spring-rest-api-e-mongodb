package com.lssdeveloper.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lssdeveloper.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
