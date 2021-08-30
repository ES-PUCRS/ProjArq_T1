package com.pas.ControleCorredor.Services;

import com.pas.ControleCorredor.DTOs.PerformanceDTO;
import com.pas.ControleCorredor.Entities.EventoEntity;
import com.pas.ControleCorredor.Mappers.EventoMapper;
import com.pas.ControleCorredor.Repositories.EventoRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
