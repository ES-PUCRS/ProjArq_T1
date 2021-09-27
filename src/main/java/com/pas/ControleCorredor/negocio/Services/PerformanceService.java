package com.pas.ControleCorredor.negocio.Services;

import com.pas.ControleCorredor.aplicacao.DTOs.PerformanceDTO;
import com.pas.ControleCorredor.negocio.Entities.EventoEntity;
import com.pas.ControleCorredor.negocio.Repositories.EventoRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PerformanceService {

    private final EventoRepository repository;

    public List<PerformanceDTO> findPerformance(int distancia, int ano) {
        List<EventoEntity> eventos = repository.findByYearAndDistance(ano, distancia);

        List<PerformanceDTO> performances = new ArrayList<>();
        for (EventoEntity evento : eventos) {
            PerformanceDTO perf = PerformanceDTO.builder()
                    .distancia(evento.getDistancia())
                    .ano(evento.getAno())

                    .horas(evento.getHoras())
                    .minutos(evento.getMinutos())
                    .segundos(evento.getSegundos())
                    .build();
            performances.add(perf);
        }
        return performances;
    }

}
