/**
 * User: phmiranda
 * Project: packnut
 * Description: this class execute...!
 * Date: 10/07/2020
 */

package br.com.packnut.controller;

import br.com.packnut.entity.Produto;
import br.com.packnut.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> index() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    @GetMapping("/{id}")
    public Produto pesquisarId(@PathVariable Long id) {
        Produto produto = produtoRepository.getOne(id);
        return produto;
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produtoEntity, UriComponentsBuilder uriComponentsBuilder) {
        Produto produto = produtoRepository.save(produtoEntity);
        URI uri = uriComponentsBuilder.path("/produtos/{id}").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.created(uri).body(new Produto());
    }

    @DeleteMapping
    public void deletar() {

    }

    @PutMapping
    public Produto atualizar(){

    }
}
