package com.switchmarket.Repositories;


import com.switchmarket.Entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends CrudRepository <Usuario, Integer>{


}
