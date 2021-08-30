package com.pas.ControleCorredor.Controllers;

import com.pas.ControleCorredor.Services.EventoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.pas.ControleCorredor.DTOs.EventoDTO;
import com.pas.ControleCorredor.Services.EstatisticaService;
import com.pas.ControleCorredor.Entities.*;

import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/eventos")
public class EventoController {

    @Resource
    private EventoService service;
    @Resource
    private EstatisticaService serviceEstatistica;

    @GetMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<EventoDTO>> consultaEventos() {
        return new ResponseEntity<>(service.findAll(), OK);
    }

    @PostMapping() // adiciona evento no único corredor
    @CrossOrigin(origins = "*")
    public ResponseEntity<Boolean> informaEvento(@RequestBody final EventoDTO eventoDTO) {
        EstatisticaEntity estatistica = serviceEstatistica.findById(Long.valueOf(eventoDTO.getDistancia()));
        if(estatistica==null){

            //ToDO: COMPLETE THIS SHIT
            estatistica = EstatisticaEntity.builder()
            .setMedia()
            .setMediana()
            .setDesvioPadrao()
            .setDistancia(Long.valueOf(eventoDTO.getDistancia()))
            .setQtdEventos(1);


            //todo calcular media mediana, desvio padrao
            
        }else{

        }
        return new ResponseEntity<>(service.save(eventoDTO), OK);
    }

}
