package Interfaces;
import Classes.*;
import java.lang.*;
public interface IBusTicketOperations
{
	void addBusTicket(BusTicket t);
	void deleteBusTicket(BusTicket t);
	BusTicket getBusTicket(String busNo);
	void showAllBusTickets();
	
}
	