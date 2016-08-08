package br.com.adrianohardcore.base.motivo;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.adrianohardcore.base.utils.BaseEntity;

@Entity
@Table(name = "motivo")
@AttributeOverride(name = "id", column = @Column(name = "id_motivo"))
public class MotivoEntity extends BaseEntity<Long>  {

    private static final long serialVersionUID = 201602010251L;

    @NotNull
    @Size(min = 10, max = 60)
    @Column(name = "descricao", length = 60, nullable = false)
    private String descricao;

    public MotivoEntity() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}