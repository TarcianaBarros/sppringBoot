package projetoLoja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoLoja.dao.CategoriaDao;
import projetoLoja.dao.ProdutoDao;
import projetoLoja.enteties.Categoria;
import projetoLoja.enteties.Produto;

@Service
public class CategoriaServices {
    @Autowired
    private CategoriaDao categoriaDao;

    public void salvar(Categoria categoria) {
        categoriaDao.save(categoria);
    }



    public void salvar(Categoria cat1, Categoria cat2) {
    }
}
