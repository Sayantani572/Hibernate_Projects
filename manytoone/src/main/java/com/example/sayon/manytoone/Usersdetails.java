package com.example.sayon.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Usersdetails {

	@Id
	private int id;
	private String uname;
	@OneToMany(mappedBy = "user")
	private List<Vehicle> listofvehicle=new ArrayList<Vehicle>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public List<Vehicle> getListofvehicle() {
		return listofvehicle;
	}
	public void setListofvehicle(List<Vehicle> listofvehicle) {
		this.listofvehicle = listofvehicle;
	}
}
