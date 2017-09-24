mvn test -Dtest=classname

com.google.gson.JsonElement is a top element
subclasses are:
JsonObject
JsonArray
JsonNull

on JsonObject you can invoke getElement("") but not on JsonArray as that would be index based

java.lang.IllegalStateException: Not a JSON Object: [{"name":"Tech Week","startDate":"Sep 11, 2017","endDate":"Sep 18, 2017","capacity":100,"numVIPTicketSold":4,"numGeneralTicketSold":1},{"name":"Hackovation","startDate":"Aug 11, 2017","endDate":"Sep 22, 2017","capacity":50,"numVIPTicketSold":3,"numGeneralTicketSold":5}]
	at com.google.gson.JsonElement.getAsJsonObject(JsonElement.java:90)
	at learn.java.serialize.json.gson.GsonJsonSerializer.getSubJson(GsonJsonSerializer.java:33)
	at learn.java.serialize.json.gson.GsonTest.testSubJson(GsonTest.java:43)
