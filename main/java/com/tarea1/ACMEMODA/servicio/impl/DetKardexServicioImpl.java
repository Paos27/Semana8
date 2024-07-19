package com.tarea1.ACMEMODA.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.ACMEMODA.modelo.DetKardex;
import com.tarea1.ACMEMODA.repositorio.IDetKardexRepositorio;
import com.tarea1.ACMEMODA.servicio.IDetKardexServicio;


@Service
public class DetKardexServicioImpl implements IDetKardexServicio {

	@Autowired
	IDetKardexRepositorio repositorio;

	@Override
	public void insertar(DetKardex obj) {
		try {
			repositorio.save(obj);
			
		}catch (Exception e) {
			System.out.println("No se guardo producto");
		}
		
	}

	@Override
	public void actualizar(DetKardex obj) {
		try {
			repositorio.save(obj);
		} catch (Exception e) {
			System.out.println("Error al actualizar");
		}
		
	}

	@Override
	public List<DetKardex> listarTodos() {
		try {
			return repositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error en mostrar producto");
		}
		return null;
	}

	@Override
	public DetKardex buscarPorId(int id) {
		try {
			return repositorio.findById(id).get();
		} catch (Exception e) {
			System.out.println("Error en busqueda");
		}
		return null;
	}

	@Override
	public void eliminar(int id) {
		try {
			repositorio.deleteById(id);
		} catch (Exception e) {
			System.out.println("Error al eliminar");
		}
		
	}
	
	
	
}
