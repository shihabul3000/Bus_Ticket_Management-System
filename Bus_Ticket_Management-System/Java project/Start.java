import LogIn.*;
import Classes.*;
import Interfaces.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		LogIn logIn=new LogIn();
		logIn.welcome();
		logIn.systemLogIn();
		System.out.println("***WELCOME TO SOPTOBODI BUS TICKET SERVICES***");
		Scanner pc= new Scanner(System.in);
		BusReservation br=new BusReservation();
		
		System.out.println("#######################################");
		System.out.println("TICKET RESERVATION OF SOPTOBODI TRAVELS");
		System.out.println("#######################################");
		
		boolean again=true;
		while(again)
		{
			System.out.println();
			System.out.println("Here are some options for you");
			System.out.println();
			
			System.out.println("=============================");
			System.out.println("1. Bus Ticket Managment");
			System.out.println("2. Customer Managment");
			System.out.println("3. Customer Ticket Managment");
			System.out.println("4. Payment");
			System.out.println("5. Exit the application");
			System.out.println("=============================");
			
			System.out.println("What do you want to do?");
			
			
			System.out.println("************************");
			System.out.println("Enter your choice:");
			int choice=pc.nextInt();
			System.out.println("************************");
			
			
			
			switch(choice)
			{
			    case 1:
				System.out.println("****************************************");
				System.out.println("**You have selected Bus Ticket Managment");
				System.out.println("****************************************");
				System.out.println();
				System.out.println("Here are some options for you:");
				
				
				System.out.println("=============================");
			    System.out.println("1. Add Bus Ticket");
			    System.out.println("2. Delete Bus Ticket");
			    System.out.println("3. See All Bus Tickets");
			    System.out.println("4. Go Back");
			    System.out.println("=============================");
				
				System.out.println("************************");
				System.out.println("Enter Your Option:");
				int option1=pc.nextInt();
				System.out.println("************************");
				
				
				switch(option1)
				{
					case 1:
					System.out.println("********************************");
					System.out.println("You Have selected Add Bus Ticket");
					System.out.println("********************************");
					System.out.println();
					
					System.out.println("Enter Bus Type:");
					String busType= pc.next();
					System.out.println("Enter Bus No:");
					String busNo= pc.next();
					System.out.println("Enter Boarding:");
					String boarding= pc.next();
					System.out.println("Enter Dropping:");
					String dropping= pc.next();
					System.out.println("Enter Date:");
					String date= pc.next();
					System.out.println("Enter Departuretime:"); 
					String departureTime= pc.next();
					System.out.println("Enter Ticket Price:");
					double ticketPrice= pc.nextDouble();
					System.out.println("Enter Ticket No:");
					int ticketNo= pc.nextInt();
					System.out.println("Enter Available ticket Quantity:");
					int ticketAvailableQuantity= pc.nextInt();
					
					
					
					 
					
					BusTicket bt=new BusTicket();
					bt.setBusType(busType);
					bt.setBusNo(busNo);
					bt.setBoarding(boarding);
					bt.setDropping(dropping);
					bt.setDate(date);
					bt.setDepartureTime(departureTime);
					bt.setTicketPrice(ticketPrice);
					bt.setTicketNo(ticketNo);
					bt.setTicketAvailableQuantity(ticketAvailableQuantity);
					
					br.addBusTicket(bt);
					
					break;
					
					
					case 2:
					System.out.println("***********************************");
					System.out.println("You Have selected Delete Bus Ticket");
					System.out.println("***********************************");
					
					System.out.println("Enter Bus No:");
					
					br.deleteBusTicket(br.getBusTicket(pc.next()));
					
					break;
					
					
					case 3:
					System.out.println("*************************************");
					System.out.println("You Have selected See All Bus Tickets");
					System.out.println("*************************************");
					br.showAllBusTickets();
					break;
					
					
					case 4:
					System.out.println("************************");
					System.out.println("Going Back");
					System.out.println("************************");
					again= false;
					System.out.println();
					break;
					
					default:
					System.out.println("************************");
					System.out.println("Invalid Option");
					System.out.println("************************");
					break; 
				}//switch(option1)
			   
				
			break; //choice case 1	
				
			
			case 2:
			        System.out.println("************************************");
					System.out.println("You have selected Customer Managment");
					System.out.println("************************************");
					System.out.println();
					System.out.println("Here are some options for you");
					System.out.println();
					System.out.println("===============================");
					System.out.println("1.  Add New Customer");
					System.out.println("2.  Remove Customer");
					System.out.println("3.  Show All Customers");
					System.out.println("4.  Go Back");
					System.out.println("===============================");
					
					System.out.println("***********************");
					System.out.println("Enter Your choice:");
					int option2=pc.nextInt();
					System.out.println("***********************");
					
				switch(option2)
				{
					case 1:
					System.out.println("******************************");
					System.out.println("You have selected Add Customer");
					System.out.println("******************************");
					
					System.out.println("Enter Customer Name:");
					String customerName=pc.next();
					System.out.println("Enter Customer Phone Number:");
					int customerPhone=pc.nextInt();
					
					Customer c= new Customer();
					c.setCustomerName(customerName);
					c.setCustomerPhone(customerPhone);
					
					br.addCustomer(c);
					break;
					
					case 2:
					System.out.println("*********************************");
					System.out.println("You have selected Remove Customer");
					System.out.println("*********************************");
					System.out.println();
					
					System.out.println("Enter Customer Phone Number:");
					br.removeCustomer(br.getCustomer(pc.nextInt()));
					
					break;
					
					case 3:
					System.out.println("************************************");
					System.out.println("You have selected Show All Customers");
					System.out.println("************************************");
					System.out.println();
					br.showAllCustomers();
					
					break;
					
					
					case 4:
					System.out.println("************************");
					System.out.println("Going Back");
					System.out.println("************************");
					again= false;
					System.out.println();
					break;
					
					default:
					System.out.println("************************");
					System.out.println("Invalid Option");
					System.out.println("************************");
					break; 
					
					
					
					
						
				}// switch(option2)
				
				break; //case 2
				
				case 3:
				    System.out.println("*******************************************");
					System.out.println("You have selected Customer Ticket Managment");
					System.out.println("*******************************************");
					System.out.println();
					System.out.println("Here are some options for you");
					System.out.println();
					System.out.println("===============================");
					System.out.println("1.  Book a Ticket for a Customer");
					System.out.println("2.  Cancel a Ticket for a Customer");
					System.out.println("3.  Show All Booked Tickets");
					System.out.println("4.  Go Back");
					System.out.println("===============================");
					
					System.out.println("************************");
					System.out.println("Enter YOur Choice:");
					int option3=pc.nextInt();
					System.out.println("************************");
					
					switch(option3)
					{
						case 1:
						Bus b= null;
						
						System.out.println("Here are some options for you");
						System.out.println();
					    System.out.println("===============================");
					    System.out.println("1.  Ac Bus Service");
					    System.out.println("2.  Non Ac Bus Service");
						System.out.println("3.  Go Back");
						System.out.println("===============================");
						System.out.println();
						System.out.println("Which service do you want?");
						
						int type=pc.nextInt();
						
					System.out.println("Enter Bus Type:");
					String busType= pc.next();
					System.out.println("Enter Bus No:");
					String busNo= pc.next();
					System.out.println("Enter Boarding:");
					String boarding= pc.next();
					System.out.println("Enter Dropping:");
					String dropping= pc.next();
					System.out.println("Enter Date:");
					String date= pc.next();
					System.out.println("Enter Departuretime:"); 
					String departureTime= pc.next();
					System.out.println("Enter Ticket Price:");
					double ticketPrice= pc.nextDouble();
					System.out.println("Enter Ticket No:");
					int ticketNo= pc.nextInt();
					System.out.println("Enter Available ticket Quantity:");
					int ticketAvailableQuantity= pc.nextInt();
					
					if(type==1)
					{
						AcBus ac=new AcBus();
					ac.setBusType(busType);
					ac.setBusNo(busNo);
					ac.setBoarding(boarding);
					ac.setDropping(dropping);
					ac.setDate(date);
					ac.setDepartureTime(departureTime);
					ac.setTicketPrice(ticketPrice);
					ac.setTicketNo(ticketNo);
					ac.setTicketAvailableQuantity(ticketAvailableQuantity);
					b=ac;
					}
					
					else if(type==2)
					{
						NonAcBus nac=new NonAcBus();
					nac.setBusType(busType);
					nac.setBusNo(busNo);
					nac.setBoarding(boarding);
					nac.setDropping(dropping);
					nac.setDate(date);
					nac.setDepartureTime(departureTime);
					nac.setTicketPrice(ticketPrice);
					nac.setTicketNo(ticketNo);
					nac.setTicketAvailableQuantity(ticketAvailableQuantity);
					b=nac;
						
					}
					
					else if(type==3)
					{
						System.out.println("Going Back");
					}
					
					else
					{
						System.out.println("Invalid Input");
					}
					
					if(b!=null)
					{
						System.out.println("Enter Customer Phone Number:");
						int customerPhone1=pc.nextInt();
						br.getCustomer(customerPhone1).bookBus(b);
					}
					break;
						
						case 2:
						System.out.println("===============================================");
						System.out.println("You have selected  Cancel a Ticket for Customer");
						System.out.println("===============================================");
						
						System.out.println("Enter Customer Phone Number:");
						int customerPhone2=pc.nextInt();
						System.out.println("Enter Bus No:");
						String busNo2=pc.next();
						br.getCustomer(customerPhone2).cancelBus(br.getCustomer(customerPhone2).getBus(busNo2));
						break;
						
						case 3:
						System.out.println("======================================");
						System.out.println("You have selected Show All Book Ticket");
						System.out.println("======================================");
						
						System.out.println("Enter Customer Phone Number:");
						int customerPhone3=pc.nextInt();
						br.getCustomer(customerPhone3).showAllBuses();
						break;
						
						case 4:
					System.out.println("************************");
					System.out.println("Going Back");
					System.out.println("************************");
					again= false;
					System.out.println();
					break;
					
					default:
					System.out.println("************************");
					System.out.println("Invalid Option");
					System.out.println("************************");
					break; 
					
						
					}//switch(option3)
					
				
					break;
					
					case 4:
					    System.out.println("============================");
						System.out.println("You have selected Payment");
						System.out.println("============================"); 
						System.out.println();
						System.out.println("Here are some options for you");
						System.out.println("1. Credit Card");
						System.out.println("2. Debit Card"); 
						System.out.println("3. Bkash/Nagad ");
						System.out.println("4. Exit");
						System.out.println("============================");
					    System.out.println();
						
						System.out.println("************************");
						System.out.println("Enter YOur Option:");
						int option4=pc.nextInt();
						System.out.println("************************");
						
						switch(option4)
						{
							case 1:
							System.out.println("Enter Credit Card number: ");
							int cc=pc.nextInt();
							System.out.println("Enter Credit Card Pin: ");
							int ccp=pc.nextInt();
							System.out.println("Enter Amount: ");
							double amt=pc.nextDouble();
							System.out.println("Verifying.....");
							System.out.println("Payment Successful!");
							System.out.println("Thank you.");
							System.exit(0);
							
							case 2:
							System.out.println("Enter Debit Card number: ");
							int dc=pc.nextInt();
							System.out.println("Enter Debit Card Pin: ");
							int dcp=pc.nextInt();
							System.out.println("Enter Amount: ");
							double amt1=pc.nextDouble();
							System.out.println("Verifying.....");
							System.out.println("Payment Successful!");
							System.out.println("Thank you.");
							System.exit(0);
							
							case 3:
							System.out.println("Enter Bkash/Nagad number: ");
							int bn=pc.nextInt();
							System.out.println("Enter Bkash/Nagad Card Pin: ");
							int bnp=pc.nextInt();
							System.out.println("Enter Amount: ");
							double amt2=pc.nextDouble();
							System.out.println("Verifying.....");
							System.out.println("Payment Successful!");
							System.out.println("Thank you.");
							System.exit(0);
							
							case 4:
							System.exit(0);
							break;
							
							
						}// switch(option4)
						
			break; // case 4
			
			               case 5:
						   System.out.println("************************");
						   System.out.println("Special Thanks for using our application");
						   System.out.println("************************");
						   break;
			 
                           default:
						   System.out.println("************************");
						   System.out.println("Invalid Selection");
						   System.out.println("************************");
						   
						   break;
						   
			
				
			}//switch(choice)
			
			
		}// while
	}// static void main
	
}//class