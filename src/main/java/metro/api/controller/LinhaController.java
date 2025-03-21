package metro.api.controller;

import metro.api.DAO.ILinha;
import metro.api.Service.LinhaService;
import metro.api.model.Linha;
import metro.api.model.Metro;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@RequestMapping("/linhas")
public class LinhaController {

    @Autowired
    private ILinha dao;

    @GetMapping("")
    public List<Linha> listalinhas() {

        return (List<Linha>)dao.findAll();
    }

    @Autowired
    private LinhaService linhaService;

    @GetMapping("/{id_linha}")
    public List<String> obterEstacoes(@PathVariable Integer id_linha) {
        return linhaService.obterEstacoesPorLinha(id_linha);


    }


}
