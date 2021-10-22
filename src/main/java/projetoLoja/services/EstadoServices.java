package projetoLoja.services;

import org.springframework.beans.factory.annotation.Autowired;
import projetoLoja.dao.CidadeDao;
import projetoLoja.dao.EstadoDao;
import projetoLoja.enteties.Cidade;
import projetoLoja.enteties.Estado;

public class EstadoServices {

    @Autowired
    private EstadoDao estadoDao;

    public void salvar (Estado estados) {
        estadoDao.save(estados);
    }

    public void salvar(Estado est1, Estado est2) {
    }
}
