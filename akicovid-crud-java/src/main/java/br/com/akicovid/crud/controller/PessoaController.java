package br.com.akicovid.crud.controller;

import br.com.akicovid.crud.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import br.com.akicovid.crud.model.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lista")
@AllArgsConstructor
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    @GetMapping
    public @ResponseBody List<Pessoa> lista(){
        return pessoaRepository.findAll();
    }

    @PostMapping
    public void adicionar (@RequestBody Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }
}











