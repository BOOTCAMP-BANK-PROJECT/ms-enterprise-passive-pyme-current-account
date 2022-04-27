package com.bootcamp.enterprise.passive.pymecurrentaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccountMovement;
import com.bootcamp.enterprise.passive.pymecurrentaccount.repository.PymeCurrentAccountMovementRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PymeCurrentAccountMovementServiceImpl implements PymeCurrentAccountMovementService {
	
	@Autowired
    public final PymeCurrentAccountMovementRepository repo;

	@Override
	public Flux<PymeCurrentAccountMovement> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return repo.deleteById(id);
	}

	@Override
	public Mono<PymeCurrentAccountMovement> create(PymeCurrentAccountMovement pymecam) {
		return repo.save(pymecam);
	}

	@Override
	public Mono<PymeCurrentAccountMovement> update(PymeCurrentAccountMovement pymecam) {
		return repo.save(pymecam);
	}

	@Override
	public Flux<PymeCurrentAccountMovement> findByAccountNumber(String num) {
		return repo.findByAccountNumber(num);
	}

}
