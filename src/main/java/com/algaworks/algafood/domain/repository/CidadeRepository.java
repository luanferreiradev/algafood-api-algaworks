package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.Permissao;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> listar();

    Cidade salvar(Cidade cidade);

    Cidade buscar(Long id);

    void remover(Cidade cidade);

}
