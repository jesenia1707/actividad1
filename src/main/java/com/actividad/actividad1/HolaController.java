package com.actividad.actividad1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

import com.actividad.actividad1.dto.DtoHola;

@RestController
@RequestMapping("/api")

public class HolaController {

     @GetMapping("/hola")
     @PreAuthorize("hasRole('Prueba.Read')")
    public DtoHola sayHello() {
        return new DtoHola("Holaaaaaa!");

    }
}


//