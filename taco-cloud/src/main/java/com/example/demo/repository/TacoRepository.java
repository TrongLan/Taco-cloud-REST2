package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>{

}
