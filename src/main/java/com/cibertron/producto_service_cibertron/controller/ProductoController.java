package com.cibertron.producto_service_cibertron.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertron.producto_service_cibertron.remote.ProveedorFeign;

@RestController
@RequestMapping("/api-rest/v1")
public class ProductoController {

    @Autowired
    private ProveedorFeign feign;

    @GetMapping("/productos")
    public List<String> listarProductos() {
        List<String> productos = new ArrayList<>();
        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");
        productos.add("Impresora");
        return productos;
    }

    @GetMapping("/categorias")
    public List<String> listarCategorias() {
        List<String> categorias = new ArrayList<>();
        categorias.add("Electrodomésticos");
        categorias.add("Hogar");
        categorias.add("Muebles");
        categorias.add("Tecnológico");
        categorias.add("Otros");
        categorias.add(feign.obtenerMensaje()); 
        return categorias;
    }
}