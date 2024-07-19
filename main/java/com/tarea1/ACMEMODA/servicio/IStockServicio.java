package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.Productos;
import com.tarea1.ACMEMODA.modelo.Stock;

public interface IStockServicio {
	
	public void insertarStock(Stock nuevoStock);
	public void actualizarProductos(Stock editarStock);
	public List<Stock> listarStock();
	public Productos buscarStockId(int idStock);
	public void eliminarStock (int idStock);

}
