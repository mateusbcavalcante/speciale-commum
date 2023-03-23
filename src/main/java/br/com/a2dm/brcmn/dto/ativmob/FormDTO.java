package br.com.a2dm.brcmn.dto.ativmob;

public class FormDTO {

    private String type;
    private String label;
    private String url;
    private String value;
    private String codigo;
    private String integ_id;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getInteg_id() {
		return integ_id;
	}

	public void setInteg_id(String integ_id) {
		this.integ_id = integ_id;
	}
   
}
