package projetoLoja.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String nome;

    @ManyToOne //muitas cidades para um estado
    @JoinTable(name = "ESTADO_CIDADE")
    @JoinColumn(name = "estado_id")
    private Estado estado;
}
