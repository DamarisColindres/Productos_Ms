package com.dc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.ProductoEntity;
import com.dc.productoservice.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	 @Autowired
	    private IProductoService productoService;
	    
	    @PostMapping
	    public ProductoEntity guardarProducto(@RequestBody ProductoEntity producto) { 
	    return productoService.guardarProducto(producto);
	    }

	    @GetMapping
	    public List<ProductoEntity> listarProductos() { 
	        return productoService.listarProductos();
	    }

	    @GetMapping("/{id}")
	    public ProductoEntity obtenerProductoPorId(@PathVariable Long id) {
	        return productoService.obtenerProductoPorId(id);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminarProducto(@PathVariable Long id) {
	        productoService.eliminarProducto(id);
	    }
	}
