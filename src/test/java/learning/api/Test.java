package learning.api;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test {

	public static void main(String[] args) {
	RestAssured.baseURI="http://www.smatbot.com/kya_backend/pagehub/chatbot_utils";
		
	String cb_sessionID= GetCbSessionID.getSessionId();
		JSONObject obj= new JSONObject();
		obj.put("action", "answer");
		obj.put("answer_text", "test");
		obj.put("cb_session", cb_sessionID);
		obj.put("question_id", "4017");
		obj.put("is_logical", "0");
		obj.put("sequence", "2");
		obj.put("chatbot_id", "4174");
		obj.put("option", "undefined");
		obj.put("visitor_link_travesral", "");
		obj.put("language_code", "default");
		
		Response res= RestAssured.given()
				.header("Content-Type", "application/JSON")
				.body(obj.toString())
				.post();
		
		
		System.out.println(res.getStatusLine());
		System.out.println();
		
		System.out.println(res.getHeaders());
		System.out.println();
		
		System.out.println(res.getBody().asPrettyString());
		System.out.println();
	}

}
