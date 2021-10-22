package projetoLoja.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetoLoja.enteties.Cidade;
import projetoLoja.enteties.Estado;

@Repository
public interface EstadoDao extends JpaRepository<Estado, Integer> {
    Estado findById(String nome); // perguntar pq inseriu isso?
}
