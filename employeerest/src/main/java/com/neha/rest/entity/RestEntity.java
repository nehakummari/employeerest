package com.neha.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class RestEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rid;
	private String rname;
	private String rdesig;
	private Long rsal;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRdesig() {
		return rdesig;
	}
	public void setRdesig(String rdesig) {
		this.rdesig = rdesig;
	}
	public Long getRsal() {
		return rsal;
	}
	public void setRsal(Long rsal) {
		this.rsal = rsal;
	}
	@Override
	public String toString() {
		return "RestEntity [rid=" + rid + ", rname=" + rname + ", rdesig=" + rdesig + ", rsal=" + rsal + "]";
	}
	

}
