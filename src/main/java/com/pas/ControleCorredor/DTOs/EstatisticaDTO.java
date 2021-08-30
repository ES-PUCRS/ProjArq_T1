package com.pas.ControleCorredor.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstatisticaDTO {
    private double media;

    private double mediana;

    private double desvioPadrao;

    private double qtdEventos;

    private int distancia; 
}
