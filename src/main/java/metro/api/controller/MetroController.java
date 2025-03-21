package metro.api.controller;

import metro.api.DAO.IMetro;
import metro.api.Service.MetroService;
import metro.api.model.Metro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequestMapping("/metros")
@RestController
public class MetroController {

    @Autowired
    private IMetro dao;


    @GetMapping("")
    public List<Metro> listametros() {

        return (List<Metro>)dao.findAll();
    }

    @Autowired
    private MetroService metroService;

    @GetMapping("/{id_metro}")

    public List<String> obterEstacao(@PathVariable Integer id_metro) {

        return metroService.obterMetroComLinhasAgrupado(id_metro);

    }
}
