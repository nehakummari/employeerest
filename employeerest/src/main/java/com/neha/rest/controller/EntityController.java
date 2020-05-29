package com.neha.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neha.rest.entity.RestEntity;
import com.neha.rest.service.RestService;

@RestController
public class EntityController {

	@Autowired 
	RestService restService;
	
	@GetMapping(value ="/entity")
	public List<RestEntity> getallEntities() {
		return restService.getallEntities();
	}
	
	@GetMapping(value = "/entity/{rid}")
	public Optional<RestEntity> getEntity(@PathVariable Integer rid) {
		return restService.getEntity(rid);
	}
	
	@DeleteMapping(value = "/entity/{rid}")
	public void deleteEntity(@PathVariable Integer rid) {
		restService.deleteEntity(rid);
	}
	
	@PostMapping(value = "/entity")
	public void createEntity(@RequestBody RestEntity entity) {
		restService.createEntity(entity);
	}
	
}
