package com.mycompany.aplicando_padrao_builder;

import objetos.Musica;
import objetos.strategy.EstruturaTexto;

/**
 * @author Daniel_Korban
 */
public class MusicaBuilder implements Builder{
    
    private String tema;
    private String palavras;
    private EstruturaTexto estruturaMusica;
    private String descricao;

    @Override
    public void inserirTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void inserirPalavrasChave(String palavras) {
        this.palavras = palavras;
    }

    @Override
    public void montarComposicao(EstruturaTexto estruturaMusica) {
        this.estruturaMusica = estruturaMusica;
    }

    @Override
    public void descrever(String descricao) {
        this.descricao = descricao;
    }
    
    public Musica getResultado(){
        return new Musica(tema, palavras, estruturaMusica, descricao);
    }
    
}
