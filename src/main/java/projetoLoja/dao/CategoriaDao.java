package projetoLoja.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoLoja.enteties.Categoria;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Integer> {
    Categoria findById(String nome);

}
