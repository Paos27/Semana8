package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.Categoria;

public interface ICategoriaServicio {

	public void insertarCategoria(Categoria nuevoCategoria);
	public void actualizarCategoria(Categoria editarCategoria);
	public List<Categoria> listarCategoria();
	public void eliminarCategoria(int idCategoria);
	public Categoria buscarId(int idCategoria);
}
