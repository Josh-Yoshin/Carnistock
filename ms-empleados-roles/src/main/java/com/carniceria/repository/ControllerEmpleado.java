package com.carniceria.empleados.controller;
import com.carniceria.empleados.dto.EmpleadoDTO;
import com.carniceria.empleados.model.Empleado;
import com.carniceria.empleados.service.ServiceEmpleado;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empleados")
public class ControllerEmpleado {
    @Autowired
    private ServiceEmpleado serviceEmpleado;

    @PostMapping
    public ResponseEntity<Empleado> crear(@Valid @RequestBody EmpleadoDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceEmpleado.registrarEmpleado(dto));
    }
});
    }
}