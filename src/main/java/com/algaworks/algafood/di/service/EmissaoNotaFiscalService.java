package com.algaworks.algafood.di.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void emitirNotaFiscal(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para cliente: " + event.getCliente().getNome());
    }

}
