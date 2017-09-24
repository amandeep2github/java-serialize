package learn.java.serialize.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class JavaJsonImplTest {
	
	@Test
	public void test() throws IOException{
		String inputJson = new String(Files.readAllBytes(Paths.get("./src/test/json/input/festival-batch-data.json")));
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		JsonObject jObj = gson.fromJson(inputJson, JsonObject.class);
		JsonElement jEle = jObj.getAsJsonObject("batch").get("data");
		System.out.println(gson.toJson(jEle));
	}
}
