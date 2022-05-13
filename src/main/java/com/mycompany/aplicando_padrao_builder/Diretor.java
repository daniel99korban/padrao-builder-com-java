package com.mycompany.aplicando_padrao_builder;

import objetos.strategy.EstruturaTexto;
import objetos.strategy.LetraMusica;
import objetos.strategy.TextoRedacao;

/**
 * @author Daniel_Korban
 */
public class Diretor {
    
    public void comporMusica(Builder builder) {
        builder.inserirTema("Primavera");
        builder.inserirPalavrasChave("primavera, flores, romantico, musica");
        builder.montarComposicao(new LetraMusica("introdução", "verso", "pré-refrao", "refrão", "ponte"));
        builder.descrever("Música feita em homenagem a época das flores");
    }
    
    public void escreverRedacao(Builder builder){
        builder.inserirTema("Mobilidade urbana");
        builder.inserirPalavrasChave("mobilidade,saneamento,urbanização,acessibilidade");
        builder.montarComposicao(new TextoRedacao("introdução", "desenvolvimento1", "desenvolvimento2", "conclusão"));
        builder.descrever("Redação cujo tema se refere a mobilidade urbana");
    }
    
}
