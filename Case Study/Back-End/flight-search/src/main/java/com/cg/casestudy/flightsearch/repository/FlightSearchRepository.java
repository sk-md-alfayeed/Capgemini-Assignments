package com.cg.casestudy.flightsearch.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.flightsearch.model.Flight;

@Repository
public interface FlightSearchRepository extends MongoRepository<Flight, String> {
	
	
	//Custom Search for fetching data from database
	List<Flight> findByDepartureAirportAirportCodeAndDestinationAirportAirportCode(String departureAirportAirportCode, String destinationAirportAirportCode);
}