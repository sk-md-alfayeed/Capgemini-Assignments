package com.cg.casestudy.flightfair.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.flightfair.model.Fair;
import com.cg.casestudy.flightfair.model.FlightFair;
import com.cg.casestudy.flightfair.model.FlightList;
import com.cg.casestudy.flightfair.service.FlightFairServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FlightFairController {

	@Autowired
	FlightFairServiceImpl flightFairServiceImpl;
	
	@GetMapping(value = "/allFairs")
	public List<Fair> getAllFairs() {
		return flightFairServiceImpl.getAllFairs();
	}
	
	@GetMapping(value = "/findFair/{flightId}")
	public Optional<Fair> getFair(@PathVariable String flightId) {
		return flightFairServiceImpl.getFair(flightId);
	}

	@PostMapping(value = "/fairs")
	public FlightFair getFairs(@RequestBody FlightList flightList) {
		return flightFairServiceImpl.getFairs(flightList);
	}
	
	@PostMapping("/addFair")
	public String addFair(@RequestBody Fair fair) {
		return flightFairServiceImpl.addFair(fair);
	}
	
	@PutMapping(value = "/updateFair")
	public String  updateFair(@RequestBody Fair fair) {
		return flightFairServiceImpl.updateFair(fair);
	}

	@DeleteMapping("/deleteFair/{flightId}")
	public String deleteFair(@PathVariable String flightId) {
		return flightFairServiceImpl.deleteFair(flightId);
	}

}