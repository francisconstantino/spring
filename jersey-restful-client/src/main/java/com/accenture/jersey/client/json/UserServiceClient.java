package com.accenture.jersey.client.json;

import javax.ws.rs.core.MediaType;





import org.json.JSONException;
import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class UserServiceClient {
	public static void main(String[] args) throws JSONException   {
		JSONObject json = new JSONObject();
		json.put("email", "dj@accenture.com");
		json.put("password", "1234");

		//consumes json
		Client client = new Client();
		WebResource wr = client.resource("http://localhost:8081/Java/Bootcamp/userservice/login");

		//saves response of server
		ClientResponse response = wr.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, json.toString());
		String output = response.getEntity(String.class);
		System.out.println(output);
	}
}
