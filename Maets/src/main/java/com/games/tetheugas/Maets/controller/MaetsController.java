package com.games.tetheugas.Maets.controller;


import com.games.tetheugas.Maets.model.Jogo;
import com.games.tetheugas.Maets.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class MaetsController {


    @Autowired
    private JogoRepository jr;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String abrirIndex() {

        return "/index";
    }


    @GetMapping(value = "/registerGames")
    public String cadastrarJogos() {
        return "/jogo/formJogo";
    }


    @PostMapping(value = "/registerGames")
    public String form(Jogo jogo, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos...");
            return "redirect:/registerGames";
        }

        jr.save(jogo);
        attributes.addFlashAttribute("mensagem", "Jogo criado com sucesso!");
        return "redirect:/registerGames";
    }


    @RequestMapping("/deletarJogo")
    public String deletarJogo(long id) {
        Jogo jogo = jr.findById(id);
        jr.delete(jogo);
        return "redirect:/games";
    }

    @RequestMapping("/games")
    public ModelAndView listaJogos() {
        ModelAndView mv = new ModelAndView("jogo/listaJogo");
        Iterable<Jogo> jogos = jr.findAll();
        mv.addObject("listaJogos", jogos);
        return mv;
    }
    @GetMapping("/updateGame")
    public ModelAndView editarJogo(long id) {
        ModelAndView mv = new ModelAndView("jogo/update-jogo");
        Jogo jogo = jr.findById(id);
        mv.addObject("jogo", jogo);
        return mv;
    }
    @PostMapping("/updateGame")
    public String postUpdateJogo(@Validated Jogo jogo) {
        jr.save(jogo);

        long code = jogo.getId();
        String codes = "" + code;
        return "redirect:/";
    }



}
