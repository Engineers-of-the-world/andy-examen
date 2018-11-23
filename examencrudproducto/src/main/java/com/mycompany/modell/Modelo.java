package com.mycompany.modell;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modelo")
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_modelo")
	 int idmodelo;
	
	@Column(name = "name_modelo")
	String nameModelo;
	
	public Modelo() {
		super();

	}
	
	public long getIdmodelo() {
		return idmodelo;
	}

	public void setIdmodel(int idmodel) {
		this.idmodelo = idmodel;
	}

	public String getNameModelo() {
		return nameModelo;
	}

	public void setNameModelo(String nameModelo) {
		this.nameModelo = nameModelo;
	}

	public Modelo(int idmodelo, String nameModelo) {
		this.idmodelo = idmodelo;
		this.nameModelo = nameModelo;
	}


	
}
