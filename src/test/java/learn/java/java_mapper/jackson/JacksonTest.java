package learn.java.java_mapper.jackson;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import learn.java.java_mapper.entity.Festival;

public class JacksonTest {

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
		JacksonMapper<Festival> jm = new JacksonMapper<Festival>();
		String actual = jm.convert(festival);
		String expected = new String(Files.readAllBytes(Paths.get("./src/test/json/Festival-flat.json")));
		assertEquals(expected, actual);
	}

}
