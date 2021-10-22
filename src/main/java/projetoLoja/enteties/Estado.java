package projetoLoja.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String nome;

    @OneToMany(mappedBy = "estado") //mapeamento reverso um estado p/ varias cidades
    private List<Cidade> cidades = new ArrayList<>();

    public Estado(Integer id, String nome){

    }
    //falta o hashcode equals
}
