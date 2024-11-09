package com.dc.productoservice;

import java.util.List;

import com.dc.entity.ProductoEntity;

public interface IProductoService {
	ProductoEntity guardarProducto(ProductoEntity producto);
    List<ProductoEntity> listarProductos();
    ProductoEntity obtenerProductoPorId(Long id);
    void eliminarProducto(Long id);
}
