package com.example.sayon.hibernatefirst;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name = "sayan")
public class Alien {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@ElementCollection
	@JoinTable(name = "USER_ADDRESS")//for changing the name of the second table
	private Collection<Address> listofaddress=new ArrayList<Address>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Address> getListofaddress() {
		return listofaddress;
	}
	public void setListofaddress(Collection<Address> listofaddress) {
		this.listofaddress = listofaddress;
	}

	
	
}
