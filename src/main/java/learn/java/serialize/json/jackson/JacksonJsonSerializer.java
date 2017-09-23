package learn.java.serialize.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import learn.java.serialize.MapperException;
import learn.java.serialize.json.JsonSerializer;

public class JacksonJsonSerializer <T> implements JsonSerializer<T>{
	
	/* (non-Javadoc)
	 * @see learn.java.serialize.json.jackson.JsonSerializer#serialize(T)
	 */
	public String serialize(T t) throws MapperException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			throw new MapperException(e);
		}
	}
	
	/* (non-Javadoc)
	 * @see learn.java.serialize.json.jackson.JsonSerializer#deserialize(java.lang.String)
	 */
	public T deserialize(String str) throws JsonProcessingException{
		return null;
	}
}
