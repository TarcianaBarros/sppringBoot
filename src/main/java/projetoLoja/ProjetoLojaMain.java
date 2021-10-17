package projetoLoja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projetoLoja.dao.CategoriaDao;
import projetoLoja.enteties.Categoria;
import projetoLoja.enteties.Produto;
import projetoLoja.services.CategoriaServices;
import projetoLoja.services.ProdutoService;

import java.awt.*;

@SpringBootApplication
public class ProjetoLojaMain implements CommandLineRunner {

    @Autowired
    CategoriaServices categoriaServices;
    @Autowired
    ProdutoService produtoService;

    public static void main(String[] args) {
        SpringApplication.run(ProjetoLojaMain.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null,"Informática");
        Categoria cat2 = new Categoria(null, "Escritorio");
        Produto p1 = new Produto(null, "Computador", 2000);
        Produto p2  = new Produto(null, "Impressora", 800);
        Produto p3  = new Produto(null, "Mouse", 80);

        categoriaServices.salvar(cat1, cat2);
        produtoService.salvar(p1, p2, p3);

    }
}
