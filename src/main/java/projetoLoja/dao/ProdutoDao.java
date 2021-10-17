package projetoLoja.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoLoja.enteties.Produto;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Integer> {
    Produto findById(String nome);

}
