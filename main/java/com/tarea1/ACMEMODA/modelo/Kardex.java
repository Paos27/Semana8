package com.tarea1.ACMEMODA.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Data
@Entity
@Table  (name= "tb_kardex")
public class Kardex  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idKardex;
	private String  estado;
	@Temporal (TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date  fechaMov;
	private String usuario;
	
	@OneToMany (mappedBy = "kardex")
	private List <DetKardex> detKardex = new ArrayList<>();
	
	
	

}
