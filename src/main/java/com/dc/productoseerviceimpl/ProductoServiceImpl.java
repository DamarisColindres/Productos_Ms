package com.dc.productoseerviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.ProductoEntity;
import com.dc.productoservice.IProductoService;
import com.dc.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService  {
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public ProductoEntity guardarProducto(ProductoEntity producto) {
	   return productoRepository.save(producto);
	}

	@Override
	public List<ProductoEntity> listarProductos() {
		return productoRepository.findAll();
	}

	@Override
	public ProductoEntity obtenerProductoPorId(Long id) {
	    return productoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminarProducto(Long id) {
		productoRepository.deleteById(id);
	}
	
}
