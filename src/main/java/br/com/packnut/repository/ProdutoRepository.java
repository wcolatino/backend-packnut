package br.com.packnut.repository;

import br.com.packnut.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findProdutoById(Long id);
}
