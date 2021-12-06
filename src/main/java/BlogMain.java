import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.web.JsonPath;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BlogMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = "[{\r\n" + 
				"	\"msys\": {\r\n" + 
				"		\"track_event\": {\r\n" + 
				"			\"click_tracking\": true,\r\n" + 
				"			\"customer_id\": \"12801\",\r\n" + 
				"			\"delv_method\": \"esmtp\",\r\n" + 
				"			\"event_id\": \"7003701078263753499\",\r\n" + 
				"			\"friendly_from\": \"noreply@disney-email.com\",\r\n" + 
				"			\"initial_pixel\": true,\r\n" + 
				"			\"injection_time\": \"2021-09-06T05:01:09.000Z\",\r\n" + 
				"			\"ip_address\": \"104.47.74.10\",\r\n" + 
				"			\"ip_pool\": \"default\",\r\n" + 
				"			\"mailbox_provider\": \"Office 365\",\r\n" + 
				"			\"mailbox_provider_region\": \"Global\",\r\n" + 
				"			\"message_id\": \"613295a035612506f8d8\",\r\n" + 
				"			\"msg_from\": \"msprvs1=18883y34fz1VM=bounces-12801-6@eu.sparkpostmail1.com\",\r\n" + 
				"			\"msg_size\": \"2160\",\r\n" + 
				"			\"num_retries\": \"0\",\r\n" + 
				"			\"open_tracking\": true,\r\n" + 
				"			\"outbound_tls\": \"1\",\r\n" + 
				"			\"queue_time\": \"2558\",\r\n" + 
				"			\"rcpt_meta\": {\r\n" + 
				"				\"test\": \"1\"\r\n" + 
				"			},\r\n" + 
				"			\"rcpt_tags\": [],\r\n" + 
				"			\"rcpt_to\": \"wdpr.dl-ttc.stopsell@disney.com\",\r\n" + 
				"			\"recv_method\": \"rest\",\r\n" + 
				"			\"routing_domain\": \"disney.com\",\r\n" + 
				"			\"sending_ip\": \"156.70.17.68\",\r\n" + 
				"			\"subaccount_id\": \"6\",\r\n" + 
				"			\"subject\": \"Stop Sell Status Change Notification for Expedia-US\",\r\n" + 
				"			\"template_id\": \"ttc-stop-sell-status-change-notification\",\r\n" + 
				"			\"template_version\": \"18\",\r\n" + 
				"			\"timestamp\": \"1630904472\",\r\n" + 
				"			\"transmission_id\": \"7002651675974116691\",\r\n" + 
				"			\"type\": \"delivery\",\r\n" + 
				"			\"raw_rcpt_to\": \"WDPR.DL-TTC.Stopsell@disney.com\",\r\n" + 
				"			\"recipient_domain\": \"disney.com\"\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"	\"msys\": {\r\n" + 
				"		\"track_event\": {\r\n" + 
				"			\"click_tracking\": true,\r\n" + 
				"			\"customer_id\": \"12801\",\r\n" + 
				"			\"delv_method\": \"esmtp\",\r\n" + 
				"			\"event_id\": \"7003701078263753499\",\r\n" + 
				"			\"friendly_from\": \"noreply@disney-email.com\",\r\n" + 
				"			\"initial_pixel\": true,\r\n" + 
				"			\"injection_time\": \"2021-09-06T05:01:09.000Z\",\r\n" + 
				"			\"ip_address\": \"104.47.74.10\",\r\n" + 
				"			\"ip_pool\": \"default\",\r\n" + 
				"			\"mailbox_provider\": \"Office 365\",\r\n" + 
				"			\"mailbox_provider_region\": \"Global\",\r\n" + 
				"			\"message_id\": \"613295a035612506f8d8\",\r\n" + 
				"			\"msg_from\": \"msprvs1=18883y34fz1VM=bounces-12801-6@eu.sparkpostmail1.com\",\r\n" + 
				"			\"msg_size\": \"2160\",\r\n" + 
				"			\"num_retries\": \"0\",\r\n" + 
				"			\"open_tracking\": true,\r\n" + 
				"			\"outbound_tls\": \"1\",\r\n" + 
				"			\"queue_time\": \"2558\",\r\n" + 
				"			\"rcpt_meta\": {\r\n" +
				"			\"message_submission_id\": \"1234567-7654321\",\r\n" + 
				"				\"test\": \"1\"\r\n" + 
				"			},\r\n" + 
				"			\"rcpt_tags\": [],\r\n" + 
				"			\"rcpt_to\": \"wdpr.dl-ttc.stopsell@disney.com\",\r\n" + 
				"			\"recv_method\": \"rest\",\r\n" + 
				"			\"routing_domain\": \"disney.com\",\r\n" + 
				"			\"sending_ip\": \"156.70.17.68\",\r\n" + 
				"			\"subaccount_id\": \"6\",\r\n" + 
				"			\"subject\": \"Stop Sell Status Change Notification for Expedia-US\",\r\n" + 
				"			\"template_id\": \"ttc-stop-sell-status-change-notification\",\r\n" + 
				"			\"template_version\": \"18\",\r\n" + 
				"			\"timestamp\": \"1630904472\",\r\n" + 
				"			\"transmission_id\": \"7002651675974116691\",\r\n" + 
				"			\"type\": \"delivery\",\r\n" + 
				"			\"raw_rcpt_to\": \"martin-max\",\r\n" + 
				"			\"recipient_domain\": \"disney.com\"\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"}\r\n" + 
				"]";
		JSONArray jArray1 = new JSONArray();
		JSONArray jArray = new JSONArray(jsonArray);
		for (int i=0;i<jArray.length();i++) {
			JSONObject jsonObject = jArray.getJSONObject(i);
			
			JSONObject object = (JSONObject) jsonObject.get("msys");
			String eventType = (object.has("message_event")) ? "message_event" : "track_event";
			JSONObject optString = (JSONObject) object.get(eventType);
			JSONObject object2 = (JSONObject) optString.get("rcpt_meta");
			 if(object2.has("message_submission_id")) {
				 jArray1.put(jsonObject);
			 }
		}
		
		System.out.println(jArray1.toList().toString());
		
	}

}
