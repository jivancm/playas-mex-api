package com.playasmex.hackOcean.controllers;

import com.playasmex.hackOcean.models.MunicipioModel;
import com.playasmex.hackOcean.services.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {
    @Autowired
    MunicipioService municipioService;

    @GetMapping
    public ArrayList<MunicipioModel> getMunicipios(){
        return (ArrayList<MunicipioModel>) municipioService.getMunicipios();
    }
}
