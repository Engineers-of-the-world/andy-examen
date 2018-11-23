package com.mycompany.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mycompany.modell.Producto;
import com.mycompany.service.ProductoService;

@RestController
@RequestMapping(value="/api/pro")


public class Productoctrl {
	
	@Autowired
	
	ProductoService proService;
	
	@GetMapping(value="/all")
 protected List<Producto> allpro(){
	 return proService.findAllPros();
 } 
	@PostMapping("/ifexist")
 protected boolean isExistPro(@RequestBody Producto pro){
	 return proService.isProExist(pro);
 }

	@PostMapping(value="/save")
 protected void save(@RequestBody Producto pro){	
		if(proService.isProExist(pro)) {
			proService.updatePro(pro);
			System.out.println("El producto ha sido actualizado");
			
		}else {
			proService.savePro(pro);
			System.out.println("El producto ha sido creado");
		}
		proService.savePro(pro);
 }
	@GetMapping(value="/update")
 protected String update(){
	 return "Welcome a spring boot";
 }	
	@GetMapping(value="/delete")
 protected String delete(){
	 return "Welcome a spring boot";
 }	
}


