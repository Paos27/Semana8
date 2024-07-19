package com.tarea1.ACMEMODA.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_stock")
public class Stock  implements Serializable{

	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idStock;
	private String nombre;
	private String cantidad;
	private String centro;
	@OneToMany (mappedBy = "fkStock")
	private List<Productos> listaProductos =new ArrayList<>();
}
