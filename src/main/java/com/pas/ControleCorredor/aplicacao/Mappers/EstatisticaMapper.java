package com.pas.ControleCorredor.aplicacao.Mappers;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

import com.pas.ControleCorredor.aplicacao.DTOs.EstatisticaDTO;
import com.pas.ControleCorredor.negocio.Entities.EstatisticaEntity;

import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
@Mapper(componentModel = "spring")
public class EstatisticaMapper {
    private final ModelMapper modelMapper;

    public EstatisticaEntity mapearDTO(EstatisticaDTO EventoDTO) throws ParseException {
        return modelMapper.map(EventoDTO, EstatisticaEntity.class);
    }

    public List<EstatisticaEntity> mapearDTOs(List<EstatisticaDTO> source) {
        return source.stream().map(entity -> modelMapper.map(entity, EstatisticaEntity.class)).collect(Collectors.toList());
    }

    public List<EstatisticaDTO> mapearEntities(List<EstatisticaEntity> source) {
        return source.stream().map(entity -> modelMapper.map(entity, EstatisticaDTO.class)).collect(Collectors.toList());
    }

    public EstatisticaDTO entityToDTO(EstatisticaEntity corredor) {
        return modelMapper.map(corredor, EstatisticaDTO.class);
    }

    public EstatisticaEntity dtoToEntity(EstatisticaDTO sampleDTO) {
        return modelMapper.map(sampleDTO, EstatisticaEntity.class);
    }
}
