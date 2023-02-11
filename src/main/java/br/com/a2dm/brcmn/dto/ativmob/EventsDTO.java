package br.com.a2dm.brcmn.dto.ativmob;

import java.util.Date;
import java.util.List;

public class EventsDTO {
    private int maxNumEvents;
    private Date startDateTime;
    private List<EventDTO> events;
    private int resultCode;
    private String resultMsg;

    public int getMaxNumEvents() {
        return maxNumEvents;
    }

    public void setMaxNumEvents(int maxNumEvents) {
        this.maxNumEvents = maxNumEvents;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public List<EventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<EventDTO> events) {
        this.events = events;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}

