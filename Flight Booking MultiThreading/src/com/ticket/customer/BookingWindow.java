package com.ticket.customer;

import com.ticket.system.BookingThread;
import com.ticket.system.TicketCounter;

public class BookingWindow {

	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
		BookingThread b1 = new BookingThread(ticketCounter, "Ali", 5);
		BookingThread b2 = new BookingThread(ticketCounter, "Rahul", 5);
		
		b1.start();
//		try{ 
//			Thread.sleep(1);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		b2.start();
	}

}
