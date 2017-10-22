package com.lssdeveloper.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lssdeveloper.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    List<Usuario> findByNomeLikeIgnoreCase(String nome);
    
    Usuario findByEmail(String email);


}
