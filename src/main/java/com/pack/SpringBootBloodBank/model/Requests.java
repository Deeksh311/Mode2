package com.pack.SpringBootBloodBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requestor")
public class Requests {

	public Requests(long id, long requestId, String patientName, String bloodGroup, String city, String doctarName,
			String hospitalName, String time, String contactName, long contactNumber, String email, String message) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.doctarName = doctarName;
		this.hospitalName = hospitalName;
		this.time = time;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.message = message;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long requestId;
	private String patientName;
	private String bloodGroup;
	private String city;
	private String doctarName;
	private String hospitalName;
	private String time;
	private String contactName;
	private long contactNumber;
	private String email;
	private String message;
	
	public Requests() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Requests(long requestId, String patientName, String bloodGroup, String city, String doctarName,
			String hospitalName, String time, String contactName, long contactNumber, String email, String message) {
		super();
	
		this.requestId = requestId;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.doctarName = doctarName;
		this.hospitalName = hospitalName;
		this.time = time;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.message = message;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRequestId() {
		return requestId;
	}
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDoctarName() {
		return doctarName;
	}
	public void setDoctarName(String doctarName) {
		this.doctarName = doctarName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Requests [id=" + id + ", requestId=" + requestId + ", patientName=" + patientName + ", bloodGroup="
				+ bloodGroup + ", city=" + city + ", doctarName=" + doctarName + ", hospitalName=" + hospitalName
				+ ", time=" + time + ", contactName=" + contactName + ", contactNumber=" + contactNumber + ", email="
				+ email + ", message=" + message + "]";
	}
}
