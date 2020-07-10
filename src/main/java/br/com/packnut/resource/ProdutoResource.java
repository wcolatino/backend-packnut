package br.com.packnut.resource;

import java.util.List;

import br.com.packnut.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.packnut.repository.ProdutoRepository;

@CrossOrigin (origins = "*")
@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

	@Autowired
	ProdutoRepository produtoRepository;
	
	
	@GetMapping("/produtos")
	public List<Produto> listarProdutos (){
		return produtoRepository.findAll();
	}
	
	@GetMapping("produtos/{id}")
	public Produto listarProdutoId (@PathVariable (value = "id") long id) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	public void deletarProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	public Produto atualizarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}
