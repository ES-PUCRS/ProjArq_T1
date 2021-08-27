package com.pas.ControleCorredor.Mappers;

import com.pas.ControleCorredor.DTOs.CorredorDTO;
import com.pas.ControleCorredor.Entities.CorredorEntity;
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
public class CorredorMapper {

    private final ModelMapper modelMapper;


    public CorredorEntity mapearDTO(CorredorDTO CorredorDTO) throws ParseException {
        return modelMapper.map(CorredorDTO, CorredorEntity.class);
    }


    public List<CorredorEntity> mapearDTO(List<CorredorDTO> source) {
        return source
                .stream()
                .map(entity -> modelMapper.map(entity, CorredorEntity.class))
                .collect(Collectors.toList());
    }


    public CorredorDTO mapear(CorredorEntity Corredor) {
        return modelMapper.map(Corredor, CorredorDTO.class);
    }
    public List<CorredorDTO> mapear(List<CorredorEntity> source) {
        return source
                .stream()
                .map(entity -> modelMapper.map(entity, CorredorDTO.class))
                .collect(Collectors.toList());
    }

    public CorredorDTO entityToDTO(CorredorEntity corredor) {
        return modelMapper.map(corredor, CorredorDTO.class);
    }

    public CorredorEntity dtoToEntity(CorredorDTO sampleDTO) {
        return modelMapper.map(sampleDTO, CorredorEntity.class);
    }
}
