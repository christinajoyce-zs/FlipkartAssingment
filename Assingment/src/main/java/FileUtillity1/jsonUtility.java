package FileUtillity1;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonUtility {
	
	
	
	public String getDataFromJsonfile(String key) throws Throwable {
		FileReader fileR = new FileReader("./src/test/resources/CommonData.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fileR);
		JSONObject map = (JSONObject)obj;
		String data = (String) map.get(key);
		return data;
	}


}
