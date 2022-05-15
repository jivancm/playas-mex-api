package com.playasmex.hackOcean.controllers;

import com.playasmex.hackOcean.models.ReporteModel;
import com.playasmex.hackOcean.services.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reportes")
public class ReporteController {
    @Autowired
    ReporteService reporteService;

    @GetMapping
    public ArrayList<ReporteModel> getReportes(){
        return (ArrayList<ReporteModel>) reporteService.getReportes();
    }

    @PostMapping
    public ReporteModel saveReporte(@RequestBody ReporteModel reporte){
        return reporteService.saveReporte(reporte);
    }
}
