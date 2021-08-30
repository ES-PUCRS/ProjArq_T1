package com.pas.ControleCorredor.Services;

import com.pas.ControleCorredor.DTOs.EstatisticaDTO;
import com.pas.ControleCorredor.Entities.EventoEntity;
import com.pas.ControleCorredor.Mappers.EventoMapper;
import com.pas.ControleCorredor.Repositories.EventoRepository;

import com.pas.ControleCorredor.DTOs.EventoDTO;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventoService {

    @Resource
    private EstatisticaService estatisticaService;

    private final EventoRepository repository;
    private final EventoMapper maptools;

    public List<EventoDTO> findAll() {
        List<EventoEntity> entity = repository.findAll();
        return maptools.mapearEntities(entity);
    }
    
    public EventoDTO findById(Long id) {
        EventoEntity source = repository.findById(id).orElse(null);
        return maptools.entityToDTO(source);
    }

    public boolean save(final EventoDTO eventoDTO) {
        EstatisticaDTO estatisticaDTO = estatisticaService.findById((long) eventoDTO.getDistancia());
        int tempo = (eventoDTO.getHoras() * 3600) + (eventoDTO.getMinutos() * 60) + eventoDTO.getSegundos();
        eventoDTO.setMediaTempo(tempo);

        if(estatisticaDTO == null) {
             estatisticaDTO = EstatisticaDTO.builder()
                .media(tempo)
                .mediana(tempo)
                .desvioPadrao(0)
                .distancia(eventoDTO.getDistancia())
                .qtdEventos(1)
                .build();
        } else {
            int qtde, qtdeQuery, mediana, media;

            media = (int) (estatisticaDTO.getMedia() * estatisticaDTO.getQtdEventos());
            media += (eventoDTO.getHoras() * 3600) + (eventoDTO.getMinutos() * 60) + eventoDTO.getSegundos();
            media = (int) (media / (estatisticaDTO.getQtdEventos() + 1));

            qtde = qtdeQuery = (int) estatisticaDTO.getQtdEventos() + 1;
            if(qtde%2 != 0) qtdeQuery += 1;

            mediana = repository.findByMediana(qtdeQuery).getMediaTempo();

            estatisticaDTO.setMediana(mediana);
            estatisticaDTO.setQtdEventos(qtde);
            estatisticaDTO.setDesvioPadrao(0);
            estatisticaDTO.setMedia(media);
        }

        try {
            EventoEntity evento = maptools.dtoToEntity(eventoDTO);
            estatisticaService.save(estatisticaDTO);
            repository.save(evento);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
