package com.pack.SpringBootBloodBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class User {

	  public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, String bloodgroup, String city) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.bloodgroup = bloodgroup;
		this.city = city;
	}
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    private String firstname;
	    private String lastname;
	    private String bloodgroup;
	    private String city;
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
		@Override
		public String toString() {
			return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", bloodgroup="
					+ bloodgroup + ", city=" + city + "]";
		}
	
}
