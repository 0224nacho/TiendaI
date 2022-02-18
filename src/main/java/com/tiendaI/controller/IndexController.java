package com.tiendaI.controller;

import com.tiendaI.dao.ClienteDao;
import com.tiendaI.model.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    
    @Autowired
    private ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Se muestra la pagina index de templates");
        

        
        var clientes = clienteDao.findAll();
        
        model.addAttribute("clientes", clientes);
       
        return "index";
    }
}