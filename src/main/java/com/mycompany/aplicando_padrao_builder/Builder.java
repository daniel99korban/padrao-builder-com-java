package com.mycompany.aplicando_padrao_builder;
/**
 * @author Daniel_Korban
 * 
 * A Interface Builder define todas as possiveis maneiras de configurar o produto
 */
public interface Builder {
    // esses paramentros podem ser instâncias de classe
    void inserirTema(String tema);
    void inserirPalavrasChave(String palavras);
    // StruturaText = intro, part1, part2... refrão(musica)
    // StruturaText = intro, desen1, desen2... conclusão(redação)
    void montarComposicao(StruturaText estruturaText);
    void descrever();//falar sobre o trabalho feito(musica, poema, artigo ou redação).
}

// seguir implemntação em: https://refactoring.guru/pt-br/design-patterns/builder/java/example