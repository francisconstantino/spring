package com.accenture.jersey.client.security;

import java.util.Base64;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class SecurityServiceClient {


	public static void main(String[] args) {
		String url = "http://localhost:8081/Java/Bootcamp/securityservice/order/1";
		String user = "djab";
		String password = "1234";

		String authString = user + ":" + password;
		String authStr = Base64.getEncoder().encodeToString(authString.getBytes());

		Client restClient = new Client();
		WebResource wr = restClient.resource(url);
		ClientResponse resp = wr.type(MediaType.APPLICATION_JSON)
				.header("Authorization", "Basic " + authStr)
				.get(ClientResponse.class);
		String output = resp.getEntity(String.class);
		System.out.println(output);
	}
}
