package com.tarea1.ACMEMODA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea1.ACMEMODA.modelo.Stock;

public interface IStockRepositorio  extends JpaRepository<Stock, Integer>{

}
