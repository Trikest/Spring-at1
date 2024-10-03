package com.example.demo.Controller;

import com.example.demo.Model.Pessoa;
import com.example.demo.Repo.PessoaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class PessoaController {
    @Autowired
    PessoaRepo repo;
    @PostMapping("/addPessoa")
    public void addPessoa(@RequestBody Pessoa pessoa){
        repo.save(pessoa);
        System.out.println("Pessoa recebida: " + pessoa);

    }
    @GetMapping("/pessoaList")
    public ModelAndView index() throws ExecutionException, InterruptedException {
        List<Pessoa> pessoas = this.repo.findAll();
        ModelAndView mav = new ModelAndView("/react/pessoas");
        mav.addObject("pessoas", pessoas);
        return mav;
    }


}
