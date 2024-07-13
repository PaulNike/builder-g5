package com.codigo.builder.controller;

import com.codigo.builder.model.Carro;
import com.codigo.builder.model.Libro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/patron/builder")
public class LibroController {

    @GetMapping("/librofull")
    public Libro obtenerLibro(){
        //Antes
        //Libro libro = new Libro();
        //libro.setAutor("sdsd");

        //ahora
        return new Libro.Builder()
                .titulo("Paco Yunque")
                .autor("Cesar Vallejo")
                .fechaPublicacion("1951")
                .editorial("Apuntes del Hombre")
                .isbn("xxxxx-xxxx-xxx-xxxx")
                .estado("PRESTADO")
                .build();
    }

    @GetMapping("/libronofull")
    public Libro obtenerLibro2(){
        return new Libro.Builder()
                .titulo("La Ultima Oportunidad")
                .estado("EN BIBLIOTECA")
                .build();
    }

    @GetMapping("/carrofull")
    public Carro obtenercarro(){
        return Carro.builder()
                .modelo("CX3")
                .marca("MAZDA")
                .anio(2024)
                .tipo("CVT")
                .build();
    }

}
