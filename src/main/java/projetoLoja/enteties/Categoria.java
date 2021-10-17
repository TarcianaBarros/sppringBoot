package projetoLoja.enteties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data //cria os getter e setter
@NoArgsConstructor // cria construtor vazio
@AllArgsConstructor //cria o construtor com os parametros
@Table(name = "CATEGORIA")
@Entity //indica que essa classe é uma entidade de dominio e vai corresponder a uma tabela
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, unique = false)
    //o nome da coluna é nome, ela não pode ser vazia, mas o nome pode ter mais de um igual
    private String nome;

    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA")
    @JoinColumn(name = "Categoria_id")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(Integer id, String nome) {
    }
}
