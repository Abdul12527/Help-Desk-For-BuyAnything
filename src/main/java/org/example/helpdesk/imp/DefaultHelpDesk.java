package org.example.helpdesk.imp;

import org.example.Entities.ISupportTicket;
import org.example.Entities.Priority;
import org.example.helpdesk.IHelpDesk;

import java.util.PriorityQueue;

public class DefaultHelpDesk implements IHelpDesk {
    private PriorityQueue<ISupportTicket> tickets;
    public DefaultHelpDesk(){
        tickets=new PriorityQueue<>((ticket1,ticket2)->{
            if (ticket1 == null || ticket2 == null || ticket1.getPriority() == null ||
                    ticket2.getPriority() == null) {
                return 0;
            }
            int result = ticket2.getPriority().compareTo(ticket1.getPriority());
            if (result == 0) {
                result = ticket1.getSequentialNumber() - ticket2.getSequentialNumber();
            }
            return result;
        });
    }
    @Override
    public void addTicket(ISupportTicket supportTicket) {
        tickets.add(supportTicket);
    }

    @Override
    public ISupportTicket getNextTicket() {
        return tickets.poll();
    }

    @Override
    public int getNumberOfTickets() {
        return tickets.size();
    }
}
