package com.tarea1.ACMEMODA.modelo;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table  (name= "tb_det_kardex")

public class DetKardex implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetKardex;
	private String tipoMovimiento;
	private String cantidad;
	private String  estado;
	
	@ManyToOne 
	@JoinColumn (name ="fk_idKardex")
	private Kardex kardex;
	
	@ManyToOne
	@JoinColumn (name="fk_idProducto")
	private Productos productos;

	
	
	
	
	
}
