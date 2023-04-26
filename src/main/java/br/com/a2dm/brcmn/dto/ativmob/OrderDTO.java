package br.com.a2dm.brcmn.dto.ativmob;

import java.util.ArrayList;
import java.util.Date;


public class OrderDTO {
    private int maxNumEvents;
    private Date startDateTime;
    private ArrayList<EventDTO> events;
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

    public ArrayList<EventDTO> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<EventDTO> events) {
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

