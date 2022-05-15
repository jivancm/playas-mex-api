package com.playasmex.hackOcean.services;

import com.playasmex.hackOcean.models.EstadoModel;
import com.playasmex.hackOcean.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    EstadoRepository estadoRepository;

    public ArrayList<EstadoModel> getEstados(){
        return (ArrayList<EstadoModel>) estadoRepository.findAll();
    }

    public Optional<EstadoModel> getEstado(Integer idEstado){
        return estadoRepository.findById(idEstado);
    }
}
