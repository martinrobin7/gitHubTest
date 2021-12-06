package com.example.Bloggers.service;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JsonOrgJsonProvider;

public class TestingMain {

	public static void main(String[] args) {
		
		String originalObject = "{\r\n" + 
				"	\"d\": {\r\n" + 
				"		\"results\": [{\r\n" + 
				"			\"metadata\": {\r\n" + 
				"				\"etag\": \"\\\"2\\\"\",\r\n" + 
				"				\"id\": \"Web/Lists(guid'6d0c61af-1f9e-4289-b09e-f4bcb975f8ef')/Items(40519)\",\r\n" + 
				"				\"type\": \"SP.Data.VerifiedDocumentsItem\",\r\n" + 
				"				\"uri\": \"https://wdpr-recruiting-dev.disney.pvt/_api/Web/Lists(guid'6d0c61af-1f9e-4289-b09e-f4bcb975f8ef')/Items(40519)\"\r\n" + 
				"			},\r\n" + 
				"			\"metaId\": 40519,\r\n" + 
				"			\"id\": 40519,\r\n" + 
				"			\"applicantIdId\": 19180,\r\n" + 
				"			\"title\": \"Verified\",\r\n" + 
				"			\"encodedAbsUrl\": \"https://wdpr-recruiting-dev.disney.pvt/VerifiedDocuments/2013/12/31/635240800404374652.pdf\"\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"metadata\": {\r\n" + 
				"				\"etag\": \"\\\"1\\\"\",\r\n" + 
				"				\"id\": \"Web/Lists(guid'6d0c61af-1f9e-4289-b09e-f4bcb975f8ef')/Items(41265)\",\r\n" + 
				"				\"type\": \"SP.Data.VerifiedDocumentsItem\",\r\n" + 
				"				\"uri\": \"https://wdpr-recruiting-dev.disney.pvt/_api/Web/Lists(guid'6d0c61af-1f9e-4289-b09e-f4bcb975f8ef')/Items(41265)\"\r\n" + 
				"			},\r\n" + 
				"			\"metaId\": 41265,\r\n" + 
				"			\"id\": 41265,\r\n" + 
				"			\"applicantIdId\": 19180,\r\n" + 
				"			\"title\": \"Verified\",\r\n" + 
				"			\"encodedAbsUrl\": \"https://wdpr-recruiting-dev.disney.pvt/VerifiedDocuments/2013/12/31/635240797109551989.pdf\"\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"metadata\": {\r\n" + 
				"				\"etag\": \"\\\"1\\\"\",\r\n" + 
				"				\"id\": \"Web/Lists(guid'6d0c61af-1f9e-4289-b09e-f4bcb975f8ef')/Items(42030)\",\r\n" + 
				"				\"type\": \"SP.Data.VerifiedDocumentsItem\",\r\n" + 
				"				\"uri\": \"https://wdpr-recruiting-dev.disney.pvt/_api/Web/Lists(guid'6d0c61af-1f9e-4289-b09e-f4bcb975f8ef')/Items(42030)\"\r\n" + 
				"			},\r\n" + 
				"			\"metaId\": 42030,\r\n" + 
				"			\"id\": 42030,\r\n" + 
				"			\"applicantIdId\": 19180,\r\n" + 
				"			\"title\": \"Verified\",\r\n" + 
				"			\"encodedAbsUrl\": \"https://wdpr-recruiting-dev.disney.pvt/VerifiedDocuments/2014/01/06/635246194325112033.pdf\"\r\n" + 
				"		}]\r\n" + 
				"	}\r\n" + 
				"}";
		JSONObject jsonObject = new JSONObject(originalObject);
		JSONArray finalArray = null;
		JSONArray finalArray1 = new JSONArray();
		JSONObject jsonObject1 = new JSONObject();
		try {
			Configuration configuration = Configuration.builder()
		            .jsonProvider(new JsonOrgJsonProvider())
		            .build();

		    JsonPath jsonPath = JsonPath.compile("$.d.results");
		     finalArray= jsonPath.read(jsonObject, configuration);
		     for(int i=0;i<=finalArray.length()-1;i++) {
		    	 JSONObject jsonObject2 = finalArray.getJSONObject(i);
		    	 finalArray1.put(jsonObject2.get("encodedAbsUrl"));
		    	 jsonObject1.put("URL", finalArray1);
		     }
		     System.out.println(jsonObject1.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
