package com.pas.ControleCorredor.aplicacao.Services;

import com.pas.ControleCorredor.aplicacao.DTOs.CorredorDTO;
import com.pas.ControleCorredor.negocio.Entities.CorredorEntity;
import com.pas.ControleCorredor.aplicacao.Mappers.CorredorMapper;
import com.pas.ControleCorredor.negocio.Repositories.CorredorRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CorredorService {

    private final CorredorMapper maptools;
    private final CorredorRepository repository;

    public List<CorredorDTO> findAll() {
        List<CorredorEntity> entity = repository.findAll();
        return maptools.mapear(entity);
    }

    public CorredorDTO findById(Long id) {
        CorredorEntity source = repository.findById(id).orElse(null);
        return maptools.entityToDTO(source);
    }

    public boolean save(final CorredorDTO corredorDTO) {
        try {
            CorredorEntity corredor = maptools.dtoToEntity(corredorDTO);
            repository.save(corredor);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}

