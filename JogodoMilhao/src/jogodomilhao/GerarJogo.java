package jogodomilhao;

public class GerarJogo {

    private Pergunta perguntas1k[];
    private Pergunta perguntas5k[] = new Pergunta[3];
    private Pergunta perguntas10k[] = new Pergunta[3];
    private Pergunta perguntas25k[] = new Pergunta[3];
    private Pergunta perguntas50k[] = new Pergunta[3];
    private Pergunta perguntas100k[] = new Pergunta[3];
    private Pergunta perguntas250k[] = new Pergunta[3];
    private Pergunta perguntas500k[] = new Pergunta[3];
    private Pergunta perguntas750k[] = new Pergunta[3];
    private Pergunta perguntas1M[] = new Pergunta[3];
    

    public void gerar() {
        
        //PERGUNTAS DE 1000
        Pergunta p = new Pergunta();
        p.setEnunciado("Onde está localizado o museu do louvre?");

        p.setItens(new String[]{"A)Paris ", "B)Roma", "C)Madri", "D)Londres"});
        p.setResposta("A");
        p.setValor(1000);

        Pergunta p1 = new Pergunta();
        p1.setEnunciado("Quando ocorreu a abertura dos portos brasileiros por D. João VI?");

        p1.setItens(new String[]{"A)1808","B)1822","C)1792","D)1530"});
        p1.setResposta("A");
        p1.setValor(1000);
        
         Pergunta p2 = new Pergunta();
        p2.setEnunciado("Em qual andar está o apartamento que está três andares acima do do décimo?");

        p2.setItens(new String[]{"A)vigésimo","B)décimo terceiro","C)décimo oitavo","D)sétimo"});
        p2.setResposta("B");
        p2.setValor(1000);

        perguntas1k = new Pergunta[]{p, p1, p2};
        
        Pergunta p3 = new Pergunta();
        p3.setEnunciado("Um carro gasta 40 litros de gasolina para rodar 400.000 metros. Quantos quilômetros ele roda por litro?");

        p3.setItens(new String[]{"A)10","B)12","C)40","D)20"});
        p3.setResposta("C");
        p3.setValor(5000);
        
         Pergunta p4 = new Pergunta();
        p3.setEnunciado("Qual dia ficou conhecido no brasil como “dia do fico”?");

        p4.setItens(new String[]{"A)15 de agosto","B)19 de janeiro","C)9 de agosto","D)9 de janeiro"});
        p4.setResposta("D");
        p4.setValor(5000);
        
         Pergunta p5 = new Pergunta();
        p5.setEnunciado("Qual a capital da Califórnia nos Estados Unidos?");

        p5.setItens(new String[]{"A)Washington","B)Nova York","C)Orlando","D)Sacramento"});
        p5.setResposta("D");
        p5.setValor(5000);
        
        perguntas5k = new Pergunta[]{p3, p4, p5};
        
        Pergunta p6 = new Pergunta();
        p6.setEnunciado("Capixaba é a palavra que define os nascidos em:");

        p6.setItens(new String[]{"A)Rio Grande do Sul","B)Paraíba","C)Espírito Santo","D)Ceará"});
        p6.setResposta("C");
        p6.setValor(10000);
        
        Pergunta p7 = new Pergunta();
        p3.setEnunciado("Quanto é 6x8?");

        p7.setItens(new String[]{"A)63","B)52","C)68","D)48"});
        p7.setResposta("D");
        p7.setValor(10000);
        
        Pergunta p8 = new Pergunta();
        p8.setEnunciado("Dez dúzias correspondem a quantas unidades?");

        p8.setItens(new String[]{"A)120 unidades","B)100 unidades","C)60 unidades","D)96 unidades"});
        p8.setResposta("A");
        p8.setValor(10000);
        
        perguntas10k = new Pergunta[]{p6, p7, p8};
        
         Pergunta p9 = new Pergunta();
        p9.setEnunciado("Joana D’arc foi uma heroína:");

        p9.setItens(new String[]{"A)Inglesa","B)Francesa","C)Italiana","D)Portuguesa"});
        p9.setResposta("B");
        p9.setValor(25000);
        
        Pergunta p10 = new Pergunta();
        p10.setEnunciado("O que significa “Colosso”?");

        p10.setItens(new String[]{"A)Osso colorido","B)Objetos de grandes dimensões","C)Coletivo de ossos","D)Líquido Grosso"});
        p10.setResposta("B");
        p10.setValor(25000);
        
        Pergunta p11 = new Pergunta();
        p11.setEnunciado("Procrastinar significa…");

        p11.setItens(new String[]{"A)Ter muitos filhos","B)Prevenir","C)Adiar","D)Procurar com afinco"});
        p11.setResposta("C");
        p11.setValor(25000);
        
        perguntas25k = new Pergunta[]{p9, p10, p11};
        
        Pergunta p12 = new Pergunta();
        p12.setEnunciado("Onde está o Ubequistão?");

        p12.setItens(new String[]{"A)Ásia Central","B)África","C)América do Sul","D)Antártica"});
        p12.setResposta("A");
        p12.setValor(50000);
        
        Pergunta p13 = new Pergunta();
        p13.setEnunciado("Beisebol e Basquete são esportes populares de qual país ?");

        p13.setItens(new String[]{"A)Estados Unidos","B)Brasil","C)França","D)Singapura"});
        p13.setResposta("A");
        p13.setValor(50000);
        
         Pergunta p14 = new Pergunta();
        p14.setEnunciado("");

        p14.setItens(new String[]{"A)","B)","C)","D)"});
        p14.setResposta("");
        p14.setValor(50000);
        
        perguntas50k = new Pergunta[]{p12, p13, p14}; //50K
        
        Pergunta p15 = new Pergunta();
        p15.setEnunciado("");

        p15.setItens(new String[]{"A)","B)","C)","D)"});
        p15.setResposta("");
        p15.setValor(100000);
        
        Pergunta p16 = new Pergunta();
        p15.setEnunciado("");

        p16.setItens(new String[]{"A)","B)","C)","D)"});
        p16.setResposta("");
        p16.setValor(100000);
        
        Pergunta p17 = new Pergunta();
        p17.setEnunciado("");

        p17.setItens(new String[]{"A)","B)","C)","D)"});
        p17.setResposta("");
        p17.setValor(100000);
        
        perguntas100k = new Pergunta[]{p15, p16, p17}; //100K
        
        Pergunta p18 = new Pergunta();
        p18.setEnunciado("");

        p18.setItens(new String[]{"A)","B)","C)","D)"});
        p18.setResposta("");
        p18.setValor(250000);
        
        Pergunta p19 = new Pergunta();
        p19.setEnunciado("");

        p19.setItens(new String[]{"A)","B)","C)","D)"});
        p19.setResposta("");
        p19.setValor(250000);
        
        Pergunta p20 = new Pergunta();
        p20.setEnunciado("");

        p20.setItens(new String[]{"A)","B)","C)","D)"});
        p20.setResposta("");
        p20.setValor(250000);
        
        perguntas250k = new Pergunta[]{p18, p19, p20}; //250K
        
        Pergunta p21 = new Pergunta();
        p21.setEnunciado("");

        p21.setItens(new String[]{"A)","B)","C)","D)"});
        p21.setResposta("");
        p21.setValor(500000);
         
        Pergunta p22 = new Pergunta();
        p22.setEnunciado("");

        p22.setItens(new String[]{"A)","B)","C)","D)"});
        p22.setResposta("");
        p22.setValor(500000);
        
        Pergunta p23 = new Pergunta();
        p23.setEnunciado("");

        p23.setItens(new String[]{"A)","B)","C)","D)"});
        p23.setResposta("");
        p23.setValor(500000);
        
        perguntas500k = new Pergunta[]{p21, p22, p23}; //500K
        
        Pergunta p24 = new Pergunta();
        p24.setEnunciado("");

        p24.setItens(new String[]{"A)","B)","C)","D)"});
        p24.setResposta("");
        p24.setValor(750000);
        
        Pergunta p25 = new Pergunta();
        p25.setEnunciado("");

        p25.setItens(new String[]{"A)","B)","C)","D)"});
        p25.setResposta("");
        p25.setValor(750000);
        
        Pergunta p26 = new Pergunta();
        p26.setEnunciado("");

        p26.setItens(new String[]{"A)","B)","C)","D)"});
        p26.setResposta("");
        p26.setValor(750000);
        
        perguntas750k = new Pergunta[]{p24, p25, p26}; //750K
        
        Pergunta p27 = new Pergunta();
        p27.setEnunciado("");

        p27.setItens(new String[]{"A)","B)","C)","D)"});
        p27.setResposta("");
        p27.setValor(1000000);
        
        Pergunta p28 = new Pergunta();
        p28.setEnunciado("");

        p28.setItens(new String[]{"A)","B)","C)","D)"});
        p28.setResposta("");
        p28.setValor(1000000);
        
        Pergunta p29 = new Pergunta();
        p29.setEnunciado("");

        p29.setItens(new String[]{"A)","B)","C)","D)"});
        p29.setResposta("");
        p29.setValor(1000000);
        
    }
}
