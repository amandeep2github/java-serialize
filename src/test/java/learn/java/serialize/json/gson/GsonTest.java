package learn.java.serialize.json.gson;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import learn.java.serialize.entity.Festival;

public class GsonTest {

	@Test
	public void test() throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		Festival festival = new Festival();
		festival.setName("Tech Week");
		festival.setStartDate(Date.valueOf(LocalDate.parse("September 11, 2017", dtf)));
		festival.setEndDate(Date.valueOf(LocalDate.parse("September 18, 2017", dtf)));
		festival.setCapacity(100);
		festival.setNumVIPTicketSold(4);
		festival.setNumGeneralTicketSold(1);
		GsonJsonSerializer<Festival> jm = new GsonJsonSerializer<Festival>();
		String actual = jm.serialize(festival);
		String expected = new String(Files.readAllBytes(Paths.get("./src/test/json/Festival-flat-dateMMMddyyyy.json")));
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubJson() throws IOException{
		String inputJson = new String(Files.readAllBytes(Paths.get("./src/test/json/input/festival-batch-data.json")));
		String expectedJson = new String(Files.readAllBytes(Paths.get("./src/test/json/festival-list-data.json")));
		GsonJsonSerializer<?> jm = new GsonJsonSerializer<>();
		String actualJson = jm.getSubJson(inputJson, true, "batch", "data");
		assertEquals(expectedJson, actualJson);
	}

}
