package com.pas.ControleCorredor.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceDTO {

    private double desvioPadrao;
    private double qtdEventos;
    private int distancia;

}
