package com.lokizz.crudmais.repository;

import com.lokizz.crudmais.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
