package com.codigo.builder.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class Carro {
    private String modelo;
    private Integer anio;
    private String marca;
    private String tipo;


}
