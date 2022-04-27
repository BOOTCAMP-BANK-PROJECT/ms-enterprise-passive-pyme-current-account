package com.bootcamp.enterprise.passive.pymecurrentaccount.service;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccountMovement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PymeCurrentAccountMovementService {
	
    Flux<PymeCurrentAccountMovement> findAll();
    Mono<PymeCurrentAccountMovement> create(PymeCurrentAccountMovement pymeca);
    Flux<PymeCurrentAccountMovement> findByAccountNumber(String num);
    Mono<PymeCurrentAccountMovement> update(PymeCurrentAccountMovement pymeca);
    Mono<Void> deleteById(String id);

}
