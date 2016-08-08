package br.com.adrianohardcore.categoria;

@Entity
@Table(name = "categoria")
@AttributeOverride(name = "id", column = @Column(name = "id_categoria"))
public class CategoriaEntity extends BaseEntity<Long> extends BaseLogEntity {

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
