package com.pas.ControleCorredor.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "EVENTOS")
public class EventoEntity {

    @Id
    private int id;

    @Column(name = "nome")
    private String nome;

    // Data do evento
    @Column(name = "dia")
    private int dia;

    @Column(name = "mes")
    private int mes;

    @Column(name = "ano")
    private int ano;

    // Distancia percorrida
    @Column(name = "distancia")
    private int distancia; // metros

    // Tempo que o corredor levou para percorrer a distancia
    @Column(name = "horas")
    private int horas;
    @Column(name = "minutos")
    private int minutos;
    @Column(name = "segundos")
    private int segundos;

    @Column(name = "MEDIA_TEMPO")
    private int mediaTempo;

    @Override
    public String toString() {
        return "Evento [ano=" + ano + ", dia=" + dia + ", distancia=" + distancia + ", horas=" + horas + ", id=" + id
                + ", mes=" + mes + ", minutos=" + minutos + ", nome=" + nome + ", segundos=" + segundos + "]";
    }
}