package com.playasmex.hackOcean.controllers;

import com.playasmex.hackOcean.models.EstadoModel;
import com.playasmex.hackOcean.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    @Autowired
    EstadoService estadoService;

    @GetMapping()
    public ArrayList<EstadoModel> getEstados(){
        return (ArrayList<EstadoModel>) estadoService.getEstados();
    }
}
