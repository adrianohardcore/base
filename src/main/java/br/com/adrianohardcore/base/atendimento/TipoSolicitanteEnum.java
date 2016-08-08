package br.com.adrianohardcore.base.atendimento;

public enum TipoSolicitanteEnum {

    CLIENTE("Cliente", 1),
    FORNECEDOR("Fornecedor", 2),
    FUNCIONARIO("Funcionario", 3),
    PROFISSIONAL("Profissional", 4);
    
    private String descricao;
    private int idTipoSolicitante;
    
    private TipoSolicitanteEnum(String descricao, int idTipoSolicitante) {
		this.descricao = descricao;
		this.idTipoSolicitante = idTipoSolicitante;
	}
    
    
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getIdTipoSolicitante() {
		return idTipoSolicitante;
	}
	public void setIdTipoSolicitante(int idTipoSolicitante) {
		this.idTipoSolicitante = idTipoSolicitante;
	}

    
    


 
}