package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.Kardex;


public interface IKardexServicio {

	
	public void insertar(Kardex obj);
	public void actualizar(Kardex obj);
	public List<Kardex> listarTodos();
	public Kardex buscarPorId(int id);
	public void eliminar (int id);
	
}
