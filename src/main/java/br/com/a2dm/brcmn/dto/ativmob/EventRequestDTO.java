package br.com.a2dm.brcmn.dto.ativmob;

import java.util.List;

public class EventRequestDTO {
	
    private List<EventDTO> events;
    
    private Integer resultCode;
    
    private String resultMsg;

	public List<EventDTO> getEvents() {
		return events;
	}

	public void setEvents(List<EventDTO> events) {
		this.events = events;
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
}
