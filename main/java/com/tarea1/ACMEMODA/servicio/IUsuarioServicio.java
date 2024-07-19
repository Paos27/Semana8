package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.Usuario;


public interface IUsuarioServicio {

	public void insertarUsuario(Usuario nuevoUsuario);
	public void actualizarUsuario(Usuario editarUsuario);
	public List<Usuario> listaUsuario();
	public Usuario buscarUsuarioId(int idUsuario);
	public void eliminarUsuario (int idUsuario);
}
