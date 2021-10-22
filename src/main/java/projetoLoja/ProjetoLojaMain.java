package projetoLoja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projetoLoja.dao.CategoriaDao;
import projetoLoja.dao.CidadeDao;
import projetoLoja.dao.EstadoDao;
import projetoLoja.enteties.Categoria;
import projetoLoja.enteties.Cidade;
import projetoLoja.enteties.Estado;
import projetoLoja.enteties.Produto;
import projetoLoja.services.CategoriaServices;
import projetoLoja.services.CidadeServices;
import projetoLoja.services.EstadoServices;
import projetoLoja.services.ProdutoService;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ProjetoLojaMain implements CommandLineRunner {

    @Autowired
    CategoriaServices categoriaServices;
    @Autowired
    ProdutoService produtoService;
    @Autowired
    CidadeServices cidadeServices;
    @Autowired
    EstadoServices estadoServices;

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

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "Pernambuco");

        Cidade c1 = new Cidade(null, "Uberlândia", est1);
        Cidade c2 = new Cidade(null, "Recife", est2);
        Cidade c3 = new Cidade(null, "Bezerros", est2);

        est1.getCidades().addAll(Arrays.asList(c1));
        est2.getCidades().addAll(Arrays.asList(c2, c3));
        categoriaServices.salvar(cat1, cat2);
        produtoService.salvar(p1, p2, p3);
        estadoServices.salvar(est1, est2);
        cidadeServices.salvar(c1, c2, c3);

    }
}
