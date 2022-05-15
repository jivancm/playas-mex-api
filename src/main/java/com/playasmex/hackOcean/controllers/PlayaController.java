package com.playasmex.hackOcean.controllers;

import com.playasmex.hackOcean.models.PlayaModel;
import com.playasmex.hackOcean.services.PlayaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/playas")
public class PlayaController {
    @Autowired
    PlayaService playaService;

    @GetMapping
    public ArrayList<PlayaModel> getPlayas(){
        return (ArrayList<PlayaModel>) playaService.getPlayas();
    }
}
