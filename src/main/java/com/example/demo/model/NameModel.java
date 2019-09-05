package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NameModel {

	@Id
	private int id;
	private String fname;
	private String lname;

	public NameModel() {

	}

	public NameModel(int id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Name [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
}