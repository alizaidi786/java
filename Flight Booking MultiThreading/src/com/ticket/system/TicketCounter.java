package com.ticket.system;

public class TicketCounter {
    int availableTickets = 5;
    public void bookTicket(String name, int numberOfSeats) {
    	if(numberOfSeats <= availableTickets) {
    		System.out.println("Hi ," + name + ": " + numberOfSeats + " seats successfully booked" );
    		availableTickets = availableTickets - numberOfSeats;
    	}
    	else {
    		System.out.println("Sorry " + name + ", " + "Seats are not available");
    	}
    }
}
