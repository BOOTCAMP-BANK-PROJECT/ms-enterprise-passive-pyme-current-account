package com.bootcamp.enterprise.passive.pymecurrentaccount.service;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PymeCurrentAccountService {
	
    Flux<PymeCurrentAccount> findAll();
    Mono<PymeCurrentAccount> create(PymeCurrentAccount pymeca);
    Mono<PymeCurrentAccount> findByAccountNumber(String id);
    Mono<PymeCurrentAccount> update(PymeCurrentAccount pymeca);
    Mono<Void> deleteById(String id);

}
