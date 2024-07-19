package com.tarea1.ACMEMODA.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "tb_categoria")
public class Categoria implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idCategoria;
	@Column(nullable = true)
	private String nombre;
	private String descripcion;
	@OneToMany (mappedBy = "fkCategoria")
	private List<Productos> listaProductos=new ArrayList<>();
}
	
