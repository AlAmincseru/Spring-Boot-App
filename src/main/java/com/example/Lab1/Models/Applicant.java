package com.example.Lab1.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Applicant {
	@Id
	public ObjectId _id;
	public String name;
	public String department;
	public String phone;
	public String get_id() {
	return  _id.toHexString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public Applicant(ObjectId _id, String name, String department, String phone) {
		super();
		this._id = _id;
		this.name = name;
		this.department = department;
		this.phone = phone;
	}

	
}

