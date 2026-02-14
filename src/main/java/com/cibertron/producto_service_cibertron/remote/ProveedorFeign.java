package com.cibertron.producto_service_cibertron.remote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="proveedor-service-cibertron")
public interface ProveedorFeign {

    @GetMapping("/api-rest/v1/proveedores-mensaje")
    String obtenerMensaje();
	
}
