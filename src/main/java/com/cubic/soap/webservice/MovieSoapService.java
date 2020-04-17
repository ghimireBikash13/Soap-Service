package com.cubic.soap.webservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cubic.movies.ApplicationResponse;
import com.cubic.movies.MovieRequest;
import com.cubic.movies.MovieResponse;

@Endpoint
public class MovieSoapService {

	private static final String NAMESPACE_URI = "http://www.cubic.com/movies";

	/**
	 *  <MovieRequest>
	 *        <name></name
	 *  </MovieRequest>
	 * 
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "MovieRequest")
	@ResponsePayload
	public MovieResponse uploadMoview(@RequestPayload MovieRequest request) {
		System.out.println(request.getMovie().getName());
		MovieResponse response=new MovieResponse();
		response.setCode(1920);
		response.setMessage("movie is uploaded");
		return response;
	}
	

}
