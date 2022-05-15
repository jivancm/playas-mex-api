package com.playasmex.hackOcean.services;

import com.playasmex.hackOcean.models.MunicipioModel;
import com.playasmex.hackOcean.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MunicipioService {
    @Autowired
    MunicipioRepository municipioRepository;

    public ArrayList<MunicipioModel> getMunicipios(){
        return (ArrayList<MunicipioModel>) municipioRepository.findAll();
    }
}
