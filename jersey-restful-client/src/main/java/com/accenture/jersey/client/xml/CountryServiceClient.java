package com.accenture.jersey.client.xml;



import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CountryServiceClient {

	public static void main(String[] args) {

		Country country = new Country("Philippines", "Manila", 1123);

		Client client = new Client();
		WebResource wr = client.resource("http://localhost:8081/Java/Bootcamp/countryservice/"
				+ "getcountryDetails");
		ClientResponse response = wr.type(MediaType.APPLICATION_XML).post(ClientResponse.class, country);
		String restStr = response.getEntity(String.class);
		System.out.println(restStr);
	}
}
