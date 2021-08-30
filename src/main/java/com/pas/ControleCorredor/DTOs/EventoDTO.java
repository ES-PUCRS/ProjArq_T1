package com.pas.ControleCorredor.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventoDTO {

    private int id;
    private String nome;

    // Data do evento
    private int dia;
    private int mes;
    private int ano;

    // Distancia percorrida
    private int distancia; // metros

    // Tempo que o corredor levou para percorrer a distancia
    private int horas;
    private int minutos;
    private int segundos;

    private int mediaTempo;

}
