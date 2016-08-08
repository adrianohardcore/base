package br.com.adrianohardcore.base.atendimento;

public enum StatusAtendimentoEnum {

    ABERTOSOLICITANTE("Aberto pelo solicitante", 1),
    ABERTOATENDENTE("Aberto pelo atendente", 2),
    RESPONDIDOSOLICITANTE("Respondido pelo solicitante", 3),
    RESPONDIDOATENDENTE("Respondido pelo atendente ", 4),
    CONCLUIDOSOLICITANTE("Concluído pelo solicitante", 5),
    CONCLUIDOATENDENTE("Concluído pelo atendente", 6);

    private String descricao;
    private String idStatusAtendimento;


    StatusAtendimentoEnum(String descricao, String idStatusAtendimento) {
        this.descricao = descricao;
        this.idStatusAtendimento = idStatusAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdStatusAtendimento() {
        return idStatusAtendimento;
    }

    public void setIdStatusAtendimento(String idStatusAtendimento) {
        this.idStatusAtendimento = idStatusAtendimento;
    }
}