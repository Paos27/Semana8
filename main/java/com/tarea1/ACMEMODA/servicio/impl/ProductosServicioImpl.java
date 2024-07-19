package com.tarea1.ACMEMODA.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.ACMEMODA.modelo.Productos;
import com.tarea1.ACMEMODA.repositorio.IProductosRepositorio;
import com.tarea1.ACMEMODA.servicio.IProductosServicio;


@Service
public class ProductosServicioImpl implements IProductosServicio {
	@Autowired
	IProductosRepositorio productoRepositorio;
	@Override
	public void insertarProductos(Productos nuevoProductos) {
		try {
			productoRepositorio.save(nuevoProductos);
			
		}catch (Exception e) {
			System.out.println("No se guardo producto");
		}
		
	}

	@Override
	public void actualizarProductos(Productos editarProductos) {
		try {
			productoRepositorio.save(editarProductos);
		} catch (Exception e) {
			System.out.println("Error al actualizar");
		}
		
	}

	@Override
	public List<Productos> listarProductos() {
		try {
			return productoRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error en mostrar producto");
		}
		return null;
	}

	@Override
	public Productos buscarProductoId(int idProducto) {
		try {
			return productoRepositorio.findById(idProducto).get();
		} catch (Exception e) {
			System.out.println("Error en busqueda");
		}
		return null;
	}

	@Override
	public void eliminarProducto(int idProducto) {
		try {
			productoRepositorio.deleteById(idProducto);
		} catch (Exception e) {
			System.out.println("Error al eliminar");
		}
		
	}

}
