package com.pas.ControleCorredor.adaptadores.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.pas.ControleCorredor.negocio.Services.CorredorService;
import com.pas.ControleCorredor.aplicacao.DTOs.CorredorDTO;
import org.springframework.http.ResponseEntity;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/corredor")
public class CorredorController {

    @Resource
    private CorredorService service;

    @GetMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<CorredorDTO>> consultaCorredor() {
        return new ResponseEntity<>(service.findAll(), OK);
    }

    @PostMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<Boolean> cadastraCorredor(@RequestBody final CorredorDTO corredorDTO) {
        return new ResponseEntity<>(service.save(corredorDTO), OK);
    }

}
