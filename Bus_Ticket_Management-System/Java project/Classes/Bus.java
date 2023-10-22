package Classes;
import java.lang.*;
public abstract class Bus 
{
	private String busNo;
	private String boarding;
	private String dropping;
	private String date;
	private String departureTime;
	private double ticketPrice;
	private int ticketNo;
	private int ticketAvailableQuantity;
	
	public Bus()
	{
		
	}
	public Bus(String busNo, String boarding, String dropping , String date , String departureTime, double ticketPrice, int ticketNo, int ticketAvailableQuantity)
	{
		this.busNo=busNo;
		this.boarding=boarding;
		this.dropping=dropping;
		this.date=date;
		this.departureTime=departureTime;
		this.ticketPrice=ticketPrice;
		this.ticketNo=ticketNo;
		this.ticketAvailableQuantity=ticketAvailableQuantity;
	}
	public void setBusNo(String busNo)
	{
		this.busNo=busNo;
	}
	public void setBoarding(String boarding)
	{
		this.boarding=boarding;
	}
	public void setDropping(String dropping)
	{
		this.dropping=dropping;
	}
	public void setDate(String date)
	{
		this.date=date;
	}
	public void setDepartureTime(String departureTime)
	{
		this.departureTime=departureTime;
	}
	public void setTicketPrice(double ticketPrice)
	{
		this.ticketPrice=ticketPrice;
	}
	public void setTicketNo(int ticketNo)
	{
		this.ticketNo=ticketNo;
	}
	public void setTicketAvailableQuantity(int ticketAvailableQuantity)
	{
		this.ticketAvailableQuantity=ticketAvailableQuantity;
		
	}
	
	public String getBusNo()
	{
		return busNo;
	}
	public String getBoarding()
	{
		return boarding;
	}
	public String getDropping()
	{
		return dropping;
	}
	public String getDate()
	{
		return date;
	}
	public String getDepartureTime()
	{
		return departureTime;
	}
	public double getTicketPrice()
	{
	    return ticketPrice;
	}
	public int getTicketNo()
	{
		return ticketNo;
	}
	public int getTicketAvailableQuantity()
	{
		return ticketAvailableQuantity;
		
	}
	public abstract void showBusDetails();
}