package metro.api.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table (name = "tb_metro")
public class Metro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_METRO")
    private Integer Id;
    @Column(name = "NM_ESTACAO")
    private String Nome_Estacao;
    @Column(name = "ATIVO")
    private Boolean Ativo;

    public Metro(Integer id, String nome_Estacao, Boolean ativo) {
        Id = id;
        Nome_Estacao = nome_Estacao;
        Ativo = ativo;
    }

    public Metro() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome_Estacao() {
        return Nome_Estacao;
    }

    public void setNome_Estacao(String nome_Estacao) {
        Nome_Estacao = nome_Estacao;
    }

    public Boolean getAtivo() {
        return Ativo;
    }

    public void setAtivo(Boolean ativo) {
        Ativo = ativo;
    }
}
