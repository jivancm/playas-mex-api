package com.playasmex.hackOcean.controllers;

import com.playasmex.hackOcean.models.ClasificacionModel;
import com.playasmex.hackOcean.services.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/clasificacion")
public class ClasificacionController {
    @Autowired
    ClasificacionService clasificacionService;

    @GetMapping()
    public ArrayList<ClasificacionModel> getClasificacion(){
        return clasificacionService.getClasificacion();
    }

    @PostMapping()
    public ClasificacionModel guardarClasificacion(ClasificacionModel clasificacion){
        return clasificacionService.guardarClasificacion(clasificacion);
    }
}
