package com.neha.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.rest.entity.RestEntity;

public interface RestDao extends JpaRepository<RestEntity, Integer> {

}
