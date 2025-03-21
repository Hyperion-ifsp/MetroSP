package metro.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import metro.api.DAO.IUsuario;
import metro.api.model.Usuario;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public List<Usuario> listausuarios() {

        return (List<Usuario>)dao.findAll();
    }


}
