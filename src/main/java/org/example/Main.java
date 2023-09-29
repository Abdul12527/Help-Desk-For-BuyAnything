package org.example;

import org.example.Entities.ISupportTicket;
import org.example.Entities.RequestType;
import org.example.Entities.imp.DefaultSupportTicket;
import org.example.helpdesk.imp.DefaultHelpDesk;

public class Main {
    public static void main(String[] args) {
        DefaultHelpDesk defaultHelpDesk=new DefaultHelpDesk();
        defaultHelpDesk.addTicket(new DefaultSupportTicket(RequestType.CHANGE_ACCOUNT_DETAILS));
        defaultHelpDesk.addTicket(new DefaultSupportTicket(RequestType.OTHER));
        defaultHelpDesk.addTicket(new DefaultSupportTicket(RequestType.CAN_NOT_COMPLETE_PURCHASE));
        defaultHelpDesk.addTicket(new DefaultSupportTicket(RequestType.CAN_NOT_LOGIN));
        defaultHelpDesk.addTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));

        while (defaultHelpDesk.getNumberOfTickets()>0){
            ISupportTicket defaultSupportTicket= defaultHelpDesk.getNextTicket();
            System.out.println(defaultSupportTicket.getRequestType()+" "+defaultSupportTicket.getSequentialNumber());

        }
    }
}