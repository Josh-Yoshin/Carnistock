package com.carniceria.productos.Controller;
import com.carniceria.productos.dto.ProductoDTO;
import com.carniceria.productos.model.Producto;
import com.carniceria.productos.service.ServiceCompra;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ServiceCompra serviceProducto;

    @PostMapping
    public ResponseEntity<ControllerCompra> crear(@Valid @RequestBody CompraDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceProducto.guardarProducto(dto));
    }
}