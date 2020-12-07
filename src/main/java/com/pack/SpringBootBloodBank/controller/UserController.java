package com.pack.SpringBootBloodBank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.SpringBootBloodBank.dao.DonarsRepository;
import com.pack.SpringBootBloodBank.dao.RequestsRepository;
import com.pack.SpringBootBloodBank.dao.UserRepository;
import com.pack.SpringBootBloodBank.model.Donars;
import com.pack.SpringBootBloodBank.model.Requests;
import com.pack.SpringBootBloodBank.model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository repository1;

	@Autowired
	DonarsRepository repository2;

	@Autowired
	RequestsRepository repository3;

	@PostMapping(value = "/users")
	public ResponseEntity<User> postUser(@RequestBody User user) {
		try {

			User _user = repository1
					.save(new User(user.getFirstname(), user.getLastname(), user.getBloodgroup(), user.getCity()));
			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@PostMapping(value = "/donators")
	public ResponseEntity<Donars> postUser(@RequestBody Donars donars) {
		try {

			Donars _donars = repository2.save(new Donars(donars.getFirstname(),donars.getLastname(),donars.getBloodgroup(),donars.getCity(), donars.getTime(), donars.getLevel(), donars.getNotes()));
			return new ResponseEntity<>(_donars, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@PostMapping(value = "/requestors")
	public ResponseEntity<Requests> postUser(@RequestBody Requests requests) {
		try {

			Requests _requests = repository3.save(new Requests(requests.getRequestId(), requests.getPatientName(),
					requests.getBloodGroup(), requests.getCity(), requests.getDoctarName(), requests.getHospitalName(),
					requests.getTime(), requests.getContactName(), requests.getContactNumber(), requests.getEmail(),
					requests.getMessage()));
			return new ResponseEntity<>(_requests, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@GetMapping("/status")
	public ResponseEntity<List<Requests>> getStatus() {
		List<Requests> requests = new ArrayList<Requests>();
		try {
			repository3.findAll().forEach(requests::add);

			if (requests.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(requests, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping(value = "donators/id/{id}")
	public ResponseEntity<List<Donars>> findById(@PathVariable long id) {
		System.out.println(id);
		try {
			List<Donars> donars = repository2.findById(id);
			System.out.println("donars");
			if (donars.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(donars, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	@GetMapping(value = "requestors/patientName1/{patientName}")
	public ResponseEntity<List<Requests>> findByName(@PathVariable String patientName ) {

		try {
			List<Requests> requests = repository3.findByPatientName(patientName );

			if (requests.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(requests, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

}
