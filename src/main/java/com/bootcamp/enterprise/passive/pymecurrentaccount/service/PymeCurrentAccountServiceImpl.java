package com.bootcamp.enterprise.passive.pymecurrentaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccount;
import com.bootcamp.enterprise.passive.pymecurrentaccount.repository.PymeCurrentAccountRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PymeCurrentAccountServiceImpl implements PymeCurrentAccountService {
	
	@Autowired
    public final PymeCurrentAccountRepository repo;

	@Override
	public Flux<PymeCurrentAccount> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return repo.deleteById(id);
	}

	@Override
	public Mono<PymeCurrentAccount> create(PymeCurrentAccount pymeca) {
		return repo.save(pymeca);
	}

	@Override
	public Mono<PymeCurrentAccount> findByAccountNumber(String num) {
		return repo.findByAccountNumber(num);
	}

	@Override
	public Mono<PymeCurrentAccount> update(PymeCurrentAccount pymeca) {
		return repo.save(pymeca);
	}

}
