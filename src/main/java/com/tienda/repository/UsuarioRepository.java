package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;

import com.tienda.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

}
