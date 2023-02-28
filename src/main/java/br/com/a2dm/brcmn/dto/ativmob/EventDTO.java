package br.com.a2dm.brcmn.dto.ativmob;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class EventDTO {
    private String storeCNPJ;
    private BigInteger event_id;
    private String event_code;
    private String event_title;
    private Date event_dth;
    private String order_number;
    private String invoice_number;
    private String agent_code;
    private String agent_name;
    private String lat;
    private String lng;
    private String codigo_roteiro;
    private String link_rastreamento;
    private ArrayList<FormDTO> forms;

    public String getStoreCNPJ() {
        return storeCNPJ;
    }

    public void setStoreCNPJ(String storeCNPJ) {
        this.storeCNPJ = storeCNPJ;
    }

    public BigInteger getEvent_id() {
        return event_id;
    }

    public void setEvent_id(BigInteger event_id) {
        this.event_id = event_id;
    }

    public String getEvent_code() {
        return event_code;
    }

    public void setEvent_code(String event_code) {
        this.event_code = event_code;
    }

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public Date getEvent_dth() {
        return event_dth;
    }

    public void setEvent_dth(Date event_dth) {
        this.event_dth = event_dth;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getAgent_code() {
        return agent_code;
    }

    public void setAgent_code(String agent_code) {
        this.agent_code = agent_code;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getCodigo_roteiro() {
        return codigo_roteiro;
    }

    public void setCodigo_roteiro(String codigo_roteiro) {
        this.codigo_roteiro = codigo_roteiro;
    }

    public String getLink_rastreamento() {
        return link_rastreamento;
    }

    public void setLink_rastreamento(String link_rastreamento) {
        this.link_rastreamento = link_rastreamento;
    }

    public ArrayList<FormDTO> getForms() {
        return forms;
    }

    public void setForm(ArrayList<FormDTO> forms) {
        this.forms = forms;
    }
}
