package com.tarea1.ACMEMODA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea1.ACMEMODA.modelo.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>{

}
