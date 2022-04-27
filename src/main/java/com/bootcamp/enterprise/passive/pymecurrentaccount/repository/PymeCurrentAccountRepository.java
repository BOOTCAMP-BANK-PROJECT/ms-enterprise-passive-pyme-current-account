package com.bootcamp.enterprise.passive.pymecurrentaccount.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccount;

import reactor.core.publisher.Mono;

public interface PymeCurrentAccountRepository extends ReactiveCrudRepository<PymeCurrentAccount, String> {
	
	Mono<PymeCurrentAccount> findByAccountNumber(String num);

}
