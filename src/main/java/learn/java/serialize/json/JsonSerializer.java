package learn.java.serialize.json;

import com.fasterxml.jackson.core.JsonProcessingException;

import learn.java.serialize.MapperException;

public interface JsonSerializer<T> {

	String serialize(T t) throws MapperException;

	T deserialize(String str) throws JsonProcessingException;
	
	String getSubJson(String json, boolean prettyPrint, String... elements);

}