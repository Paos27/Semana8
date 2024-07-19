package com.tarea1.ACMEMODA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea1.ACMEMODA.modelo.Productos;

public interface IProductosRepositorio extends JpaRepository<Productos, Integer> {

}
