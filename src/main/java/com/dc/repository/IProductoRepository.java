package com.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.ProductoEntity;

public interface IProductoRepository extends JpaRepository<ProductoEntity, Long>{

}
