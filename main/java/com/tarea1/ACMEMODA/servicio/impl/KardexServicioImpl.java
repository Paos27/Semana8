package com.tarea1.ACMEMODA.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.ACMEMODA.modelo.Kardex;
import com.tarea1.ACMEMODA.repositorio.IKardexRepositorio;
import com.tarea1.ACMEMODA.servicio.IKardexServicio;



@Service
public class KardexServicioImpl  implements IKardexServicio{

	@Autowired
	IKardexRepositorio repositorioKardex;
	
	
	@Override
	public void insertar(Kardex obj) {
		try {
			repositorioKardex.save(obj);
			
		}catch (Exception e) {
			System.out.println("No se guardo producto");
		}
		
	}

	@Override
	public void actualizar(Kardex obj) {
		try {
			repositorioKardex.save(obj);
		} catch (Exception e) {
			System.out.println("Error al actualizar");
		}
		
	}

	@Override
	public List<Kardex> listarTodos() {
		try {
			return repositorioKardex.findAll();
		} catch (Exception e) {
			System.out.println("Error en mostrar producto");
		}
		return null;
		
	}

	@Override
	public Kardex buscarPorId(int id) {
		try {
			return repositorioKardex.findById(id).get();
		} catch (Exception e) {
			System.out.println("Error en busqueda");
		}
		return null;
	}

	@Override
	public void eliminar(int id) {
		try {
			repositorioKardex.deleteById(id);
		} catch (Exception e) {
			System.out.println("Error al eliminar");
		}
		
	}

	
	
}
