package metro.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_LINHA")
public class Linha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LINHA")
    private Integer Id;
    @Column(name = "NM_COR")
    private String Nome_Cor;
    @Column(name = "CAPACIDADE")
    private Integer Capacidade;

    public Linha(Integer id, String nome_Cor, Integer capacidade) {
        Id = id;
        Nome_Cor = nome_Cor;
        Capacidade = capacidade;
    }

    public Linha() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome_Cor() {
        return Nome_Cor;
    }

    public void setNome_Cor(String nome_Cor) {
        Nome_Cor = nome_Cor;
    }

    public Integer getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        Capacidade = capacidade;
    }
}