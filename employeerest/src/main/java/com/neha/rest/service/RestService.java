package com.neha.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.neha.rest.dao.RestDao;
import com.neha.rest.entity.RestEntity;

@Service
public class RestService {
	@Autowired
	RestDao restdao;
	
	public List<RestEntity> getallEntities() {
		return restdao.findAll();	
	}
	
	public Optional<RestEntity> getEntity(Integer rid) {
		return restdao.findById( rid);
	}
	
	public void deleteEntity(Integer rid) {
		restdao.deleteById(rid);
	}
	
	public void createEntity(RestEntity entity) {
		restdao.save(entity);
	}
	

}
