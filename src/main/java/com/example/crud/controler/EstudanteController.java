package com.example.crud.controler;

import com.example.crud.model.EstudanteModel;
import com.example.crud.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping("/criar")
    public EstudanteModel criarAluno(@RequestBody EstudanteModel estudanteModel){
        return estudanteService.criarAluno(estudanteModel);
    }

    @GetMapping("/listar")
    public List<EstudanteModel> listarEstudantes(){
        return estudanteService.listarEstudantes();
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarId(Long id){
        return estudanteService.buscarId(id);
    }
    
    @DeleteMapping("/{id}")
    public void deletarEstudante(Long id){
        estudanteService.deletarEstudante(id);
    }
}
