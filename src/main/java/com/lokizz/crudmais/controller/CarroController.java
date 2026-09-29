package com.lokizz.crudmais.controller;

import com.lokizz.crudmais.entity.Carro;
import com.lokizz.crudmais.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    private CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }


    @PostMapping
    public Carro criar(@RequestBody Carro carro) {
        return carroService.criar(carro);
    }

    @PutMapping
    public Carro atualizar(@RequestBody Carro carro) {
        return carroService.atualizar(carro);
    }

    @GetMapping
    public List<Carro> listar() {
        return carroService.listar();
    }

    @GetMapping("/{id}")
    public Carro listarPorId(@PathVariable("id") Long id) {
        return carroService.listarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id) {
        carroService.excluir(id);
    }
}

