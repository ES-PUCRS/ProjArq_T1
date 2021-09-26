package com.pas.ControleCorredor.aplicacao.Services;
import com.pas.ControleCorredor.aplicacao.DTOs.EstatisticaDTO;
import com.pas.ControleCorredor.negocio.Entities.EstatisticaEntity;
import com.pas.ControleCorredor.aplicacao.Mappers.EstatisticaMapper;
import com.pas.ControleCorredor.negocio.Repositories.EstatisticaRepository;
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
