package com.pas.ControleCorredor.Mappers;

import com.pas.ControleCorredor.DTOs.EventoDTO;
import com.pas.ControleCorredor.Entities.EventoEntity;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@Mapper(componentModel = "spring")
public class EventoMapper {

    private final ModelMapper modelMapper;


    public EventoEntity mapearDTO(EventoDTO EventoDTO) throws ParseException {
        return modelMapper.map(EventoDTO, EventoEntity.class);
    }


    public List<EventoEntity> mapearDTOs(List<EventoDTO> source) {
        return source
                .stream()
                .map(entity -> modelMapper.map(entity, EventoEntity.class))
                .collect(Collectors.toList());
    }

    public List<EventoDTO> mapearEntities(List<EventoEntity> source) {
        return source
                .stream()
                .map(entity -> modelMapper.map(source, EventoDTO.class))
                .collect(Collectors.toList());
    }

    public EventoDTO entityToDTO(EventoEntity corredor) {
        return modelMapper.map(corredor, EventoDTO.class);
    }

    public EventoEntity dtoToEntity(EventoDTO sampleDTO) {
        return modelMapper.map(sampleDTO, EventoEntity.class);
    }
}
