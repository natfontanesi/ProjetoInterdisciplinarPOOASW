package com.switchmarket;

import com.switchmarket.Entities.Usuario;
import com.switchmarket.Enums.estadoEnum;
import com.switchmarket.Repositories.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepo usuarioRepo;

    @GetMapping("/usuarios")
    public ModelAndView users(){
        List<Usuario> usuarios = (List<Usuario>) this.usuarioRepo.findAll();
        ModelAndView mv = new ModelAndView("usuarios");
        mv.addObject("usuarios", usuarios);

        return mv;

    }

    @GetMapping("/usuarios/novo")
    public ModelAndView newUser(){

        ModelAndView mv = new ModelAndView("usuario/novo");
        mv.addObject("estado", estadoEnum.values());
        return mv;

    }
}
