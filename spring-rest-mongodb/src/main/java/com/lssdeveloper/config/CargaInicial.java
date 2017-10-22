package com.lssdeveloper.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.lssdeveloper.entity.Perfil;
import com.lssdeveloper.entity.Usuario;
import com.lssdeveloper.repository.PerfilRepository;
import com.lssdeveloper.repository.UsuarioRepository;


@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PerfilRepository perfilRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {

        List<Perfil> perfis = perfilRepository.findAll();

        if (perfis.isEmpty()) {
            perfilRepository.save(new Perfil("ROLE_ADMIN"));
            perfilRepository.save(new Perfil("ROLE_SUPERVISOR"));
            perfilRepository.save(new Perfil("ROLE_ANALISTA"));
            perfilRepository.save(new Perfil("ROLE_COLABORADOR"));

            Perfil perfil = perfilRepository.findByNome("ROLE_ADMIN");

            List<Perfil> novosPerfis = new ArrayList<>();

            novosPerfis.add(perfil);
            
            perfil = perfilRepository.findByNome("ROLE_ANALISTA");
            
            novosPerfis.add(perfil);

            usuarioRepository.save(new Usuario("ADMIN", "admin", "123456", novosPerfis));
            /*NOVO USUÁRIO SEM ROLE_ADMIN*/
            novosPerfis = new ArrayList<>();
            
            perfil = perfilRepository.findByNome("ROLE_SUPERVISOR");
            novosPerfis.add(perfil);
            perfil = perfilRepository.findByNome("ROLE_ANALISTA");
            novosPerfis.add(perfil);
            perfil = perfilRepository.findByNome("ROLE_COLABORADOR");
            novosPerfis.add(perfil);
            
            usuarioRepository.save(new Usuario("lssdeveloper", "lssdeveloper@gmail.com", "123456", novosPerfis));     
                      
            
        }

    }

}