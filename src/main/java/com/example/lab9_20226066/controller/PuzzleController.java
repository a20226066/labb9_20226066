package com.example.lab9_20226066.controller;


import com.example.lab9_20226066.Service.PuzzleService;

import java.util.Map;

@RequestMapping(" ")
public class PuzzleController {

    private final PuzzleService service;
    public PuzzleController(PuzzleService service){
        this.service=service;
    }

    GetMapping("/estado")
    public Map<String, Object> estado(){
        return service.obtenerEstado();
    }

}
