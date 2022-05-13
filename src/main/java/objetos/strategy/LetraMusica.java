/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.strategy;

/**
 *
 * @author Daniel_Korban
 */
public class LetraMusica implements EstruturaTexto{
    private String introducao;
    private String verso;
    private String preRefrao;
    private String refrao;
    private String ponte;

    public LetraMusica(String introducao, String verso, String preRefrao, String refrao, String ponte) {
        this.introducao = introducao;
        this.verso = verso;
        this.preRefrao = preRefrao;
        this.refrao = refrao;
        this.ponte = ponte;
    }

    @Override
    public String obterEstrutura() {
        return "letraMusica{" + "introducao=" + introducao + ", verso=" + verso + ", preRefrao=" + preRefrao + ", refrao=" + refrao + ", ponte=" + ponte + '}';
    }
    
}

/*
Intro. Como o início de um filme ou romance, a introdução de uma música deve chamar a atenção do ouvinte.
No entanto, deve fazer isso sem sobrecarregá-los. Por esse motivo, as introduções das músicas 
são normalmente mais lentas e discretas. O objetivo é estabelecer o ritmo, andamento e melodia da música
e apresentar a voz do cantor ou cantores.

Ver. O verso de uma música é uma chance de contar uma história.
Liricamente falando, é aqui que a história realmente se desenvolve e avança. Na maioria das músicas, 
o refrão e o pré-refrão geralmente usam a mesma letra todas as vezes, então o verso é sua chance de 
transmitir sua mensagem. Pode ser útil dividir a história que você deseja contar em duas e pensar 
sobre como o segundo versículo pode se basear no primeiro. Alguns compositores usam a segunda estrofe
como uma oportunidade para mudar ou subverter o significado do refrão, ou mesmo de toda a música com 
letras diferentes. É uma chance de ser criativo e explorar as diferentes emoções que você está tentando
despertar em seu ouvinte.

Pré refrão. Embora opcional, um pré-refrão ajuda a aumentar o impacto do refrão. Um pré-refrão 
geralmente contém uma progressão de acordes do verso ou do refrão, com base nessa familiaridade. É 
outra chance de experimentar - um pré-refrão pode utilizar diferentes harmonias, por exemplo, ou quebrar
o padrão da música.

Refrão. O refrão é a culminação de todas as grandes ideias em sua música. É frequentemente por isso 
que o título da música também aparece no refrão. É um resumo do que trata toda a música. O refrão 
normalmente também contém o gancho - a parte mais cativante da música. Os coros devem servir de clímax
para a música. Os versos e o pré-refrão servem para construir este momento único; portanto, o refrão 
deve refletir essa liberação de tensão.Ponte. 

A ponte normalmente acontece apenas uma vez no final de uma música, geralmente entre o segundo e o 
terceiro refrão. É uma mudança de ritmo na música - ela se destaca tanto liricamente quanto musicalmente.
O objetivo é tirar o ouvinte de seu devaneio e lembrá-la de que essa música é mais do que apenas 
repetição. Isso pode ser obtido por meio de algo como alternar para uma tonalidade relativa na mesma 
armadura de clave (por exemplo, de Lá menor para Dó maior) ou por meio de algo como um solo de guitarra.

Outro. Este é o fim da música. Um final deve sinalizar claramente ao ouvinte que a música está chegando
ao fim. Isso pode ser feito de várias maneiras, mas normalmente é conseguido fazendo o inverso da 
introdução - em outras palavras, diminuindo a velocidade. Na maioria das vezes, o outro costuma ser 
uma repetição do refrão com um fade-out lento.
*/