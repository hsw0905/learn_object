package me.hsw;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketOffice.getTicket(); // 외부에서 ticketOffice에 접근 불가
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFree());
            ticketOffice.plusAmount(ticket.getFree());
            audience.getBag().setTicket(ticket);
        }
    }
}
