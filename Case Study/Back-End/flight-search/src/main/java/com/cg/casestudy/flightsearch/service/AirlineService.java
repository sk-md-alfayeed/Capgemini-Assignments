package com.cg.casestudy.flightsearch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.casestudy.flightsearch.model.Airline;


@Service
public interface AirlineService {
	
	List<Airline> getAllAirlines();

	Optional<Airline> getAirline(String id);

	String addAirline(Airline airline);

	String updateAirline(Airline airline);

	String deleteAirline(String id);


}
