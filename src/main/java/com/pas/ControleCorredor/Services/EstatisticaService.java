package com.pas.ControleCorredor.Services;
import com.pas.ControleCorredor.DTOs.EstatisticaDTO;
import com.pas.ControleCorredor.Entities.EstatisticaEntity;
import com.pas.ControleCorredor.Mappers.EstatisticaMapper;
import com.pas.ControleCorredor.Repositories.EstatisticaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstatisticaService {
    private final EstatisticaMapper maptools;
    private final EstatisticaRepository repository;

    public List<EstatisticaDTO> findAll() {
        List<EstatisticaEntity> entity = repository.findAll();
        return maptools.mapearEntities(entity);
    }

    public EstatisticaDTO findById(Long id) {
        EstatisticaEntity source = repository.findById(id).orElse(null);
        return maptools.entityToDTO(source);
    }

    public boolean save(final EstatisticaDTO estatisticaDTO) {
        try {
            EstatisticaEntity estatistica = maptools.dtoToEntity(estatisticaDTO);
            repository.save(estatistica);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
