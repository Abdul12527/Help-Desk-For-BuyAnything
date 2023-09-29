package org.example.Entities.imp;

import org.example.Entities.ISupportTicket;
import org.example.Entities.Priority;
import org.example.Entities.RequestType;

public class DefaultSupportTicket implements ISupportTicket {
    private static int counter;

    private RequestType requestType;
    private int sequentialNumber;

    {
        sequentialNumber = ++counter;
    }

    public DefaultSupportTicket(RequestType requestType) {
        this.requestType = requestType;
    }

    public DefaultSupportTicket() {
    }

    @Override
    public Priority getPriority() {
        if(requestType==null)return null;
        return requestType.getPriority();
    }

    @Override
    public int getSequentialNumber() {
        return sequentialNumber;
    }

    @Override
    public RequestType getRequestType() {
        return requestType;
    }
}
