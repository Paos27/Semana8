package com.tarea1.ACMEMODA.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.ACMEMODA.modelo.Categoria;
import com.tarea1.ACMEMODA.repositorio.ICategoriaRepositorio;
import com.tarea1.ACMEMODA.servicio.ICategoriaServicio;

@Service
public class CategoriaServicioImpl implements ICategoriaServicio {
	@Autowired
	ICategoriaRepositorio categoriaRepo;
			
	
	@Override
	public void insertarCategoria(Categoria nuevoCategoria) {
		try {
			categoriaRepo.save(nuevoCategoria);
		} catch (Exception e) {
			System.out.println("Categoria Ingresado");
		}
	}
		
	

	@Override
	public void actualizarCategoria(Categoria editarCategoria) {
		try {
			
			categoriaRepo.save(editarCategoria);
			
		} catch (Exception e) {
			System.out.println("Error al actualizar");
		}
	}
	@Override
	public List<Categoria> listarCategoria() {
		try {
            return categoriaRepo.findAll();
        } 
	 catch (Exception e) 
	   {
            System.out.println("Error al listar categoria: " + e.getMessage());
        }

		return null;
	}
	@Override
	public void eliminarCategoria(int idCategoria) {
		try {
			Categoria categoria= categoriaRepo.findById(idCategoria).orElse(null);
			 if(categoria!=null) {
				 categoriaRepo.delete(categoria);
				System.out.println("cliente Eliminado");
			 }
			 else {
				 System.out.println("Cliente no existe");
				
			 }
		}catch (Exception e) {
			System.out.println("Error al eliminar: " +e.getMessage());
			
		}
		
		
	}
	
	@Override
	public Categoria buscarId(int idCategoria)
	{
		Categoria categoria =new Categoria();
		try {
			categoria= categoriaRepo.findById(idCategoria).get();
		} catch (Exception e) {
			System.out.println("Buscar id");
		}
		return categoria;
	
	}

}
