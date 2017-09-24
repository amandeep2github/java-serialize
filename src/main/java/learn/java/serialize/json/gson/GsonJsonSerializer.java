package learn.java.serialize.json.gson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import learn.java.serialize.MapperException;
import learn.java.serialize.json.JsonSerializer;

public class GsonJsonSerializer<T> implements JsonSerializer<T> {

	public String serialize(T t) throws MapperException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();
		return gson.toJson(t);
	}

	public T deserialize(String str) throws JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSubJson(String json, boolean prettyPrint, String... elements) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		if(prettyPrint)
			gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		JsonElement jEle = gson.fromJson(json, JsonElement.class);
		for(String subElement: elements){
			if(jEle.isJsonArray())
				throw new IllegalStateException("can't extract subelement on json array");
			jEle = jEle.getAsJsonObject().get(subElement);
		}
		return gson.toJson(jEle);
	}

}
