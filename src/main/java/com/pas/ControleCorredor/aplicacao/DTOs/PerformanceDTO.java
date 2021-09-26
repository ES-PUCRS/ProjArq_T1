package com.pas.ControleCorredor.aplicacao.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceDTO {

    private int distancia;
    private int ano;
    // Tempo que o corredor levou para percorrer a distancia
    private int horas;
    private int minutos;
    private int segundos;

}
