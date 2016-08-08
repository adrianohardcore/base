package br.com.adrianohardcore.base.atendimento;

public enum  StatusAtendimentoEnum {

    ABERTOSOLICITANTE("Aberto pelo solicitante", 1),
    ABERTOATENDENTE("Aberto pelo atendente", 2),
    RESPONDIDOSOLICITANTE("Respondido pelo solicitante", 3),
    RESPONDIDOATENDENTE("Respondido pelo atendente ", 4),
    CONCLUIDOSOLICITANTE("Concluído pelo solicitante", 5),
    CONCLUIDOATENDENTE("Concluído pelo atendente", 6);
    
    private String descricao;
    private int idStatusAtendimento;
    
	private StatusAtendimentoEnum(String descricao, int idStatusAtendimento) {
		this.setDescricao(descricao);
		this.setIdStatusAtendimento(idStatusAtendimento);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdStatusAtendimento() {
		return idStatusAtendimento;
	}

	public void setIdStatusAtendimento(int idStatusAtendimento) {
		this.idStatusAtendimento = idStatusAtendimento;
	}  
}