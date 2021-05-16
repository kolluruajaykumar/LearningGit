package learning.api;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetCbSessionID {

	public static void main(String[] args)
	{
		getSessionId();
	}
	
		public static String getSessionId()
		{
			
			//String sessionID="";
		RestAssured.baseURI="http://www.smatbot.com/kya_backend/pagehub/chatbot_utils";
		
		JSONObject obj= new JSONObject();
		obj.put("action", "init_chat");
		obj.put("device_print", "ed79cf898a7951b5f8858d2d7f4f106f");
		obj.put("chatbot_id", "4174");
		obj.put("name", "SmatBot");
		obj.put("language_code", "default");
		
		Response res= RestAssured.given()
				.header("Content-Type", "application/JSON")
				.body(obj.toString())
				.post();
		
		//System.out.println(res.getStatusCode());

		/*System.out.println(res.getStatusLine());
		System.out.println();
		
		System.out.println(res.getHeaders());
		System.out.println();*/
		
		String x= res.getHeader("Set-Cookie");
		
		String[] y= x.split(";");
		String[] z= y[0].split("=");
		
		System.out.println(z[1]);
		return(z[1]);
		
		}

	

}
