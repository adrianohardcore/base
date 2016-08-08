package br.com.adrianohardcore.base.categoria;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.adrianohardcore.base.utils.BaseEntity;

@Entity
@Table(name = "categoria")
@AttributeOverride(name = "id", column = @Column(name = "id_categoria"))
public class CategoriaEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = 201602010251L;

    @NotNull
    @Size(min = 10, max = 60)
    @Column(name = "descricao", length = 60, nullable = false)
    private String descricao;

    public CategoriaEntity() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
