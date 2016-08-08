package br.com.adrianohardcore.base.atendimento;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.adrianohardcore.base.categoria.CategoriaEntity;
import br.com.adrianohardcore.base.motivo.MotivoEntity;
import br.com.adrianohardcore.base.utils.BaseEntity;

@Entity
@Table(name = "atendimento")
@AttributeOverride(name = "id", column = @Column(name = "id_atendimento"))
public class AtendimentoEntity extends BaseEntity<Long>  {

    private static final long serialVersionUID = 201602010251L;

    @Column(name = "id_tiposolicitante", nullable = false)
    private TipoSolicitanteEnum idTipoSolicitante;

    @Column(name = "id_status", nullable = true)
    private StatusAtendimentoEnum idStatus;

    @Column(name = "id_motivo", nullable = false)
    private MotivoEntity id_motivo;

    @Column(name = "id_categoria", nullable = true)
    private CategoriaEntity id_categoria;

    @NotNull
    @Size(min = 10, max = 60)
    @Column(name = "titulo", length = 60, nullable = false)
    private String titulo;

    @NotNull
    @Size(min = 10, max = 500)
    @Column(name = "descricao", length = 500, nullable = false)
    private String descricao;

    public AtendimentoEntity(TipoSolicitanteEnum idTipoSolicitante, StatusAtendimentoEnum idStatus, MotivoEntity id_motivo, CategoriaEntity id_categoria, String titulo, String descricao) {
        this.idTipoSolicitante = idTipoSolicitante;
        this.idStatus = idStatus;
        this.id_motivo = id_motivo;
        this.id_categoria = id_categoria;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public TipoSolicitanteEnum getIdTipoSolicitante() {
        return idTipoSolicitante;
    }

    public void setIdTipoSolicitante(TipoSolicitanteEnum idTipoSolicitante) {
        this.idTipoSolicitante = idTipoSolicitante;
    }

    public StatusAtendimentoEnum getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(StatusAtendimentoEnum idStatus) {
        this.idStatus = idStatus;
    }

    public MotivoEntity getId_motivo() {
        return id_motivo;
    }

    public void setId_motivo(MotivoEntity id_motivo) {
        this.id_motivo = id_motivo;
    }

    public CategoriaEntity getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(CategoriaEntity id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}