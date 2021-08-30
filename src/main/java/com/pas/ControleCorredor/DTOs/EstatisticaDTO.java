package com.pas.ControleCorredor.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstatisticaDTO {
    private int id;

    private double media;

    private double mediana;

    private double desvPadrao;

    private int distancia; 
}
