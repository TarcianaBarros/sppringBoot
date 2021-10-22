package projetoLoja.services;

import org.springframework.beans.factory.annotation.Autowired;
import projetoLoja.dao.CategoriaDao;
import projetoLoja.dao.CidadeDao;
import projetoLoja.enteties.Categoria;
import projetoLoja.enteties.Cidade;

public class CidadeServices {

    @Autowired
    private CidadeDao cidadeDao;

    public void salvar(Cidade cidades) {
        cidadeDao.save(cidades);
    }

    public void salvar(Cidade c1, Cidade c2, Cidade c3) {
    }
}
