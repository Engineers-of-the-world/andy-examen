package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.modell.Producto;

public interface ProductoService {
	
	Producto findById(long id);
	
	Optional<Producto> findByNameProducto(String name_producto);
	
	void savePro(Producto pro);
	
	void updatePro(Producto pro);
	
	void deleteProById(long id);
	
	List<Producto> findAllPros();
	void deleteAllPros();
	
	public boolean isProExist(Producto pro);

}