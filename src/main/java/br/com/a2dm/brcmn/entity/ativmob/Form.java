package br.com.a2dm.brcmn.entity.ativmob;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "tb_ativmob_form", schema="ped")
@SequenceGenerator(name = "SQ_FORM", sequenceName = "SQ_FORM", allocationSize = 1)
@Proxy(lazy = true)
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FORM")
    @Column(name = "id_form")
    private BigInteger idForm;

    @Column(name = "type")
    private String type;

    @Column(name = "label")
    private String label;

    @Column(name = "url")
    private String url;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public BigInteger getIdForm() {
        return idForm;
    }

    public void setIdForm(BigInteger idForm) {
        this.idForm = idForm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
