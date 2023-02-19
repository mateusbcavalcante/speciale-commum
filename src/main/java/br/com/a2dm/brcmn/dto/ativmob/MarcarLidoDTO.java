package br.com.a2dm.brcmn.dto.ativmob;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MarcarLidoDTO {
    private ArrayList<String> events_ids;

    public ArrayList<String> getEventsIds() {
        return events_ids;
    }

    public void setEventsIds(ArrayList<String> eventsIds) {
        this.events_ids = eventsIds;
    }
}
