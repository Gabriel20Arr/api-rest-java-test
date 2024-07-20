package com.apirest.crud.proyectojava02.Repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.crud.proyectojava02.Entities.Producto;

// Utilizamos Jpa para traer la identiti e id (Long)
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
