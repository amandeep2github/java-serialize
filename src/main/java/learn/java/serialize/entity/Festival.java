package learn.java.serialize.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

//@Data
public class Festival {
	private String name;
	@JsonFormat(pattern="MMM dd, yyyy", timezone="IST")
	private Date startDate;
	@JsonFormat(pattern="MMM dd, yyyy", timezone="IST")
	private Date endDate;
	private int capacity;
	private int numVIPTicketSold;
	private int numGeneralTicketSold;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getNumVIPTicketSold() {
		return numVIPTicketSold;
	}
	public void setNumVIPTicketSold(int numVIPTicketSold) {
		this.numVIPTicketSold = numVIPTicketSold;
	}
	public int getNumGeneralTicketSold() {
		return numGeneralTicketSold;
	}
	public void setNumGeneralTicketSold(int numGeneralTicketSold) {
		this.numGeneralTicketSold = numGeneralTicketSold;
	}
	
	
}
