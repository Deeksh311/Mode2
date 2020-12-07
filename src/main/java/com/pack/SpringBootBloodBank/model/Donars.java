package com.pack.SpringBootBloodBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donar")
public class Donars {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private String bloodgroup;
	private String city;
	private String time;
	private long level;
	private String notes;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Donars(long id, String firstname, String lastname, String bloodgroup, String city, String time, long level,
			String notes) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.bloodgroup = bloodgroup;
		this.city = city;
		this.time = time;
		this.level = level;
		this.notes = notes;
	}
	public Donars(String firstname, String lastname, String bloodgroup, String city, String time, long level,
			String notes) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.bloodgroup = bloodgroup;
		this.city = city;
		this.time = time;
		this.level = level;
		this.notes = notes;
	}
	public Donars() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Donars [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", bloodgroup=" + bloodgroup
				+ ", city=" + city + ", time=" + time + ", level=" + level + ", notes=" + notes + "]";
	}
}