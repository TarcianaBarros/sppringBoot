package projetoLoja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoLoja.dao.ProdutoDao;
import projetoLoja.enteties.Produto;

import javax.persistence.Entity;


@Service
public class ProdutoService {
    public void salvar() {
    }

    @Autowired
    private ProdutoDao produtoDao;

    public void salvar(Produto produto){
        produtoDao.save(produto);
    }

    public void salvar(Produto p1, Produto p2, Produto p3) {
    }
}
