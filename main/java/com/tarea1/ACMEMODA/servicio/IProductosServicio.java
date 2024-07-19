package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.Productos;



public interface IProductosServicio {
	
	public void insertarProductos(Productos nuevoProductos);
	public void actualizarProductos(Productos editarProductos);
	public List<Productos> listarProductos();
	public Productos buscarProductoId(int idProducto);
	public void eliminarProducto (int idProducto);
	
}
