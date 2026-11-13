package com.example.lab9_20226066.Service;

import com.example.lab9_20226066.repository.PuzzleRepository;

public class PuzzleService {

    private final PuzzleRepository repo;
    public PuzzleService(PuzzleRepository repo){
        this.repo=repo;
    }
}
