package br.com.adrianohardcore.base.atendimento;

public enum TipoSolicitanteEnum {

    CLIENTE("Cliente", 1),
    FORNECEDOR("Fornecedor", 2),
    FUNCIONARIO("Funcionario", 3),
    PROFISSIONAL("Profissional", 4);

    private String descricao;
    private String idTipoSolicitante;


    TipoSolicitanteEnum(String descricao, String idTipoAtendimento) {
        this.descricao = descricao;
        this.idTipoAtendimento = idTipoAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdTipoSolicitante() {
        return idTipoSolicitante;
    }

    public void setIdTipoSolicitante(String idTipoSolicitante) {
        this.idTipoSolicitante = idTipoSolicitante;
    }
}