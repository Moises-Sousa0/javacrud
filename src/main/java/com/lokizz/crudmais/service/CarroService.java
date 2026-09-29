package com.lokizz.crudmais.service;

import com.lokizz.crudmais.entity.Carro;
import com.lokizz.crudmais.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    private CarroRepository carroRepository;

    //injecao de dependencia via construtor
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listar() {
        return carroRepository.findAll();
    }

    public Carro listarPorId(Long id) {
        return carroRepository.findById(id).get();
    }

    public Carro criar(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro atualizar(Carro carro) {
        return carroRepository.save(carro);
    }

    public void excluir(Long id) {
        carroRepository.deleteById(id);
    }

}
