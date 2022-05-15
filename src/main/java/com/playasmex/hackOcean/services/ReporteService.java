package com.playasmex.hackOcean.services;

import com.playasmex.hackOcean.models.ReporteModel;
import com.playasmex.hackOcean.repositories.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReporteService {
    @Autowired
    ReporteRepository reporteRepository;

    public ArrayList<ReporteModel> getReportes(){
        return (ArrayList<ReporteModel>) reporteRepository.findAll();
    }

    public ReporteModel saveReporte(ReporteModel reporte){
        return reporteRepository.save(reporte);
    }
}
