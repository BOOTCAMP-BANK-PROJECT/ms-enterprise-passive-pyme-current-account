package com.bootcamp.enterprise.passive.pymecurrentaccount.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccountMovement;

import reactor.core.publisher.Flux;

public interface PymeCurrentAccountMovementRepository extends ReactiveCrudRepository<PymeCurrentAccountMovement, String> {
	
	Flux<PymeCurrentAccountMovement> findByAccountNumber(String num);

}
