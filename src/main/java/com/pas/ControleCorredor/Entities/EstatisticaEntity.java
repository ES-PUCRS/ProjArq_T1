package com.pas.ControleCorredor.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Estatistica")
public class EstatisticaEntity {
    @Id
    private int id;

    @Column(name = "MEDIA")
    private double media;

    @Column(name = "MEDIANA")
    private double mediana;

    @Column(name = "DESVPADRAO")
    private double desvPadrao;

    @Column(name = "DISTANCIA")
    private double distancia;
}
