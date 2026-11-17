package com.algaworks.algafood.domain.exceptionHandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    MENSAGEM_IMCOMPREENSIVEL("/mensagem-imcompreensivel", "Mensagem imcompreensível"),
    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado"),
    ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
    ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
    PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido"),
    ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema"),
    DADOS_INVALIDOS("/dados-invalidos","Dados inválidos");

    private String title;
    private String uri;

    ProblemType(String path, String title) {
        this.title =  title;
        this.uri = "https://algafood.com.br" + path;
    }

}
