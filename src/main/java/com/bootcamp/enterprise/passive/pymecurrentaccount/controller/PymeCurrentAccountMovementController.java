package com.bootcamp.enterprise.passive.pymecurrentaccount.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.enterprise.passive.pymecurrentaccount.entity.PymeCurrentAccountMovement;
import com.bootcamp.enterprise.passive.pymecurrentaccount.service.PymeCurrentAccountMovementServiceImpl;

@RestController
@RequestMapping("enterprise/passive/pyme_current_account")
@Tag(name = "Enterprise Passive Product Pyme Current Account Type", description = "Manage Enterprise Passive Product Pyme Current Accounts type")
@CrossOrigin( value = { "*" })
@RequiredArgsConstructor
public class PymeCurrentAccountMovementController {
	
	@Autowired
    public final PymeCurrentAccountMovementServiceImpl service;

    @GetMapping
    public Flux<PymeCurrentAccountMovement> getAll() {
        return service.findAll();
    }
    
    @GetMapping("/find/{num}")
    public Flux<PymeCurrentAccountMovement> findByNum(@PathVariable String num){
    	return service.findByAccountNumber(num);
    }
    
    @PostMapping
    public Mono<PymeCurrentAccountMovement> create(@RequestBody PymeCurrentAccountMovement p) {
        return service.create(p);
    }

    @PutMapping("/update/{id}")
    public Mono<PymeCurrentAccountMovement> update(@RequestBody PymeCurrentAccountMovement p, @PathVariable String id) {
        return service.update(p);
    }
    
    @DeleteMapping("/deleteById/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }

}
