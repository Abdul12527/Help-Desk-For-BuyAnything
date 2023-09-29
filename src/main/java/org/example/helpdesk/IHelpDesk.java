package org.example.helpdesk;

import org.example.Entities.ISupportTicket;

public interface IHelpDesk {
    void  addTicket(ISupportTicket supportTicket);
    ISupportTicket getNextTicket();
    int getNumberOfTickets();
}
