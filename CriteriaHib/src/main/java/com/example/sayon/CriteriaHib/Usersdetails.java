package com.example.sayon.CriteriaHib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usersdetails {

	@Id
	@GeneratedValue
	private int id;
	private String uname;
	
	
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
	@Override
	public String toString() {
		return "Usersdetails [id=" + id + ", uname=" + uname + "]";
	}
	
	
}