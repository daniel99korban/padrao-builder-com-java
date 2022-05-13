package com.mycompany.aplicando_padrao_builder;

import objetos.Musica;
import objetos.Redacao;

/**
 * @author Daniel_Korban
 */
public class Aplicando_padrao_builder {
    
    public static void main(String[] args) {
        // classe diretor
        Diretor diretor = new Diretor();
        
        // construir um objeto Musica
        MusicaBuilder builderMusica = new MusicaBuilder();
        diretor.comporMusica(builderMusica);
        
        // construir um objeto Redação
        RedacaoBuilder builderRedacao = new RedacaoBuilder();
        diretor.escreverRedacao(builderRedacao);
        
        Musica musica = builderMusica.getResultado();
        System.out.println(musica);
        System.out.println("===========================");
        Redacao redacao = builderRedacao.getResultado();
        System.out.println(redacao);
        
    }
    
}
