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
@Table(name = "Produtos")
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String nome;

    @Column(name = "PREÇO", nullable = false, unique = false)
    private double preco;
    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA")
    @JoinColumn(name = "Produto_id")
    private List<Categoria> categorias = new ArrayList<>();

    public Produto(Integer id, String nome, double preco) {
    }
}
