package br.com.a2dm.brcmn.dto.ativmob;

import java.util.List;

public class MarcarLidoDTO {
	
    private List<String> events_ids;

    public List<String> getEventsIds() {
        return events_ids;
    }

    public void setEventsIds(List<String> eventsIds) {
        this.events_ids = eventsIds;
    }
}
