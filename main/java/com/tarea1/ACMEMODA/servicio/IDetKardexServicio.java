package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.DetKardex;


public interface IDetKardexServicio {

	public void insertar(DetKardex obj);
	public void actualizar(DetKardex obj);
	public List<DetKardex> listarTodos();
	public DetKardex buscarPorId(int id);
	public void eliminar (int id);
	
}
