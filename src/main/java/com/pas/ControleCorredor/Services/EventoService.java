package com.pas.ControleCorredor.Services;

import com.pas.ControleCorredor.Entities.EventoEntity;
import com.pas.ControleCorredor.Mappers.EventoMapper;
import com.pas.ControleCorredor.Repositories.EventoRepository;

import com.pas.ControleCorredor.DTOs.EventoDTO;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventoService {

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
        try {
            EventoEntity evento = maptools.dtoToEntity(eventoDTO);
            repository.save(evento);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
