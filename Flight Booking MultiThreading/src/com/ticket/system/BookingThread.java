package com.ticket.system;

public class BookingThread extends Thread {
    private TicketCounter ticketCounter;
    private String name;
    private int tickets;
    
    public BookingThread(TicketCounter ticketCounter, String name, int tickets) {
    	this.ticketCounter = ticketCounter;
    	this.name = name;
    	this.tickets = tickets;
    }
    
    public void run() {
    	ticketCounter.bookTicket(name, tickets);
    }
}
