package com.pas.ControleCorredor.adaptadores.Controllers;

import com.pas.ControleCorredor.negocio.Services.EventoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.pas.ControleCorredor.aplicacao.DTOs.EventoDTO;

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

    @GetMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<EventoDTO>> consultaEventos() {
        return new ResponseEntity<>(service.findAll(), OK);
    }

    @PostMapping() // adiciona evento no único corredor
    @CrossOrigin(origins = "*")
    public ResponseEntity<Boolean> informaEvento(@RequestBody final EventoDTO eventoDTO) {
        return new ResponseEntity<>(service.save(eventoDTO), OK);
    }

}
