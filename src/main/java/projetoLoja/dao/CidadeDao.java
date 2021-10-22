package projetoLoja.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoLoja.enteties.Categoria;
import projetoLoja.enteties.Cidade;

@Repository
public interface CidadeDao extends JpaRepository<Cidade, Integer> {

        Cidade findById(String nome); // perguntar pq inseriu isso?
}
