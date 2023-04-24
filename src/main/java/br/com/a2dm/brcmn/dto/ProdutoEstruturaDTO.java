package br.com.a2dm.brcmn.dto;

public class ProdutoEstruturaDTO {
	
	private IdentDTO identDTO;

	public ProdutoEstruturaDTO(IdentDTO identDTO) {
		super();
		this.identDTO = identDTO;
	}

	public IdentDTO getIdentDTO() {
		return identDTO;
	}

	public void setIdentDTO(IdentDTO identDTO) {
		this.identDTO = identDTO;
	}
	
}
