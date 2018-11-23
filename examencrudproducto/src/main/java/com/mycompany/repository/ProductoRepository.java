package com.mycompany.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.modell.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	Producto findById(long id);
	//Empresa findByRazon_social();
	
    Optional<Producto> findByNameProducto(String nameProducto);
    //Users findByName(String name);
}
