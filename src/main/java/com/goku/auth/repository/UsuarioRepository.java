package com.goku.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.goku.auth.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
